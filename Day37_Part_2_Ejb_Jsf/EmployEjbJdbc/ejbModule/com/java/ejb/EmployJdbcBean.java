package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EmployJdbcBean
 */
@Stateless
@Remote(EmployJdbcBeanRemote.class)
public class EmployJdbcBean implements EmployJdbcBeanRemote {

	static EmployDAO daoImpl;
	
	static {
		daoImpl = new EmployDAOImpl();
	}
    /**
     * Default constructor. 
     */
    public EmployJdbcBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		return daoImpl.showEmployDao();
	}

	@Override
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.searchEmployDao(empno);
	}

	@Override
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.addEmployDao(employ);
	}

	@Override
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.deleteEmployDao(empno);
	}

	@Override
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.updateEmployDao(employ);
	}

}
