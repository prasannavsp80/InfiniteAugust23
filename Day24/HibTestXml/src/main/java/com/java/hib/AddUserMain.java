package com.java.hib;

import java.util.Scanner;

public class AddUserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		System.out.println("Enter UserName  ");
		login.setUserName(sc.next());
		System.out.println("Enter Password  ");
		login.setPassCode(sc.next());
		LoginDAO dao = new LoginDAOImpl();
		String pwd = EncryptPassword.getCode(login.getPassCode());
		login.setPassCode(pwd);
		System.out.println(dao.addUser(login));;
	}
}
