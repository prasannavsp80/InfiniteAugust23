package com.java.thr;

import java.util.LinkedList;

public class Thr2 implements Runnable {
	@Override
	public void run() {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Sourabh");
		names.add("Abhishek");
		names.add("Kumar");
		names.add("Rajesh");
		names.add("Shivangi");
		names.add("Naveen");
		for (String s : names) {
			System.out.println("Linked List Data  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
