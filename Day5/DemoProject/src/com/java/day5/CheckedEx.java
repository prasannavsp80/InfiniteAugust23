package com.java.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedEx {
	public void show(String dt) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dt);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd) Format");
		String date = sc.next();
		CheckedEx obj = new CheckedEx();
		try {
			obj.show(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}


