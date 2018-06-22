/*
	Multiverse by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
 */
(function($) {

    skel.breakpoints({
        xlarge: '(max-width: 1680px)',
        large: '(max-width: 1280px)',
        medium: '(max-width: 980px)',
        small: '(max-width: 736px)',
        xsmall: '(max-width: 480px)'
    });

    $(function() {

        var $window = $(window),
            $body = $('body'),
            $wrapper = $('#wrapper');

        // Hack: Enable IE workarounds.
        if (skel.vars.IEVersion < 12)
            $body.addClass('ie');

        // Touch?
        if (skel.vars.mobile)
            $body.addClass('touch');

        // Transitions supported?
        if (skel.canUse('transition')) {

            // Add (and later, on load, remove) "loading" class.
            $body.addClass('loading');

            $window.on('load', function() {
                window.setTimeout(function() {
                    $body.removeClass('loading');
                }, 100);
            });

            // Prevent transitions/animations on resize.
            var resizeTimeout;

            $window.on('resize', function() {

                window.clearTimeout(resizeTimeout);

                $body.addClass('resizing');

                resizeTimeout = window.setTimeout(function() {
                    $body.removeClass('resizing');
                }, 100);

            });

        }

        // Scroll back to top.
        $window.scrollTop(0);

        // Fix: Placeholder polyfill.
        $('form').placeholder();

        // Panels.
        var $panels = $('.panel');

        $panels.each(function() {

            var $this = $(this),
                $toggles = $('[href="#' + $this.attr('id') +
                    '"]'),
                $closer = $('<div class="closer" />').appendTo(
                    $this);

            // Closer.
            $closer.on('click', function(event) {
                // alert('78');
                $this.trigger('---hide');
            });

            // Events.
            $this.on('click', function(event) {
                // alert('85');
                event.stopPropagation();
            }).on('---toggle', function() {
                // alert('89');
                if ($this.hasClass('active'))
                    $this.triggerHandler('---hide');
                else
                    $this.triggerHandler('---show');

            }).on('---show', function() {
                // alert('97');
                // Hide other content.
                if ($body.hasClass('content-active'))
                    $panels.trigger('---hide');

                // Activate content, toggles.
                $this.addClass('active');
                $toggles.addClass('active');

                // Activate body.
                $body.addClass('content-active');

            }).on('---hide', function() {
                // alert('111');

                // Deactivate content, toggles.
                $this.removeClass('active');
                $toggles.removeClass('active');

                // Deactivate body.
                $body.removeClass('content-active');

            });

            // Toggles.
            $toggles.removeAttr('href').css('cursor', 'pointer').on('click',
                function(event) {
                    // alert('127');
                    event.preventDefault();
                    event.stopPropagation();

                    $this.trigger('---toggle');

                });

        });

        // Global events.
        $body.on('click', function(event) {
            // alert('140');

            if ($body.hasClass('content-active')) {

                event.preventDefault();
                event.stopPropagation();

                $panels.trigger('---hide');

            }

        });

        $window.on('keyup', function(event) {
            // alert('155');

            if (event.keyCode == 27 && $body.hasClass('content-active')) {

                event.preventDefault();
                event.stopPropagation();

                $panels.trigger('---hide');

            }

        });

        // Header.
        var $header = $('#header');

        // Links.
        $header.find('a').each(
            function() {
                // alert('174');

                var $this = $(this),
                    href = $this.attr('href');

                // Internal link? Skip.
                if (!href || href.charAt(0) == '#')
                    return;

                // Redirect on click.
                $this.removeAttr('href').css('cursor', 'pointer').on(
                    'click',
                    function(event) {
                        // alert('189');

                        event.preventDefault();
                        event.stopPropagation();

                        window.location.href = href;

                    });

            });

        // Footer.
        var $footer = $('#footer');

        // Copyright.
        // This basically just moves the copyright line to the end of the *last*
        // sibling of its current parent
        // when the "medium" breakpoint activates, and moves it back when it
        // deactivates.
        $footer
            .find('.copyright')
            .each(
                function() {
                    // alert('207');

                    var $this = $(this),
                        $parent = $this.parent(),
                        $lastParent = $parent
                        .parent().children().last();

                    skel.on('+medium', function() {
                        // alert('215');
                        $this.appendTo($lastParent);
                    }).on('-medium', function() {
                        // alert('219');
                        $this.appendTo($parent);
                    });

                });

        // Main.
        var $main = $('#main');

        // Thumbs.
        $main
            .children('.thumb')
            .each(
                function() {
                    // alert('232');

                    var $this = $(this),
                        $image = $this.find('.image'),
                        $image_img = $image
                        .children('img'),
                        x;

                    // No image? Bail.
                    if ($image.length == 0)
                        return;

                    // Image.
                    // This sets the background of the "image" <span> to
                    // the image pointed to by its child
                    // <img> (which is then hidden). Gives us way more
                    // flexibility.

                    // Set background.
                    $image.css('background-image', 'url(' +
                        $image_img.attr('src') + ')');

                    // Set background position.
                    if (x = $image_img.data('position'))
                        $image.css('background-position', x);

                    // Hide original img.
                    $image_img.hide();

                    // Hack: IE<11 doesn't support pointer-events, which
                    // means clicks to our image never
                    // land as they're blocked by the thumbnail's
                    // caption overlay gradient. This just forces
                    // the click through to the image.
                    if (skel.vars.IEVersion < 11)
                        $this.css('cursor', 'pointer').on('click',
                            function() {
                                // alert('260');
                                $image.trigger('click');
                            });

                });

        // Poptrox.
        $main.poptrox({
            baseZIndex: 20000,
            caption: function($a) {
                var s = '';
                // alert('271');

                $a.nextAll().each(function() {
                    /* alert('274') */
                    s += this.outerHTML;
                });

                return s;

            },
            fadeSpeed: 300,
            onPopupClose: function() {
                /* album close */
                // alert('282 Close');
                $body.removeClass('modal-active');
            },
            onPopupOpen: function() {
                /* album open */
                // alert('286');
                $body.addClass('modal-active');
            },
            overlayOpacity: 0,

            popupCloserText: '',
            popupHeight: 150,
            popupLoaderText: '',
            popupSpeed: 300,
            popupWidth: 150,
            selector: '.thumb > a.image',
            usePopupCaption: true,
            usePopupCloser: true,	// 클로저 설정
            usePopupDefaultStyling: false,
            usePopupForceClose: true,
            usePopupLoader: true,
            usePopupNav: true,
            useDeleteButton: true,
            windowMargin: 50
        });

        // Hack: Set margins to 0 when 'xsmall' activates.
        skel.on('-xsmall', function() {
            // alert('308');
            $main[0]._poptrox.windowMargin = 50;
        }).on('+xsmall', function() {
            // alert('312');
            $main[0]._poptrox.windowMargin = 0;
        });

    });

})(jQuery);