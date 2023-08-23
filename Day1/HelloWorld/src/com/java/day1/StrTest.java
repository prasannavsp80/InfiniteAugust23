package com.java.day1;

public class StrTest {

	public void show() {
		String str="Welcome to Java Programming...Infinite";
		System.out.println("Length  " +str.length());
		System.out.println("First Occurrence of char 'o' is  " +
		str.indexOf("o"));
		System.out.println("Char at 5th position " +str.charAt(5));
		System.out.println("Upper Case  " +str.toUpperCase());
		System.out.println("Lower Case  " +str.toLowerCase());
		String s1="Welcome", s2="Java", s3="Welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
	}
	public static void main(String[] args) {
		new StrTest().show();
	}
}
