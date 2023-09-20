package com.java.reg;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String regex ="^[a-zA-Z]+\\d{3}";
		System.out.println(Pattern.matches(regex,"Hello123"));
		System.out.println(Pattern.matches("[^pqr]+", "hellop"));
		String reg="^[Mr|Mrs|Miss][a-zA-Z]+";
		System.out.println(Pattern.matches(reg, "MissPandey"));
		System.out.println(Pattern.matches("[^0-9]+", "Ashwin123"));
	}
}
