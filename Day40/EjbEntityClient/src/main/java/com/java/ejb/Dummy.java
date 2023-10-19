package com.java.ejb;

import javax.naming.NamingException;

public class Dummy {

	public static void main(String[] args) {
		try {
			System.out.println(RemoteHelper.lookupRemoteStatelessEmploy());
			EmployeeBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
			System.out.println(remote.showEmployee().size());
			System.out.println(remote.showEmployee());
		
			System.out.println("JNDI Loaded...");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
