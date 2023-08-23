package com.java.day1;

public class ArrayDemo2 {

	public void show() {
		String[] names = new String[] {
			"Ayush", "Piyush", "Ariz","Santosh","Sagar"	
		};
		
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		new ArrayDemo2().show();
	}
}
