package com.java.day2;

public class EmployArray {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Raj";
		employ1.basic = 88322;
		
		Employ employ2 = new Employ();
		employ2.empno = 2;
		employ2.name = "Sagar";
		employ2.basic = 90032;

		Employ employ3 = new Employ();
		employ3.empno = 3;
		employ3.name = "Pallavi";
		employ3.basic = 90882;

		Employ[] arr = new Employ[] {employ1, employ2, employ3};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
