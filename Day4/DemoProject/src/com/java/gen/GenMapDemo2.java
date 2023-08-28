package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMapDemo2 {
	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Abhishek", "Kumar");
		userData.put("Jitendra", "Saho");
		userData.put("Piyush", "Raj");
		userData.put("Rahul", "Raman");
		userData.put("Tanya", "Arora");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		if (userData.containsKey(user)) {
			System.out.println("Enter Password  ");
			pwd = sc.next();
			String result = userData.getOrDefault(user, "Not Found");
			if (result.equals(pwd)) {
				System.out.println("Correct Credentials...");
			} else {
				System.out.println("Invalid Credentials...");
			}
		} else {
			System.out.println("UserName Not Found...");
		}
	}
}
