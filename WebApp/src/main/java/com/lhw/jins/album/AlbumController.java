package com.lhw.jins.album;

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

	// �α��� Check ���� �ʿ�
	@RequestMapping(value = "/album.insert", method = RequestMethod.POST)
	public String albumInsert(Album album, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("��Ʈ�ѷ� ����");
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
	
	// �α��� Check ���� �ʿ�
	@RequestMapping(value = "/album.update.go", method = RequestMethod.GET)
	public String DoUpdate(Album album, HttpServletRequest request, HttpServletResponse response) {
//		if (mDAO.loginCheck(req, res)) {
//			sDAO.updateSNSMsg(sm, req, res);
//		}
//		sDAO.getAllSNSMsg(req, res);
//		req.getSession().setAttribute("contentPage", "home.jsp");
//		cDAO.getMsg(req, res);
//		return "index";

		return "photoUpdate";
	}
	
	@RequestMapping(value = "/album.update.do", method = RequestMethod.POST)
	public String GoUpdate(Album album, HttpServletRequest request, HttpServletResponse response) {
		aDAO.update(album, request, response);
		return "photoUpdate";
	}
	
	// �񵿱������ �����ؾߵ� �ʿ䰡 ����.
	@RequestMapping(value = "/album.delete", method = RequestMethod.GET)
	public String albumDelete(Album album, HttpServletRequest request, HttpServletResponse response) {
		aDAO.delete(album, request, response);
		aDAO.getAllAlbum(request, response);
		return "album";
	}
}
