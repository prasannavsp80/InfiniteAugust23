package com.java.junit;

import java.util.Hashtable;
import java.util.Map;

public class Data {

	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}
	
	public Object mapEx(String key) {
		Map data = new Hashtable();
		data.put("Ganesh", "Mirda");
		data.put("Sagar", "Mukkawar");
		data.put("Rajesh", "Murupoju");
		data.put("Tanya", "Arora");
		data.put("Rahul", "Raman");
		return data.get(key);
	}
	
	public int max3(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
	public String sayHello() {
		return "Welcome to Junit Programming...";
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
