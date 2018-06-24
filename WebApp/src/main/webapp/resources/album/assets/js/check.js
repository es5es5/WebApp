function insertPhotoCheck() {
	var txt1Field = document.insertPhotoForm.album_txt1;
	var txt2Field = document.insertPhotoForm.album_txt2;
	var imgField = document.insertPhotoForm.album_img;

	if (isEmpty(imgField) || (isNotType(imgField, ".png") && isNotType(imgField, ".gif") && isNotType(imgField, ".jpg") && isNotType(imgField, ".bmp"))) {
		alert("Check Photo File.")
		imgField.value = "";
		imgField.focus();
		return false;
	}
	return true;
}

function deletePhoto(album_no) {
	var ok = confirm("진짜?");
	if (ok) {
		location.href = "album.delete?album_no=" + album_no;
	}
}