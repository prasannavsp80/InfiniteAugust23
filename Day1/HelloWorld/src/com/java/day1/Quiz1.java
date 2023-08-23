package com.java.day1;

public class Quiz1 {
	int n;
	public static void main(String[] args) {
		Quiz1 obj1 = new Quiz1();
		obj1.n = 12;
		Quiz1 obj2 = obj1;
		obj2.n =13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
