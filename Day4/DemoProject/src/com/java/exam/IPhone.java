package com.java.exam;

public class IPhone implements Mobile {

	@Override
	public void name() {
		System.out.println("Name is Iphone");
	}

	@Override
	public void model() {
		System.out.println("IPhone 14 Max Pro");
	}

	@Override
	public void price() {
		System.out.println("Price  99999Rs/-");
	}

}
