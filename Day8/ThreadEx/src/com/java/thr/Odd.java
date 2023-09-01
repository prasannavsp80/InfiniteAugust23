package com.java.thr;

public class Odd extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=20;i+=2) {
			System.out.println("Odd  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
