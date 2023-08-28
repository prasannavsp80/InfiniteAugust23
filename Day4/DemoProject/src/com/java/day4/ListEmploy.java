package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Arnab", 88323));
		employList.add(new Employ(2, "Ganesh", 90323));
		employList.add(new Employ(3, "Rajesh", 91133));
		employList.add(new Employ(4, "Sireesha", 90311));
		employList.add(new Employ(5, "Pallavi", 98211));
		System.out.println("Employ List  ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
