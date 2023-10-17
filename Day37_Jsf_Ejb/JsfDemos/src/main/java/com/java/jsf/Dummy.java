package com.java.jsf;

import com.java.ejb.EmployCrudBeanRemote;

public class Dummy {

	public static void main(String[] args) {
		System.out.println(new EmployDaoImplNew().showEmploy());
		
	}
}
