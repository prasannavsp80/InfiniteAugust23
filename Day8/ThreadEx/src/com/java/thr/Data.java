package com.java.thr;

public class Data {

	synchronized void showMsg(String name) {
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
			System.out.println(" How are You...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

