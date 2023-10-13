package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployCrudBeanRemote {

	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
}
