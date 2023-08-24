package com.java.intf;

public class MainProg {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Himanshu(),
			new Jitendra(),
			new Ariz()
		};
		
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		}
	}
}
