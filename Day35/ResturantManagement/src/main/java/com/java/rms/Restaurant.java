package com.java.rms;

public class Restaurant {
	private int Restaurant_ID;
	private String Restaurant_Name;
	private String Branch;
	private String City;
	private String MobileNo;
	private String Email;
	private String Rating;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int restaurant_ID, String restaurant_Name, String branch, String city, String mobileNo,
			String email, String rating) {
		super();
		Restaurant_ID = restaurant_ID;
		Restaurant_Name = restaurant_Name;
		Branch = branch;
		City = city;
		MobileNo = mobileNo;
		Email = email;
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [Restaurant_ID=" + Restaurant_ID + ", Restaurant_Name=" + Restaurant_Name + ", Branch="
				+ Branch + ", City=" + City + ", MobileNo=" + MobileNo + ", Email=" + Email + ", Rating=" + Rating
				+ "]";
	}
	public int getRestaurant_ID() {
		return Restaurant_ID;
	}
	public void setRestaurant_ID(int restaurant_ID) {
		Restaurant_ID = restaurant_ID;
	}
	public String getRestaurant_Name() {
		return Restaurant_Name;
	}
	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
}
