package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr3 {

	public static void main(String[] args) {
		System.out.println("Salary Validation ");
		System.out.println(Pattern.matches("\\d{5}", "abc"));
		System.out.println(Pattern.matches("\\d{10}", "9944336732"));
		System.out.println(Pattern.matches("[2468]{4}-\\d{2}-\\d{3}", "5324-23-232"));
		
	}
}
