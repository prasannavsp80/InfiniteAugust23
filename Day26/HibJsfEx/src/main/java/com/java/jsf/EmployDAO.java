package com.java.jsf;

import java.util.List;

public interface EmployDAO {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDao(Employ employ);
	String deleteEmployDao(int empno);
}
