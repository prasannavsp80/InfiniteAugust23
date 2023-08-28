package com.java.day4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map userData = new Hashtable();
		userData.put("Abhishek", "Kumar");
		userData.put("Jitendra", "Saho");
		userData.put("Piyush", "Raj");
		userData.put("Rahul", "Raman");
		userData.put("Tanya", "Arora");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
	}
}
