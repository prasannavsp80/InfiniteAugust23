package com.java.oops;

public class Main {

	public static void main(String[] args) {
		Employ e1 = new Employ(1,"Sourav",88822);

		Employ e2 = new Employ(1,"Sourav",88822);

		Employ e3 = e2;

		System.out.println(e1==e2);
		System.out.println(e2==e3);

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
	}
}
