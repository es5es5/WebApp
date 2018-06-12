<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>港港捞尔 成成捞</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="resources/album/assets/css/main.css" />
<link rel="stylesheet" href="resources/album/assets/css/mycss.css" />

<!-- Scripts -->
<script src="resources/album/assets/js/jquery.min.js"></script>
<script src="resources/album/assets/js/jquery.poptrox.min.js"></script>
<script src="resources/album/assets/js/skel.min.js"></script>
<script src="resources/album/assets/js/util.js"></script>
<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
<script src="resources/album/assets/js/main.js"></script>
<script src="resources/album/assets/js/myjs.js"></script>

</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
		<h1>
			<a href="index.go"><strong>JinsLover</strong>.</a>
		</h1>
		<nav>
		<ul>
			<li><a href="#insert_photo" class="icon fa-info-circle">INSERT
					PHOTO</a></li>
		</ul>
		</nav> </header>

		<!-- Main -->
		<div id="main">

			<!-- No DB 
			<article class="thumb"> <a
				href="resources/album/images/fulls/01.jpg" class="image"><img
				src="resources/album/images/fulls/01.jpg" alt="" /></a>
			<h2>Title</h2>
			<p>Something text...</p>
			<p>2018-05-05</p>
			</article>
			-->

			<!-- Using DB (DAO 眉农) -->
			<c:forEach var="album" items="${albumList }">
				<article class="thumb"> <a
					href="resources/album/images/fulls/${album.album_img }"
					class="image"><img
					src="resources/album/images/fulls/${album.album_img }" alt="" /></a>
				<h2>${album.album_txt1 }</h2>
				<p>${album.album_txt2 }</p>
				<p>${album.album_date }</p>
				</article>
			</c:forEach>

		</div>


		<!-- Insert Photo -->
		<footer id="insert_photo" class="panel">
		<div class="inner split">
			<div></div>
			<div>
				<section>
				<h2>INSERT PHOTO</h2>
				<form action="album.insert" method="post"
					enctype="multipart/form-data" name="insertPhotoForm" onsubmit="insertPhotoCheck();">
					<div class="field half first">
						<input type="text" name="txt1" id="name" placeholder="TITLE" />
					</div>
					<div class="filebox bs3-primary preview-image">
						<input type="file" name="img" id="input_file" class="upload-hidden">
					</div>
					<div class="field">
						<textarea name="txt2" id="message" rows="4"
							placeholder="A description of this photo."></textarea>
					</div>
					<ul class="actions">
						<li><input type="submit" value="INSERT" class="special" /></li>
						<li><input type="reset" value="Reset" /></li>
					</ul>
				</form>
				</section>
			</div>
		</div>
		</footer>


		<!-- Footer -->
		<footer id="footer" class="panel">
		<div class="inner split">
			<div>
				<section>
				<h2>Magna feugiat sed adipiscing</h2>
				<p>Nulla consequat, ex ut suscipit rutrum, mi dolor tincidunt
					erat, et scelerisque turpis ipsum eget quis orci mattis aliquet.
					Maecenas fringilla et ante at lorem et ipsum. Dolor nulla eu
					bibendum sapien. Donec non pharetra dui. Nulla consequat, ex ut
					suscipit rutrum, mi dolor tincidunt erat, et scelerisque turpis
					ipsum.</p>
				</section>
				<section>
				<h2>Follow me on ...</h2>
				<ul class="icons">
					<li><a href="#" class="icon fa-twitter"><span
							class="label">Twitter</span></a></li>
					<li><a href="#" class="icon fa-facebook"><span
							class="label">Facebook</span></a></li>
					<li><a href="#" class="icon fa-instagram"><span
							class="label">Instagram</span></a></li>
					<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
					<li><a href="#" class="icon fa-dribbble"><span
							class="label">Dribbble</span></a></li>
					<li><a href="#" class="icon fa-linkedin"><span
							class="label">LinkedIn</span></a></li>
				</ul>
				</section>
				<p class="copyright">
					&copy; Unttled. Design: <a href="http://html5up.net">HTML5 UP</a>.
				</p>
			</div>
			<div>
				<section>
				<h2>Get in touch</h2>
				<form method="post" action="#">
					<div class="field half first">
						<input type="text" name="name" id="name" placeholder="Name" />
					</div>
					<div class="field half">
						<input type="text" name="email" id="email" placeholder="Email" />
					</div>
					<div class="field">
						<textarea name="message" id="message" rows="4"
							placeholder="Message"></textarea>
					</div>
					<ul class="actions">
						<li><input type="submit" value="Send" class="special" /></li>
						<li><input type="reset" value="Reset" /></li>
					</ul>
				</form>
				</section>
			</div>
		</div>
		</footer>

	</div>

</body>
</html>