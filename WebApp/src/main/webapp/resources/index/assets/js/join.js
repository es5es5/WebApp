function joinCheck() {
	var nameField = document.joinForm.name;
	var idField = document.joinForm.email;
	var pwField = document.joinForm.pw;
	var pwChkField = document.joinForm.pw2;

	if (isEmpty(idField) || emailCheck(idField)) {
		alert("E-MAIL 입력 오류");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField) || notEquals(pwField, pwChkField)
			|| lessThan(pwField, 4) || notContains(pwField, "1234567890")
			|| notContains(pwField, "qwertyuiopasdfghjklzxcvbnm")) {
		alert("비밀번호 확인이 다릅니다. ");
		pwField.value = "";
		pwChkField.value = "";
		pwField.focus();
		return false;
	} else if (isEmpty(nameField)) {
		alert("이름은 필수 입력입니다.");
		nameField.value = "";
		nameField.focus();
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