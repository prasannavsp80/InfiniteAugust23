package com.java.ejb;

import java.sql.SQLException;

import javax.naming.NamingException;

public class AddEmployMain {

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(24);
		employ.setName("Raj Kishore");
		employ.setGender(Gender.MALE);
		employ.setDept("Java");
		employ.setDesig("Manager");
		employ.setBasic(99422);
		
		try {
			EmployCrudBeanRemote remote = RemoteHelper.getConnection();
			System.out.println(remote.addEmployDao(employ));
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
