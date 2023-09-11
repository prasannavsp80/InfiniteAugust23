package com.java.lms;

import java.sql.SQLException;
import java.util.List;

public class EmployeeShowMain {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		try {
			List<Employee> employeeList = dao.showEmployeeDao();
			employeeList.forEach(System.out::println);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
