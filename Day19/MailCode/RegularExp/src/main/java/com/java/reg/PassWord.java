package com.java.reg;

import java.util.regex.Pattern;

public class PassWord {

	public static void main(String[] args) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        System.out.println(Pattern.matches(regex, "@123Prasanna"));

	}
}
