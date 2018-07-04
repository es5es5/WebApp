<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>멍멍이랑 냥냥이</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="resources/index/assets/css/main.css" />
<link rel="stylesheet" href="resources/index/assets/css/mycss.css" />
<!-- Scripts -->
<script src="assets/index/js/jquery.min.js"></script>
<script src="assets/index/js/jquery.scrolly.min.js"></script>
<script src="assets/index/js/skel.min.js"></script>
<script src="assets/index/js/util.js"></script>
<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
<script src="assets/index/js/main.js"></script>
</head>
<body>

	<!-- Show Login Member -->
	<div id="showLoginMember">
	${sessionScope.loginMember.email }가 로그인 됐습니다.
	</div>

	<!-- Header -->
	<section id="header">
	<div class="inner">
		<a href="index.go" id="mainCloud"><span
			class="icon major fa-cloud"></span></a>
		<h1>
			Hello! &nbsp; I'm <strong>JinsLover</strong>♥
		</h1>
		<p>
			Place to save the memories of moment.<br />
		</p>
		<ul class="actions">
			<li><a href="album.go" class="button scrolly">Come in</a></li>
		</ul>
	</div>
	</section>

	<!-- #### One ####	-->
	<section id="one" class="main style1">
	<div class="container">
		<div class="row 150%">
			<div class="6u 12u$(medium)">
				<header class="major">
				<h2>
					Tis the most tender part of love, each other to forgive. <br />
				</h2>
				</header>
				<p>John Sheffield.</p>
				<a href="stupid_kokutaho.go" onclick="window.open(this.href, '개발바닥 이시니스 결제창인증','width=600, height=700');return false;" target="_blank">고금천 바보 ㅡㅡ</a>
			</div>
			<div class="6u$ 12u$(medium) important(medium)">
				<span class="image fit"><img
					src="resources/index/images/yo.jpg" alt="" /></span>
			</div>
		</div>
	</div>
	</section>

	<!-- #### Two ####
	<section id="two" class="main style2">
	<div class="container">
		<div class="row 150%">
			<div class="6u 12u$(medium)">
				<ul class="major-icons">
					<li><span class="icon style1 major fa-code"></span></li>
					<li><span class="icon style2 major fa-bolt"></span></li>
					<li><span class="icon style3 major fa-camera-retro"></span></li>
					<li><span class="icon style4 major fa-cog"></span></li>
					<li><span class="icon style5 major fa-desktop"></span></li>
					<li><span class="icon style6 major fa-calendar"></span></li>
				</ul>
			</div>
			<div class="6u$ 12u$(medium)">
				<header class="major">
				<h2>
					Lorem ipsum dolor adipiscing<br /> amet dolor consequat
				</h2>
				</header>
				<p>Adipiscing a commodo ante nunc accumsan interdum mi ante
					adipiscing. A nunc lobortis non nisl amet vis volutpat aclacus
					nascetur ac non. Lorem curae eu ante amet sapien in tempus ac.
					Adipiscing id accumsan adipiscing ipsum.</p>
				<p>Blandit faucibus proin. Ac aliquam integer adipiscing enim
					non praesent vis commodo nunc phasellus cubilia ac risus accumsan.
					Accumsan blandit. Lobortis phasellus non lobortis dit varius mi
					varius accumsan lobortis. Blandit ante aliquam lacinia lorem
					lobortis semper morbi col faucibus vitae integer placerat accumsan
					orci eu mi odio tempus adipiscing adipiscing adipiscing curae
					consequat feugiat etiam dolore.</p>
				<p>Adipiscing a commodo ante nunc accumsan interdum mi ante
					adipiscing. A nunc lobortis non nisl amet vis volutpat aclacus
					nascetur ac non. Lorem curae eu ante amet sapien in tempus ac.
					Adipiscing id accumsan adipiscing ipsum.</p>
			</div>
		</div>
	</div>
	</section>
	 -->

	<!-- #### Three ####
	<section id="three" class="main style1 special">
	<div class="container">
		<header class="major">
		<h2>Adipiscing amet consequat</h2>
		</header>
		<p>Ante nunc accumsan et aclacus nascetur ac ante amet sapien sed.</p>
		<div class="row 150%">
			<div class="4u 12u$(medium)">
				<span class="image fit"><img src="images/pic02.jpg" alt="" /></span>
				<h3>Magna feugiat lorem</h3>
				<p>Adipiscing a commodo ante nunc magna lorem et interdum mi
					ante nunc lobortis non amet vis sed volutpat et nascetur.</p>
				<ul class="actions">
					<li><a href="#" class="button">More</a></li>
				</ul>
			</div>
			<div class="4u 12u$(medium)">
				<span class="image fit"><img src="images/pic03.jpg" alt="" /></span>
				<h3>Magna feugiat lorem</h3>
				<p>Adipiscing a commodo ante nunc magna lorem et interdum mi
					ante nunc lobortis non amet vis sed volutpat et nascetur.</p>
				<ul class="actions">
					<li><a href="#" class="button">More</a></li>
				</ul>
			</div>
			<div class="4u$ 12u$(medium)">
				<span class="image fit"><img src="images/pic04.jpg" alt="" /></span>
				<h3>Magna feugiat lorem</h3>
				<p>Adipiscing a commodo ante nunc magna lorem et interdum mi
					ante nunc lobortis non amet vis sed volutpat et nascetur.</p>
				<ul class="actions">
					<li><a href="#" class="button">More</a></li>
				</ul>
			</div>
		</div>
	</div>
	</section>
	 -->

	<!-- #### Four ####
	 -->
	<section id="four" class="main style2 special">
	<div class="container">
		<header class="major">
		<h2>Join Us?</h2>
		</header>
		<p>Place to save the memories of moment.</p>
		<ul class="actions uniform">
			<li><a href="join.go" class="button special">JOIN</a></li>
			<li><a href="login.go" class="button special">LOGIN</a></li>
			<!-- 
			<li><a href="#" class="button">Learn More</a></li>
			 -->
		</ul>
	</div>
	</section>

	<!-- #### Footer #### -->
	<section id="footer">
	<ul class="icons">
		<li><a href="#" class="icon alt fa-twitter"><span
				class="label">Twitter</span></a></li>
		<li><a href="https://www.facebook.com/WebDevShare/"
			class="icon alt fa-facebook" target="_blank"><span class="label">Facebook</span></a></li>
		<li><a href="#" class="icon alt fa-instagram"><span
				class="label">Instagram</span></a></li>
		<li><a href="https://github.com/es5es5"
			class="icon alt fa-github" target="_blank"><span class="label">GitHub</span></a></li>
		<li><a href="mailto:essess1541@gmail.com"
			class="icon alt fa-envelope"><span class="label">Email</span></a></li>
	</ul>
	<ul class="copyright">
		<li>&copy; <a href="#top">JinsLover♥</a></li>
		<li>Design : <a href="http://html5up.net" target="_blank">HTML5
				UP</a></li>
	</ul>
	</section>
</body>
</html>