package com.java.day2;

enum OrderStatus {
	
	PENDING, ACCEPTED, REJECTED, DELIVERED
}

public class EnumEx1 {

	public static void main(String[] args) {
		OrderStatus status = OrderStatus.PENDING;
		System.out.println(status);
	}
}
