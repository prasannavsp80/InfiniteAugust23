package com.java.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Sourabh");
		names.add("Arnab");
		names.add("Jitendra");
		names.add("Rajesh");
		names.add("Ganesh");
		names.add("Abhishek");
		names.add("Ayush");
		names.add("Aniruth");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
