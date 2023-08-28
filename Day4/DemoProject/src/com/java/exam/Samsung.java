package com.java.exam;

public class Samsung implements Mobile {

	@Override
	public void name() {
		System.out.println("Name is Samsung...");
	}

	@Override
	public void model() {
		System.out.println("Model S20...");
	}

	@Override
	public void price() {
		System.out.println("Price 60000Rs/-");
	}

	
}
