package com.java.jsf;

import java.util.List;

public class EmployController {

	private EmployDAO employDao;
	private Employ employ;
	
	public EmployDAO getEmployDao() {
		return employDao;
	}
	
	public void setEmployDao(EmployDAO employDao) {
		this.employDao = employDao;
	}
	
	public Employ getEmploy() {
		return employ;
	}
	
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
	
	public List<Employ> showEmploy() {
		return employDao.showEmployDao();
	}
	
	public String searchEmploy(int empno) {
		return employDao.searchEmployDao(empno);
	}
	
	public String validate(Login login) {
		return employDao.validate(login);
	}
}
