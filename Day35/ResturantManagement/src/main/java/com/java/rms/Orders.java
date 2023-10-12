package com.java.rms;

import java.sql.Date;

public class Orders {
	private int ordid;
	private int cusid;
	private int venid;
	private String walsource;
	private int menid;
	private Date orddate;
	private int ordquantity;
	private double ordbillamount;
	private Ordstatus ordstatus;
	private String ordcomments;
	
	public Orders() {
		super();
	}

	public Orders(int ordid, int cusid, int venid, String walsource, int menid, Date orddate, int ordquantity,
			double ordbillamount, Ordstatus ordstatus, String ordcomments) {
		super();
		this.ordid = ordid;
		this.cusid = cusid;
		this.venid = venid;
		this.walsource = walsource;
		this.menid = menid;
		this.orddate = orddate;
		this.ordquantity = ordquantity;
		this.ordbillamount = ordbillamount;
		this.ordstatus = ordstatus;
		this.ordcomments = ordcomments;
	}

	@Override
	public String toString() {
		return "Orders [ordid=" + ordid + ", cusid=" + cusid + ", venid=" + venid + ", walsource=" + walsource
				+ ", menid=" + menid + ", orddate=" + orddate + ", ordquantity=" + ordquantity + ", ordbillamount="
				+ ordbillamount + ", ordstatus=" + ordstatus + ", ordcomments=" + ordcomments + "]";
	}

	public int getOrdid() {
		return ordid;
	}

	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public int getVenid() {
		return venid;
	}

	public void setVenid(int venid) {
		this.venid = venid;
	}

	public String getWalsource() {
		return walsource;
	}

	public void setWalsource(String walsource) {
		this.walsource = walsource;
	}

	public int getMenid() {
		return menid;
	}

	public void setMenid(int menid) {
		this.menid = menid;
	}

	public Date getOrddate() {
		return orddate;
	}

	public void setOrddate(Date orddate) {
		this.orddate = orddate;
	}

	public int getOrdquantity() {
		return ordquantity;
	}

	public void setOrdquantity(int ordquantity) {
		this.ordquantity = ordquantity;
	}

	public double getOrdbillamount() {
		return ordbillamount;
	}

	public void setOrdbillamount(double ordbillamount) {
		this.ordbillamount = ordbillamount;
	}

	public Ordstatus getOrdstatus() {
		return ordstatus;
	}

	public void setOrdstatus(Ordstatus ordstatus) {
		this.ordstatus = ordstatus;
	}

	public String getOrdcomments() {
		return ordcomments;
	}

	public void setOrdcomments(String ordcomments) {
		this.ordcomments = ordcomments;
	}
	
	
}
