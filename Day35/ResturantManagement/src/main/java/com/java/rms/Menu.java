package com.java.rms;

public class Menu {
	private int menid;
	private String menitem;
	private double menprice;
	private int restaurantid;
	private double mencalories;
	private String menspeciality;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int menid, String menitem, double menprice, int restaurantid, double mencalories,
			String menspeciality) {
		super();
		this.menid = menid;
		this.menitem = menitem;
		this.menprice = menprice;
		this.restaurantid = restaurantid;
		this.mencalories = mencalories;
		this.menspeciality = menspeciality;
	}
	@Override
	public String toString() {
		return "Menu [menid=" + menid + ", menitem=" + menitem + ", menprice=" + menprice + ", restaurantid="
				+ restaurantid + ", mencalories=" + mencalories + ", menspeciality=" + menspeciality + "]";
	}
	public int getMenid() {
		return menid;
	}
	public void setMenid(int menid) {
		this.menid = menid;
	}
	public String getMenitem() {
		return menitem;
	}
	public void setMenitem(String menitem) {
		this.menitem = menitem;
	}
	public double getMenprice() {
		return menprice;
	}
	public void setMenprice(double menprice) {
		this.menprice = menprice;
	}
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	public double getMencalories() {
		return mencalories;
	}
	public void setMencalories(double mencalories) {
		this.mencalories = mencalories;
	}
	public String getMenspeciality() {
		return menspeciality;
	}
	public void setMenspeciality(String menspeciality) {
		this.menspeciality = menspeciality;
	}
}
