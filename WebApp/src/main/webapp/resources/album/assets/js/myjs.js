var albumNoGlobal;

function getAlbumNo(albumNo) {
	albumNoGlobal = albumNo;
}

function deleteAlbum(){
	var ok = confirm("���� �����Ͻǰǰ���?")
	if (ok) {
		location.href="album.delete?album_no="+albumNoGlobal;
	}
}
