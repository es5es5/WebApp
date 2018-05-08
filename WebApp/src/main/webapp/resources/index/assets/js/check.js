function loginCheck() {
	var idField = document.loginForm.username;
	var pwField = document.loginForm.password;

	alert("in to the check.js");
	if (isEmpty(idField)) {
		alert("ID를 입력하세요.");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField)) {
		alert("PW를 입력하세요.");
		pwField.value = "";
		pwField.focus();
		return false;
	}
	return true;
}
