package com.java.day1;

public class CaseDemo2 {

	public void show(String dayName) {
		switch(dayName) {
		case "Monday" : 
			System.out.println("Its Monday...");
			break;
		case "Tuesday" :
			System.out.println("Its Tuesday...");
			break;
		case "Wednesday" : 
			System.out.println("Its Wednesday...");
			break;
		default :
			System.out.println("Invalid day...");
		}
	}
	public static void main(String[] args) {
		String dayName = "Wendesday";
		new CaseDemo2().show(dayName);
	}
}
