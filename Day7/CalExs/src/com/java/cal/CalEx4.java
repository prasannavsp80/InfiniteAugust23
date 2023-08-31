package com.java.cal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalEx4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Date (yyyy-MM-dd) ");
		String dt = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(dt);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			System.out.println("Origial Date " +cal.getTime());
			cal.add(Calendar.MONTH, 5);
			Date updated = cal.getTime();
			System.out.println("Updated Date " + updated);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
