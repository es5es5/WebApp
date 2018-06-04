package com.lhw.jins.album;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhw.jins.member.MemberDAO;

public class AlbumController {
	@Autowired
	private MemberDAO mDAO;

	@Autowired
	private AlbumDAO aDAO;

	@RequestMapping(value = "/album.insert", method = RequestMethod.GET)
	public String albumInsert(Album album, HttpServletRequest request, HttpServletResponse response) {

		// 로그인 Check 구현 예정
		// if (mDAO.loginCheck(request, respond)) {}
		// sDAO.writeSNSMsg(sm, request, respond);

		// sDAO.getAllSNSMsg(request, respond);
		// request.getSession().setAttribute("contentPage", "home.jsp");
		// cDAO.getMsg(request, respond);
		// return "index";

		aDAO.insert(album, request, response);
		return "index";
	}
	
	@RequestMapping(value = "/album.update", method = RequestMethod.GET)
	public String albumUpdate(Album album, HttpServletRequest request, HttpServletResponse response) {

//		if (mDAO.loginCheck(req, res)) {
//			sDAO.updateSNSMsg(sm, req, res);
//		}
//		sDAO.getAllSNSMsg(req, res);
//		req.getSession().setAttribute("contentPage", "home.jsp");
//		cDAO.getMsg(req, res);
//		return "index";

		aDAO.update(album, request, response);
		return "index";
	}
	
	@RequestMapping(value = "/album.delete", method = RequestMethod.GET)
	public String albumDelete(Album album, HttpServletRequest request, HttpServletResponse response) {

//		if (mDAO.loginCheck(req, res)) {
//			sDAO.deleteSNSRepl(sr, req, res);
//		}
//		sDAO.getAllSNSMsg(req, res);
//		req.getSession().setAttribute("contentPage", "home.jsp");
//		cDAO.getMsg(req, res);
//		return "index";

		aDAO.delete(album, request, response);
		return "index";
	}
}
