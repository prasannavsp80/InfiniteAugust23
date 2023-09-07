package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployDAO {

	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException;
}
