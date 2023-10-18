package com.java.ejb;

import java.sql.SQLException;

import javax.naming.NamingException;

public class Dummy {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployEjbImpl().showEmployEjb());
			Thread.sleep(15000);
		} catch (ClassNotFoundException | NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
