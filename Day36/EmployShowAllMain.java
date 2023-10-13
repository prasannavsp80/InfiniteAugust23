package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EmployShowAllMain {

	public static void main(String[] args) {
		try {
			EmployCrudBeanRemote remote = (EmployCrudBeanRemote) 
					new InitialContext().lookup("EmployCrudBean/remote");
			List<Employ> employList = remote.showEmployDao();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		//	System.out.println(remote.showEmployDao());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
