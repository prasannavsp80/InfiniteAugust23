package com.java.oops;

public class MainProg {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Java("OOPS"),
			new Dotnet("Lambda"),
			new Angular("Services"),
			new Java("Collections"),
			new Java("Jsp"),
			new Dotnet("Entity Framework"),
			new Angular("Forms"),
			new Dotnet("Web Api"),
			new Angular("Components"),
			new Java("Threads"),
			new Java("JDBC"),
			new Dotnet("Lambda"),
			new Angular("Services"),
			new Java("EJB")
		};
		
		for (Training training : arr) {
			if (training instanceof Java) {
				System.out.println(training);
			}
		}
	}
}
