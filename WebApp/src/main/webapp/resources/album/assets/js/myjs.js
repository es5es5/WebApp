var albumNoGlobal;

function getAlbumNo(albumNo) {
	albumNoGlobal = albumNo;
}

function deleteAlbum() {
	var ok = confirm("���� �����Ͻǰǰ���?")
	if (ok) {
		location.href = "album.delete?album_no=" + albumNoGlobal;
	}
}

function updateAlbum() {
	alert(albumNoGlobal);
	window.open("album.update.go?album_no=" + albumNGlobal, 'newWin', 'height=640, width=800, menubar=no, toolbar=no, resizable=no, scrollbars=no');
}

//function closeWindow() {
//	window.close();
//}


// ���� �̹��� ���(�̸�����)
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
				alert("Ȯ���ڴ� �̹��� Ȯ���ڸ� �����մϴ�.");
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