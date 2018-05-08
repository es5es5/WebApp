function joinCheck() {
	var idField = document.joinForm.email;
	var pwField = document.joinForm.password;
	var pwChkField = document.joinForm.password2;
	var nameField = document.joinForm.name;

	if ($("#joinIDResult").text() == "ID 중복" || isEmpty(idField)
			|| containsHangul(idField)) {
		alert("id 확인");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField) || notEquals(pwField, pwChkField)
			|| lessThan(pwField, 4) || notContains(pwField, "1234567890")
			|| notContains(pwField, "qwertyuiopasdfghjklzxcvbnm")
			|| notContains(pwField, "QWERTYUIOPASDFGHJKLZXCVBNM")) {
		alert("pw 확인");
		pwField.value = "";
		pwChkField.value = "";
		pwField.focus();
		return false;
	} else if (isEmpty(nameField)) {
		alert("이름 확인");
		nameField.value = "";
		nameField.focus();
		return false;
	} else if (isEmpty(addr1Field) || isEmpty(addr2Field)
			|| isEmpty(addr3Field)) {
		alert("주소 확인");
		addr1Field.value = "";
		addr2Field.value = "";
		addr3Field.value = "";
		addr3Field.focus();
		return false;
	} else if (isEmpty(imgField)
			|| (isNotType(imgField, ".png") && isNotType(imgField, ".gif")
					&& isNotType(imgField, ".jpg") && isNotType(imgField,
					".bmp"))) {
		alert("사진 확인");
		imgField.value = "";
		imgField.focus();
		return false;
	}
	return true;
}
function loginCheck() {
	var idField = document.loginForm.im_id;
	var pwField = document.loginForm.im_pw;

	if (isEmpty(idField)) {
		alert("id 확인");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField)) {
		alert("pw 확인");
		pwField.value = "";
		pwField.focus();
		return false;
	}
	return true;
}