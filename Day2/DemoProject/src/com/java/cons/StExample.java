package com.java.cons;

public class StExample {

	static int count;
	
	public void increment() {
		count++;
	}
	
	public void show() {
		System.out.println("Count is  " +count);
	}
	
	public static void main(String[] args) {
		StExample obj1 = new StExample();
		StExample obj2 = new StExample();
		obj1.increment();
		obj1.show();
		obj2.increment();
		obj2.show();
	}
}
