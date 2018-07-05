package com.lhw.jins.album;

import java.util.List;

public interface AlbumMapper {
	public abstract int insertAlbum(Album album);
	public abstract int updateAlbum(Album album);
	public abstract int deleteAlbum(Album album);
	public abstract List<Album> getAlbumByNo(Album album);
	public abstract List<Album> selectAlbum();
}
