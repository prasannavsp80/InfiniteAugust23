package com.java.ejb;

import javax.naming.NamingException;

public class Dummy {

	public static void main(String[] args) {
	Employ e1 = new Employ();
		e1.setName("Raj");
		e1.setGender("Male");
		e1.setDept("java");
		e1.setDesig("Programmer");
		e1.setBasic(84822);
		try {
			System.out.println(new EjbImpl().showEmployEjb());
		} catch (NamingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			System.out.println(RemoteHelper.lookupRemoteStatelessEmploy());
			EmployBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
			System.out.println(remote.addEmploy(e1));
			Thread.sleep(15000);
			System.out.println("JNDI Loaded...");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
