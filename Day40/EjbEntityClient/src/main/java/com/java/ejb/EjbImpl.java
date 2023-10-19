package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class EjbImpl {

	public List<Employee> showEmployEjb() throws NamingException {
		EmployeeBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showEmployee();
	}
}
