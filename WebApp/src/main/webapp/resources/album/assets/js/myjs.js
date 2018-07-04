var albumNoGlobal;

function getAlbumNo(albumNo) {
	albumNoGlobal = albumNo;
}

function deleteAlbum() {
	var ok = confirm("사진 삭제하실건가요?")
	if (ok) {
		location.href = "album.delete?album_no=" + albumNoGlobal;
	}
}

function updateAlbum() {
	window.open('album.update.go', 'Update Photo', 'height=400, width=300, resizable=no, scrollbars=no');
}

// 메인 이미지 등록(미리보기)
function ad_productMainImgReg_Click() {
	var sel_file;

	$(function() {
		$("#input_img").on("change", handleImgFileSelect);
	});

	function handleImgFileSelect(e) {
		var files = e.target.files;
		var filesArr = Array.prototype.slice.call(files);

		filesArr.forEach(function(f) {
			if (!f.type.match("image.*")) {
				alert("확장자는 이미지 확장자만 가능합니다.");
				return;
			}

			sel_file = f;

			var reader = new FileReader();
			reader.onload = function(e) {
				$("#img_reg").attr("src", e.target.result);
			}
			reader.readAsDataURL(f);
		});
	}
}