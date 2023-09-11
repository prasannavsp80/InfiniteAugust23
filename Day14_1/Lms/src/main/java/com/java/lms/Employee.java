package com.java.lms;

import java.sql.Date;

public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private String mobileNo;
	private Date dateOfJoin;
	private int managerId;
	private int leaveAvail;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", mobileNo=" + mobileNo
				+ ", dateOfJoin=" + dateOfJoin + ", managerId=" + managerId + ", leaveAvail=" + leaveAvail + "]";
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getDateOfJoin() {
		return dateOfJoin;
	}


	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public int getLeaveAvail() {
		return leaveAvail;
	}


	public void setLeaveAvail(int leaveAvail) {
		this.leaveAvail = leaveAvail;
	}


	public Employee() {

	}


	public Employee(int empId, String empName, String empEmail, String mobileNo, Date dateOfJoin, int managerId,
			int leaveAvail) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.mobileNo = mobileNo;
		this.dateOfJoin = dateOfJoin;
		this.managerId = managerId;
		this.leaveAvail = leaveAvail;
	}
	
	
}
