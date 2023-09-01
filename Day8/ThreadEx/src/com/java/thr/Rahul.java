package com.java.thr;

public class Rahul implements Runnable {

	Data data;
	
	Rahul(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.showMsg("Rahul");
	}

}
