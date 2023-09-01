package com.java.thr;

public class Khafia implements Runnable{

	Data data;
	
	Khafia(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.showMsg("Khafia");
	}

}
