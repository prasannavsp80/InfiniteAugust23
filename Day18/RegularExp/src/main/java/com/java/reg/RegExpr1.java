package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr1 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".h", "ch"));
		System.out.println(Pattern.matches("..f.n...", "infinite"));
	}
}
