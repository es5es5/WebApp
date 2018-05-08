function joinCheck() {
	var nameField = document.joinForm.name;
	var idField = document.joinForm.email;
	var pwField = document.joinForm.pw;
	var pwChkField = document.joinForm.pw2;

	if (isEmpty(idField) || emailCheck(idField)) {
		alert("E-MAIL �Է� ����");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField) || notEquals(pwField, pwChkField)
			|| lessThan(pwField, 4) || notContains(pwField, "1234567890")
			|| notContains(pwField, "qwertyuiopasdfghjklzxcvbnm")) {
		alert("��й�ȣ Ȯ���� �ٸ��ϴ�. ");
		pwField.value = "";
		pwChkField.value = "";
		pwField.focus();
		return false;
	} else if (isEmpty(nameField)) {
		alert("�̸��� �ʼ� �Է��Դϴ�.");
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
		alert("id Ȯ��");
		idField.value = "";
		idField.focus();
		return false;
	} else if (isEmpty(pwField)) {
		alert("pw Ȯ��");
		pwField.value = "";
		pwField.focus();
		return false;
	}
	return true;
}