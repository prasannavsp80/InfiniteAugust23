package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenDemo1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Arnab");
		names.add("Rohit");
		names.add("Piyush");
		//names.add(12);
		names.add("Rahul");
		System.out.println("Names are ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
