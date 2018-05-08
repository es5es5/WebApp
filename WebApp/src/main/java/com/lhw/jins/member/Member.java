package com.lhw.jins.member;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member {

	private String name;
	private String email;
	private String pw;
	private String pw2;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name, String email, String pw, String pw2) {
		super();
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw2 = pw2;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	@XmlElement
	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw2() {
		return pw2;
	}

	@XmlElement
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	
}
