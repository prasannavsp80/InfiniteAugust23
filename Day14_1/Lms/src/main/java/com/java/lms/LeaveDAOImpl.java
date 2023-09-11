package com.java.lms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveDAOImpl implements LeaveDetailsDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int dateDiff(Date startDate, Date endDate) {
		long ms = endDate.getTime() - startDate.getTime();
		int diff = (int)(ms/(1000 * 60 * 60 * 24));
		diff++;
		return diff;
	}
	
	@Override
	public String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException {
		System.out.println(leaveDetails);
		connection = ConnectionHelper.getConnection();
		int diff = dateDiff(leaveDetails.getLeaveStartDate(), leaveDetails.getLeaveEndDate());
		leaveDetails.setNoOfDays(diff);
		String cmd = "Insert into LeaveDetails(EmpId,LeaveStartDate,LeaveEndDate,"
				+ "noOfDays,leaveType,leaveReason) values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveDetails.getEmpId());
		pst.setDate(2, leaveDetails.getLeaveStartDate());
		pst.setDate(3, leaveDetails.getLeaveEndDate());
		pst.setInt(4, leaveDetails.getNoOfDays());
		pst.setString(5, leaveDetails.getLeaveType().toString());
		pst.setString(6, leaveDetails.getLeaveReason());
		pst.executeUpdate();
		cmd = "Update Employee set LeaveAvail = LeaveAvail - ? Where EmpId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, diff);
		pst.setInt(2, leaveDetails.getEmpId());
		pst.executeUpdate();
		return "Leave Applied...";
	}
}



