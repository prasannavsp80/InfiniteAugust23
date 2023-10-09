package com.java.jsf;
import java.util.List;

public class EmployController {

	private EmployDAOImpl dao;

	public EmployDAOImpl getInstance() {
		if(dao==null) {
			dao = new EmployDAOImpl();
		}
		return dao;
	}
	public EmployDAOImpl getDao() {
		return dao;
	}

	public void setDao(EmployDAOImpl dao) {
		this.dao = dao;
	}
	
	public List<Employ> showEmploy() {
		getInstance();
		return dao.showEmployDao();
	}
	
	public List<Employ> showEmployListByDept(String dept) {
		getInstance();
		return dao.getEmployListByDept(dept);
	}
}
