package com.lhw.jins.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhw.jins.HomeDAO;

@Controller
public class MemberController {
	@Autowired
	private HomeDAO hDAO;
	
	@Autowired
	private MemberDAO mDAO;
	

	@RequestMapping(value = "/login.go", method = RequestMethod.GET)
	public String goLogin(HttpServletRequest request, HttpServletResponse response) {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@RequestMapping(value = "/join.go", method = RequestMethod.GET)
	public String goJoin(HttpServletRequest request, HttpServletResponse response) {
		return "join";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String doJoin(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}
}
