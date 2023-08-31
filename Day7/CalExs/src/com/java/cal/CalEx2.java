package com.java.cal;

import java.util.Calendar;

public class CalEx2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " 
        + calendar.get(Calendar.YEAR));
        System.out.println("Current Month Day: " 
        		+ calendar.get(Calendar.DATE));
        int month = calendar.get(Calendar.MONTH);
        month++;
        System.out.println("Month   " +month);
        System.out.println("Hour  " +calendar.get(Calendar.HOUR));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
	}
}
