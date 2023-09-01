package com.java.thr;

import java.util.Vector;

public class Thr3 implements Runnable {
	@Override
	public void run() {
		Vector<String> names = new Vector<String>(3,2);
		names.addElement("Ganesh");
		names.addElement("Smruti");
		names.addElement("Piyush");
		names.addElement("Ariz");
		names.addElement("Yukesh");
		names.addElement("Prakash");
		for (String s : names) {
			System.out.println("Vector Data  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
