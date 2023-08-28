package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List data = new ArrayList();
		data.add(new Integer(42));
		data.add(new Integer(11));
		data.add(new Integer(17));
		data.add(new Integer(23));
		data.add(new Integer(19));
		int sum=0;
		for (Object object : data) {
			int x = (Integer)object;
			sum+=x;
		}
		System.out.println("Sum is  " +sum);
	}
}
