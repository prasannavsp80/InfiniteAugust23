package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RemoteHelper {

	public static EmployCrudBeanRemote getConnection() throws NamingException  {
		return (EmployCrudBeanRemote) 
				new InitialContext().lookup("EmployCrudBean/remote");
	}
}
