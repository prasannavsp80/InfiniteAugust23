package com.java.prop;

public class PropEx {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Abhishek");
		
		System.out.println("Customer Id  " +customer.getCustId());
		System.out.println("Customer Name " +customer.getName());
	}
}
