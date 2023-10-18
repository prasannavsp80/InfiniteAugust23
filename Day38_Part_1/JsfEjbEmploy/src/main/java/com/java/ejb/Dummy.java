package com.java.ejb;

import javax.naming.NamingException;

public class Dummy {

	public static void main(String[] args) {
		try {
			EmployEjbBeanRemote remote = 
					RemoteHelper.lookupRemoteStatelessEmploy();
			System.out.println("JNDI Loaded ");
			Thread.sleep(10000);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
