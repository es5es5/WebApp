function insertPhotoCheck() {
	var txt1Field = document.insertPhotoForm.txt1;
	var txt2Field = document.insertPhotoForm.txt2;
	var imgField = document.insertPhotoForm.img;

	if (isEmpty(imgField) || (isNotType(imgField, ".png") && isNotType(imgField, ".gif") && isNotType(imgField, ".jpg") && isNotType(imgField, ".bmp"))) {
		alert("Check Photo File.")
		imgField.value = "";
		imgField.focus();
		return false;
	}
	return true;
}