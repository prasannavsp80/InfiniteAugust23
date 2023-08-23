package com.java.day1;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You can Vote...");
		} else {
			System.out.println("You are not Authorized for Voting...");
		}
	}
	public static void main(String[] args) {
		int age = 17;
		Voting obj = new Voting();
		obj.check(age);
	}
}
