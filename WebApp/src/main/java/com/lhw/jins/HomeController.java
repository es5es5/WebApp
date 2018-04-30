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
	
	@RequestMapping(value = "/index.go", method = RequestMethod.GET)
	public String goIndex() {
		return "index";
	}

	@RequestMapping(value = "/login.go", method = RequestMethod.GET)
	public String goLogin(HttpServletRequest request, HttpServletResponse response) {
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}
	
	@RequestMapping(value = "/album.go", method = RequestMethod.GET)
	public String goAlbum(HttpServletRequest request, HttpServletResponse response) {
		return "album";
	}
	
	@RequestMapping(value = "/join.go", method = RequestMethod.GET)
	public String goJoin(HttpServletRequest request, HttpServletResponse response) {
		return "join";
	}
}
