package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection connection;
	PreparedStatement pst;
	@Override
	public List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		List<Employee> employList = new ArrayList<Employee>();
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("empId"));
			employee.setEmpName(rs.getString("EmpName"));
			employee.setEmpEmail(rs.getString("EmpEmail"));
			employee.setMobileNo(rs.getString("MobileNo"));
			employee.setDateOfJoin(rs.getDate("DateOfJoin"));
			employee.setManagerId(rs.getInt("ManagerId"));
			employee.setLeaveAvail(rs.getInt("LeaveAvail"));
			employList.add(employee);
		}
		return employList;
	}

	@Override
	public Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee where empId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("empId"));
			employee.setEmpName(rs.getString("EmpName"));
			employee.setEmpEmail(rs.getString("EmpEmail"));
			employee.setMobileNo(rs.getString("MobileNo"));
			employee.setDateOfJoin(rs.getDate("DateOfJoin"));
			employee.setManagerId(rs.getInt("ManagerId"));
			employee.setLeaveAvail(rs.getInt("LeaveAvail"));
		}
		return employee;
	}

}
