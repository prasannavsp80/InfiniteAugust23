package com.java.prop;

public class Customer {

	private int custId;
	private String name;
	
	public Customer(int custId, String name) {
		super();
		this.custId = custId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + "]";
	}

	public int getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}
	
	
}
