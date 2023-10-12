package com.java.rms;

public class Vendor {
	private int venid;
	private String venname;
	private String venphnno;
	private String venusername;
	private String venpassword;
	private String venemail;
	public int getVenid() {
		return venid;
	}
	public void setVenid(int venid) {
		this.venid = venid;
	}
	public String getVenname() {
		return venname;
	}
	public void setVenname(String venname) {
		this.venname = venname;
	}
	public String getVenphnno() {
		return venphnno;
	}
	public void setVenphnno(String venphnno) {
		this.venphnno = venphnno;
	}
	public String getVenusername() {
		return venusername;
	}
	public void setVenusername(String venusername) {
		this.venusername = venusername;
	}
	public String getVenpassword() {
		return venpassword;
	}
	public void setVenpassword(String venpassword) {
		this.venpassword = venpassword;
	}
	public String getVenemail() {
		return venemail;
	}
	public void setVenemail(String venemail) {
		this.venemail = venemail;
	}
	@Override
	public String toString() {
		return "Vendor [venid=" + venid + ", venname=" + venname + ", venphnno=" + venphnno + ", venusername="
				+ venusername + ", venpassword=" + venpassword + ", venemail=" + venemail + "]";
	}
	public Vendor(int venid, String venname, String venphnno, String venusername, String venpassword, String venemail) {
		super();
		this.venid = venid;
		this.venname = venname;
		this.venphnno = venphnno;
		this.venusername = venusername;
		this.venpassword = venpassword;
		this.venemail = venemail;
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
