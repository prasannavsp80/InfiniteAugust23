package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployCrudBeanRemote {
	List<Employ> showEmployBean() throws ClassNotFoundException, SQLException;
	Employ searchEmployBean(int empno) throws ClassNotFoundException, SQLException;
	String addEmployBean(Employ employ) throws ClassNotFoundException, SQLException;;
	String deleteEmployBean(int empno) throws ClassNotFoundException, SQLException;;
	String updateEmployBean(Employ employ) throws ClassNotFoundException, SQLException;;

}
