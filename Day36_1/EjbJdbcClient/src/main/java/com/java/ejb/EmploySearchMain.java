package com.java.ejb;

import java.sql.SQLException;

import javax.naming.NamingException;

public class EmploySearchMain {

	public static void main(String[] args) {
		try {
			EmployCrudBeanRemote remote = RemoteHelper.getConnection();
			Employ employ = remote.searchEmployDao(5);
			if (employ!=null) {
				System.out.println(employ);
			} else {
				System.out.println("Not Found");
			}
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
