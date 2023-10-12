package com.java.rms;

public class Customer {
	private int cusid;
	private String cusname;
	private String cusphnno;
	private String cususername;
	private String cuspassword;
	private String cusemail;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cusid, String cusname, String cusphnno, String cususername, String cuspassword,
			String cusemail) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.cusphnno = cusphnno;
		this.cususername = cususername;
		this.cuspassword = cuspassword;
		this.cusemail = cusemail;
	}
	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", cusphnno=" + cusphnno + ", cususername="
				+ cususername + ", cuspassword=" + cuspassword + ", cusemail=" + cusemail + "]";
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCusphnno() {
		return cusphnno;
	}
	public void setCusphnno(String cusphnno) {
		this.cusphnno = cusphnno;
	}
	public String getCususername() {
		return cususername;
	}
	public void setCususername(String cususername) {
		this.cususername = cususername;
	}
	public String getCuspassword() {
		return cuspassword;
	}
	public void setCuspassword(String cuspassword) {
		this.cuspassword = cuspassword;
	}
	public String getCusemail() {
		return cusemail;
	}
	public void setCusemail(String cusemail) {
		this.cusemail = cusemail;
	}
}
