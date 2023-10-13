package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EmployCrudBean
 */
@Stateless
@Remote(EmployCrudBeanRemote.class)
public class EmployCrudBean implements EmployCrudBeanRemote {

	static EmployDaoImpl impl;
	
	static {
		impl = new EmployDaoImpl();
	}
    /**
     * Default constructor. 
     */
    public EmployCrudBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		return impl.showEmployDao();
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return impl.searchEmployDao(empno);
	}

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return impl.addEmployDao(employ);
	}

}
