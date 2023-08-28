package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Arnab");
		names.add("Mukesh");
		names.add("Ganesh");
		names.add("Sireesha");
		names.add("Abhishek");
		System.out.println("Names are ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2,"Aniruth");
		System.out.println("Names after adding  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.set(2, "Jitendra");
		System.out.println("Names after Update  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.remove(0);
		System.out.println("Remote by Index");
		for (Object object : names) {
			System.out.println(object);
		}
		names.remove("Jitendra");
		System.out.println("Remove By Object Name  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}




