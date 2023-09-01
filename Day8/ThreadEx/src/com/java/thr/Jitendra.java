package com.java.thr;

public class Jitendra implements Runnable {

	Data data;
	
	Jitendra(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.showMsg("Jitendra");
	}

}
