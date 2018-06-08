package com.lhw.jins.album;

import java.math.BigDecimal;
import java.util.Date;

public class Album {
	private BigDecimal album_no;
	private String album_img;
	private Date album_date;
	private String album_txt1;
	private String album_txt2;
	
	public Album() {
		// TODO Auto-generated constructor stub
	}

	public Album(BigDecimal album_no, String album_img, Date album_date, String album_txt1, String album_txt2) {
		super();
		this.album_no = album_no;
		this.album_img = album_img;
		this.album_date = album_date;
		this.album_txt1 = album_txt1;
		this.album_txt2 = album_txt2;
	}

	public BigDecimal getAlbum_no() {
		return album_no;
	}

	public void setAlbum_no(BigDecimal album_no) {
		this.album_no = album_no;
	}

	public String getAlbum_img() {
		return album_img;
	}

	public void setAlbum_img(String album_img) {
		this.album_img = album_img;
	}

	public Date getAlbum_date() {
		return album_date;
	}

	public void setAlbum_date(Date album_date) {
		this.album_date = album_date;
	}

	public String getAlbum_txt1() {
		return album_txt1;
	}

	public void setAlbum_txt1(String album_txt1) {
		this.album_txt1 = album_txt1;
	}

	public String getAlbum_txt2() {
		return album_txt2;
	}

	public void setAlbum_txt2(String album_txt2) {
		this.album_txt2 = album_txt2;
	}
	
	
}
