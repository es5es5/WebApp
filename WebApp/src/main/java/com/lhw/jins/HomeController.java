package com.lhw.jins;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private HomeDAO hDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/discover.home", method = RequestMethod.GET)
	public String discoverHome(HttpServletRequest request, HttpServletResponse response) {
		hDAO.discoverHome(request, response);
		// mDAO.loginCheck(req, res);
		// sDAO.getAllSNSMsg(req, res);
		// req.getSession().setAttribute("contentPage", "home.jsp");
		// cDAO.getMsg(req, res);
		return "index";
	}
}
