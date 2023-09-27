package com.java.hib;

import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		EmployDAOImpl dao = new EmployDAOImpl();
		Employ employ = dao.searchEmployCr(empno);
		System.out.println(employ);
	}
}
