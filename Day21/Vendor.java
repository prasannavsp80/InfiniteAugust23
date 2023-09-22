package com.java.employ;

import java.util.Date;
import java.util.Objects;

public class Vendor {

	private int vendorId;
	private String vendorName;
	private String vendorCity;
	private String vendorEmail;
	private String vendorMobile;
	private String vendorStatus;
	private Date vendorStartedDate;
	private double vendorRating;
	private String vendorReview;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCity() {
		return vendorCity;
	}
	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public String getVendorMobile() {
		return vendorMobile;
	}
	public void setVendorMobile(String vendorMobile) {
		this.vendorMobile = vendorMobile;
	}
	public String getVendorStatus() {
		return vendorStatus;
	}
	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}
	public Date getVendorStartedDate() {
		return vendorStartedDate;
	}
	public void setVendorStartedDate(Date vendorStartedDate) {
		this.vendorStartedDate = vendorStartedDate;
	}
	public double getVendorRating() {
		return vendorRating;
	}
	public void setVendorRating(double vendorRating) {
		this.vendorRating = vendorRating;
	}
	public String getVendorReview() {
		return vendorReview;
	}
	public void setVendorReview(String vendorReview) {
		this.vendorReview = vendorReview;
	}
	public Vendor(int vendorId, String vendorName, String vendorCity, String vendorEmail, String vendorMobile,
			String vendorStatus, Date vendorStartedDate, double vendorRating, String vendorReview) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorCity = vendorCity;
		this.vendorEmail = vendorEmail;
		this.vendorMobile = vendorMobile;
		this.vendorStatus = vendorStatus;
		this.vendorStartedDate = vendorStartedDate;
		this.vendorRating = vendorRating;
		this.vendorReview = vendorReview;
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorCity=" + vendorCity
				+ ", vendorEmail=" + vendorEmail + ", vendorMobile=" + vendorMobile + ", vendorStatus=" + vendorStatus
				+ ", vendorStartedDate=" + vendorStartedDate + ", vendorRating=" + vendorRating + ", vendorReview="
				+ vendorReview + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(vendorId, vendorName, vendorCity, vendorEmail, vendorMobile,
				vendorStatus, vendorStartedDate, vendorRating, vendorReview);
	}
	
	@Override
	public boolean equals(Object obj) {
		Vendor vendor = (Vendor)obj;
		if (vendor==null) {
			return false;
		} 
		if (vendor.getVendorId()==vendorId && vendor.getVendorName().equals(vendorName) 
			&& vendor.getVendorCity().equals(vendorCity) && vendor.getVendorEmail().equals(vendorEmail)
			&& vendor.getVendorMobile().equals(vendorMobile) && vendor.getVendorStatus().equals(vendorStatus)
			&& vendor.getVendorStartedDate()==vendorStartedDate && 
			vendor.getVendorRating() == vendorRating && 
			vendor.getVendorReview().equals(vendorReview)
				) {
			return true;
		}
		return false;
	}
}
