package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr4 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("(amn)?", "a"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Hello"));
		System.out.println(Pattern.matches("[a-zA-Z]*", ""));
		//System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("(0/91)?[7-9][0-9]{9}", "09003321563"));
		//System.out.println(Pattern.matches("(0}?[0-9]{10}", "9898978999"));
		System.out.println(Pattern.matches("\\D*", "Prasannna"));
		System.out.println(Pattern.matches("[a-zA-Z]*\\d", "abc1"));
	}
}
