package com.java.hib;

public interface LoginDAO {
	String addUser(Login login);
	Login authenticate(Login login);
	long loginValidate(Login login);
}
