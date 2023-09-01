package com.java.thr;

public class MainProg {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Even());
		Thread t2 = new Thread(new Odd());
		Thread t3 = new Thread(new Fact());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
