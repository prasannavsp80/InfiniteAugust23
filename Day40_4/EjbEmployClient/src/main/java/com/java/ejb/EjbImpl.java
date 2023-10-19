package com.java.ejb;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EjbImpl {

	public List<Employ> showEmployEjb() throws NamingException {
		EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showEmploy();
	}

	public String deleteEmployEjb(int empno) throws NamingException, ClassNotFoundException {
		EmployBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessEmploy();
		remote.deleteEmployee(empno);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	public String addEmploy(Employ employ) throws NamingException {
		EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		System.out.println(employ);
		remote.addEmployee(employ);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	public String searchEmploy(int empno) throws NamingException {
		EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		Employ employ = remote.searchEmploy(empno);
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		 sessionMap.put("editEmploy", employ);
		 return "UpdateEmploy.jsp?faces-redirect=true";
	}
	
	public String updateEmployEjb(Employ employNew) throws NamingException, ClassNotFoundException  {
		EmployBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessEmploy();
		remote.updateEmployee(employNew);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
}
