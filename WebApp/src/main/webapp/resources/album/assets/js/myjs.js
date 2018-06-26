var albumNoGlobal;

function getAlbumNo(albumNo) {
	albumNoGlobal = albumNo;
}

function deleteAlbum(){
	var ok = confirm("사진 삭제하실건가요?")
	if (ok) {
		location.href="album.delete?album_no="+albumNoGlobal;
	}
}
