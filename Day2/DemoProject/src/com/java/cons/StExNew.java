package com.java.cons;

public class StExNew {

	static int count;
	
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StExNew obj1 = new StExNew();
		StExNew obj2 = new StExNew();
		StExNew obj3 = new StExNew();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
		
	}
}
