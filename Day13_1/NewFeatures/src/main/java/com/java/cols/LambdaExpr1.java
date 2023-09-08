package com.java.cols;

public class LambdaExpr1 {

	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Hi I am Jitendra...");
		};
		obj1.show();
		
		IHello obj2 = () -> {
			System.out.println("Hi I am Tanya...");
		};
		obj2.show();
		
		IHello obj3 = () -> {
			System.out.println("Hi i am Ganesh...");
		};
		obj3.show();
		
	}
}
