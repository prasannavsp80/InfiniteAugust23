package com.java.day1;

public class EvenOdd {

	public void check(int n) {
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
	public static void main(String[] args) {
		int n = 12;
		EvenOdd obj = new EvenOdd();
		obj.check(n);
	}
}
