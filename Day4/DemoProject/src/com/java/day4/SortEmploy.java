package com.java.day4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Arnab", 88323));
		employs.add(new Employ(2, "Ganesh", 90323));
		employs.add(new Employ(3, "Rajesh", 91133));
		employs.add(new Employ(4, "Sireesha", 90311));
		employs.add(new Employ(5, "Pallavi", 98211));
		employs.add(new Employ(6, "Naveen", 90322));
		employs.add(new Employ(7, "Sagar", 89022));
		employs.add(new Employ(8, "Rahul", 92221));
		System.out.println("Sorted Data ");
		for (Object object : employs) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}

		
	}
}
