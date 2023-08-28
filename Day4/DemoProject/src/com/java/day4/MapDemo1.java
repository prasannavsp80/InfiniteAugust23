package com.java.day4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {

	public static void main(String[] args) {
		Map employData = new Hashtable();
		employData.put(1, "Santosh");
		employData.put(2, "Abhishek");
		employData.put(3, "Ayush");
		employData.put(4, "Rajesh");
		employData.put(5, "Bhanu");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		int empno = sc.nextInt();
		String name = (String)employData.getOrDefault(empno, "Not Found");
		System.out.println(name);
	}
}
