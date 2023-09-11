package com.java.lms;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplyLeaveMain {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id  ");
		leaveDetails.setEmpId(sc.nextInt());
		System.out.println("Enter Leave StartDate (yyyy-MM-dd) ");
		try {
			Date ls = sdf.parse(sc.next());
			java.sql.Date sql1 = new java.sql.Date(ls.getTime());
			leaveDetails.setLeaveStartDate(sql1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter Leave EndDate (yyyy-MM-dd) ");
		try {
			Date ls = sdf.parse(sc.next());
			java.sql.Date sql1 = new java.sql.Date(ls.getTime());
			leaveDetails.setLeaveEndDate(sql1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter LeaveType  ");
		leaveDetails.setLeaveType(LeaveType.valueOf(sc.next()));
		System.out.println("Enter Leave Reason ");
		leaveDetails.setLeaveReason(sc.next());
		try {
			System.out.println(new LeaveDAOImpl().applyLeave(leaveDetails));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
