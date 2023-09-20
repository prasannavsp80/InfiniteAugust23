package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{10}", "1234567899"));
		System.out.println(Pattern.matches("[0-9]{4}-[0-9]{3}", "1234-332"));
		System.out.println(Pattern.matches("[9][1]-[0-9]{10}", "91-4883266633"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
	}
}
