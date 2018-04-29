<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<head>
<title>港港捞尔 成成捞</title>
<meta name="description" content="slick Login">
<meta name="author" content="Webdesigntuts+">
<link rel="stylesheet" type="text/css"
	href="resources/index/assets/css/login.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://www.modernizr.com/downloads/modernizr-latest.js"></script>
<script type="text/javascript" src="resources/index/assets/js/login.js"></script>
<script type="text/javascript" src="resources/index/assets/js/check.js"></script>

</head>
<body>
	<form id="slick-login" action="login.do" method="post" name="loginForm" onsubmit="return loginCheck();">
		<label for="username">ID</label><input type="text"
			name="username" class="placeholder" placeholder="username@jinslover.com" autofocus="autofocus">
		<label for="password">PASSWORD</label><input type="password"
			name="password" class="placeholder" placeholder="password"> <input
			type="submit" value="Sign In">
	</form>
</body>
</html>