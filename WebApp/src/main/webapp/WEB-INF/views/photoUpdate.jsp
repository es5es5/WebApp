<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="resources/album/assets/css/main.css" />
<link rel="stylesheet" href="resources/album/assets/css/mycss.css" />
<!-- 
<script src="resources/album/assets/js/jquery.min.js"></script>
<script src="resources/album/assets/js/jquery.poptrox.min.js"></script>
 -->
<script src="resources/album/assets/js/skel.min.js"></script>
<script src="resources/album/assets/js/util.js"></script>
<script src="resources/album/assets/js/main.js"></script>
<script src="resources/album/assets/js/check.js"></script>
<script src="resources/album/assets/js/myjs.js"></script>
<script src="resources/album/assets/js/myjs.js"></script>
<script src="resources/validCheck.js"></script>
 
<title>사진 수정</title>
</head>
<body>
<footer id="insert_photo">
		<div class="inner split">
			<div>
				<section> <img id="img_reg"> </section>
			</div>
			<div>
				<section>
				<h2>UPDATE PHOTO</h2>
				<form action="album.update.do" method="post"
					enctype="multipart/form-data" name="updatePhotoForm"
					onsubmit="updatePhotoCheck();">
					
					<div class="field half first">
					<c:forEach var="album" items="${getAlbum}">
						<input value="${album.album_no }">
					</c:forEach>
						<input type="text" name="album_txt1" id="name" placeholder="TITLE" />
					</div>
					<div>
						<input type="file" name="album_img" id="input_img">
					</div>
					<div class="field">
						<textarea name="album_txt2" id="message" rows="4"
							placeholder="A description of this photo."></textarea>
					</div>
					<ul class="actions">
						<li><input type="submit" value="UPDATE" class="special" /></li>
						<li><input type="reset" value="Reset" /></li>
					</ul>
				</form>
				</section>
			</div>
		</div>
		</footer>
</body>
</html>