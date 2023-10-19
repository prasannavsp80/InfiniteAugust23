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
	
	public String searchEmploy(int empno) throws NamingException {
		EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		Employ employ = remote.searchEmploy(empno);
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		 sessionMap.put("editEmploy", employ);
		 return "UpdateEmploy.jsp?faces-redirect=true";
	}
}
