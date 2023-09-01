package com.java.thr;

import java.util.Date;

public class LeaveDetails {

	private int leaveId;
	private int empno;
	private String name;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private Date leaveAppliedOn;
	private int noOfDays;
	private LeaveType leaveType;
	private LeaveStatus leaveStatus;
	private String managerComments;
	
	// *** DaoImpl *** 
	
	// leaveAppliedOn will be today's date
	// leaveStatus by default PENDING 
	// noOfDays to be calculated automatically
	// leaveid autoincrement 
	
	// *** BAL *** 
	
	// LeaveStartDate cannot be yesterday's date
	// LeaveEndDate cannot be yesterday's date
	// LeaveEndDate Greater than or equals to leaveStartDate 
	// noOfDays cannot be more than 10 
	
}
