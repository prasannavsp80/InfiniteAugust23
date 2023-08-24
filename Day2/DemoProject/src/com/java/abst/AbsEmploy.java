package com.java.abst;

public class AbsEmploy {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Ayush(1, "Ayush", 88323),
			new Shivangi(2, "Shivangi", 83211),
			new Piyush(3, "Piyush", 88234)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
