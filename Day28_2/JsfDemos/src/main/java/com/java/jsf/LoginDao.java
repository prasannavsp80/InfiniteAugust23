package com.java.jsf;

public class LoginDao {

	public String validateMe(String user, String pwd) {
		if (user.equals("Infinite") && pwd.equals("Infinite")) {
			return "Menu.jsp?faces-redirect=true";
		} else {
			return "Login.jsp?faces-redirect=true";
		}
	}
}
