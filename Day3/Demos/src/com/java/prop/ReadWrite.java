package com.java.prop;

public class ReadWrite {

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Raj");
		employ.setBasic(88423);
		
		System.out.println("Employ No  " +employ.getEmpno());
		System.out.println("Employ Name " +employ.getName());
		System.out.println("Basic  " +employ.getBasic());
	}
}
