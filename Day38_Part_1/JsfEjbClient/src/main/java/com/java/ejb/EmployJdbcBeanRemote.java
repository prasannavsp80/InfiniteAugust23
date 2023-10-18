package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployJdbcBeanRemote {

	List<Employ> showEmploy() throws ClassNotFoundException, SQLException;
	Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException;
}
