function loginCheck() {
	var idField = document.loginForm.username;
	var pwField = document.loginForm.password;
	if (isEmpty(idField)) {
		alert("ID�� �Է��ϼ���.");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField)) {
		alert("��й�ȣ�� �Է��ϼ���.");
		pwField.value = "";
		pwField.focus();
		return false;
	}
	return true;
}
