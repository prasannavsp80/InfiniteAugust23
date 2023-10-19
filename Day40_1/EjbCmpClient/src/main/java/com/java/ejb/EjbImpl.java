package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class EjbImpl {
	public List<Employ> showEmployEjb() throws NamingException {
		EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showEmploy();
	}
}
