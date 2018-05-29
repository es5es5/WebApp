package com.lhw.jins.album;

import java.math.BigDecimal;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class AlbumDAO {

	@Autowired
	private SqlSession ss;

	public void insert(Album album, HttpServletRequest request, HttpServletResponse response) {
		try {
			String path = request.getSession().getServletContext().getRealPath("resource/album/images/fulls");
			MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "euc-kr",
					new DefaultFileRenamePolicy());

			String album_img = mr.getFilesystemName("album_img");
			album_img = URLEncoder.encode(album_img, "euc-kr");
			album_img = album_img.replace("+", " ");

			album.setAlbum_img(album_img);
			album.setAlbum_txt(mr.getParameter("album_txt"));

			if (ss.getMapper(AlbumMapper.class).insertAlbum(album) == 1) {
				System.out.println("사진 INSERT 성공");
			} else {
				System.out.println("사진 INSERT 실패");
			}
		} catch (Exception e) {
			System.out.println("사진 INSERT 실패");
			e.printStackTrace();
		} finally {
		}
	}
}
