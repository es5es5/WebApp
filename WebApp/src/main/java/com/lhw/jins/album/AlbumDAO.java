package com.lhw.jins.album;

import java.net.URLEncoder;
import java.util.List;

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
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, // 30*1024*1024
					"euc-kr", new DefaultFileRenamePolicy());

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

	// JSP에서 파라미터로 받아야된다.
	public void update(Album album, HttpServletRequest request, HttpServletResponse response) {
		try {
			String path = request.getSession().getServletContext().getRealPath("resource/album/images/fulls");
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, // 30*1024*1024
					"euc-kr", new DefaultFileRenamePolicy());
			String jins_img = mr.getFilesystemName("im_img");
			if (jins_img != null) {
				jins_img = URLEncoder.encode(jins_img, "euc-kr");
				jins_img = jins_img.replace("+", " ");
			}
			album.setAlbum_img(jins_img);
			album.setAlbum_txt(mr.getParameter("jins_txt"));
			
			if (ss.getMapper(AlbumMapper.class).updateAlbum(album) == 1) {
				System.out.println("사진 수정 성공");
			} else {
				System.out.println("사진 수정 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB서버 문제");
		}
	}
	
	public void showAllAlbum(HttpServletRequest request, HttpServletResponse response) {
		List<Album> albumList = ss.getMapper(AlbumMapper.class).selectAlbum();
		request.setAttribute("albumList", albumList);
	}
	
	public void delete(Album album, HttpServletRequest request, HttpServletResponse response) {
		
	}
}
