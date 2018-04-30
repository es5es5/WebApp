package com.lhw.jins.member;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Member {

	private String jm_id;
	private String jm_pw;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String jm_id, String jm_pw) {
		super();
		this.jm_id = jm_id;
		this.jm_pw = jm_pw;
	}

	public String getJm_id() {
		return jm_id;
	}

	@XmlElement
	public void setJm_id(String jm_id) {
		this.jm_id = jm_id;
	}

	public String getJm_pw() {
		return jm_pw;
	}

	@XmlElement
	public void setJm_pw(String jm_pw) {
		this.jm_pw = jm_pw;
	}
}
