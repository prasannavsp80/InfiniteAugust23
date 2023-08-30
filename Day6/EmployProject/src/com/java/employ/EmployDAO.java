package com.java.employ;

import java.util.List;

public interface EmployDAO {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employ);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
}
