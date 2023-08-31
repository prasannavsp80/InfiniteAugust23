package com.java.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		/* Convert Calendar to Date */
		Date date = cal.getTime();
		System.out.println("Util Date " +date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}
}
