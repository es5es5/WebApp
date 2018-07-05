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
			String path = request.getSession().getServletContext().getRealPath("resources/album/images/fulls");
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, "euc-kr",
					new DefaultFileRenamePolicy());

			String album_img = mr.getFilesystemName("album_img");
			album_img = URLEncoder.encode(album_img, "euc-kr");
			album_img = album_img.replace("+", " ");

			album.setAlbum_img(album_img);
			album.setAlbum_txt1(mr.getParameter("album_txt1"));
			album.setAlbum_txt2(mr.getParameter("album_txt2"));

			if (ss.getMapper(AlbumMapper.class).insertAlbum(album) == 1) {
				System.out.println("���� INSERT ����");
			} else {
				System.out.println("���� INSERT ����");
			}
		} catch (Exception e) {
			System.out.println("���� INSERT ����(DB ����)");
			e.printStackTrace();
		} finally {
		}
	}

	// JSP���� �Ķ���ͷ� �޾ƾߵȴ�.
	public void update(Album album, HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("update DAO ����");
			String path = request.getSession().getServletContext().getRealPath("resources/album/images/fulls");
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, "euc-kr", new DefaultFileRenamePolicy());
			String jins_img = mr.getFilesystemName("album_img");
			if (jins_img != null) {
				jins_img = URLEncoder.encode(jins_img, "euc-kr");
				jins_img = jins_img.replace("+", " ");
			}
			album.setAlbum_img(jins_img);
			album.setAlbum_txt1(mr.getParameter("album_txt1"));
			album.setAlbum_txt2(mr.getParameter("album_txt2"));
			album.setAlbum_no(new BigDecimal(mr.getParameter("album_no")));

			if (ss.getMapper(AlbumMapper.class).updateAlbum(album) == 1) {
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB���� ����");
		}
	}

	public void getAllAlbum(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("albumList", ss.getMapper(AlbumMapper.class).selectAlbum());
	}
	
	public void getAlbumByNo(Album album, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("getAlbumByNo DAO ����");
		request.getSession().setAttribute("getAlbum", ss.getMapper(AlbumMapper.class).getAlbumByNo(album));
	}

	public void delete(Album album, HttpServletRequest request, HttpServletResponse response) {
		try {
			if (ss.getMapper(AlbumMapper.class).deleteAlbum(album) == 0) {
				System.out.println("���� ���� ����");
			} else {
				request.setAttribute("albumList", ss.getMapper(AlbumMapper.class).deleteAlbum(album));
				System.out.println("���� ���� ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ����");
		}
	}
}
