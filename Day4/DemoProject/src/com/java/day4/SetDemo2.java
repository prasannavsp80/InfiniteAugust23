package com.java.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabyasachi");
		names.add("Sourav");
		
		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabyasachi");
		names.add("Sourav");

		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabyasachi");
		names.add("Sourav");

		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabyasachi");
		names.add("Sourav");

		for (Object object : names) {
			System.out.println(object);
		}

	}
}
