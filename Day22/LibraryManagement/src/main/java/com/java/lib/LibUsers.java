package com.java.lib;

public class LibUsers {

	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public LibUsers(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	public LibUsers() {

	}
	
	@Override
	public String toString() {
		return "LibUsers [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
