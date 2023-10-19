package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployeeBeanRemote {
	  String addEmployee(Employee employee);
	  List<Employee> showEmployee();
	  Employee searchEmployee(int id);
	  String deleteEmployee(int id);
	  String updateEmployee(Employee employeeNew);
}
