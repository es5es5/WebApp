package com.lhw.jins;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhw.jins.album.AlbumDAO;

@Controller
public class HomeController {
	@Autowired
	private HomeDAO hDAO;
	
	@Autowired
	private AlbumDAO aDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/index.go", method = RequestMethod.GET)
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/album.go", method = RequestMethod.GET)
	public String goAlbum(HttpServletRequest request, HttpServletResponse response) {
		aDAO.getAllAlbum(request, response);
		return "album";
	}
	
	@RequestMapping(value = "/stupid_kokutaho.go", method = RequestMethod.GET)
	public String gokkth(HttpServletRequest request, HttpServletResponse response) {
		return "kkth";
	}
	

}
