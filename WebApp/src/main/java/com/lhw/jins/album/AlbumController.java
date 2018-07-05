package com.lhw.jins.album;

import java.util.concurrent.SynchronousQueue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhw.jins.member.MemberDAO;

@Controller
public class AlbumController {
	@Autowired
	private MemberDAO mDAO;

	@Autowired
	private AlbumDAO aDAO;

	// 로그인 Check 구현 필요
	@RequestMapping(value = "/album.insert", method = RequestMethod.POST)
	public String albumInsert(Album album, HttpServletRequest request, HttpServletResponse response) {
		// if (mDAO.loginCheck(request, respond)) {}
		// sDAO.writeSNSMsg(sm, request, respond);

		// sDAO.getAllSNSMsg(request, respond);
		// request.getSession().setAttribute("contentPage", "home.jsp");
		// cDAO.getMsg(request, respond);
		// return "index";

		aDAO.insert(album, request, response);
		aDAO.getAllAlbum(request, response);
		return "album";
	}
	
	// 로그인 Check 구현 필요
	@RequestMapping(value = "/album.update.go", method = RequestMethod.GET)
	public String goUpdate(Album album, HttpServletRequest request, HttpServletResponse response) {
		aDAO.getAlbumByNo(album, request, response);
		System.out.println(album.getAlbum_no() + "앨범 넘버에요~~~~");
		return "photoUpdate";
	}
	
	@RequestMapping(value = "/album.update.do", method = RequestMethod.POST)
	public void doUpdate(Album album, HttpServletRequest request, HttpServletResponse response) {
		aDAO.update(album, request, response);
	}
	
	// 비동기식으로 구현해야될 필요가 있음.
	@RequestMapping(value = "/album.delete", method = RequestMethod.GET)
	public String albumDelete(Album album, HttpServletRequest request, HttpServletResponse response) {
		aDAO.delete(album, request, response);
		aDAO.getAllAlbum(request, response);
		return "album";
	}
}
