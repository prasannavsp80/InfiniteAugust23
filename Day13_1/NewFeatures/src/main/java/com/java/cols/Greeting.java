package com.java.cols;

public class Greeting {

	public static void main(String[] args) {
		IGreeting obj1 = () -> {
			System.out.println("Good Morning...");
		};
		obj1.greetMe();
	}
}
