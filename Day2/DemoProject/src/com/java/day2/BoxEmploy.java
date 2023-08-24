package com.java.day2;

public class BoxEmploy {

	public void show(Object ob) {
		//int x = (Integer)ob;
		Employ employ = (Employ)ob;
		System.out.println("Employ No " +employ.empno + " Name " +employ.name 
					+ " Basic " + employ.basic);
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno = 1;
		employ.name = "Sourav";
		employ.basic = 83823;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
