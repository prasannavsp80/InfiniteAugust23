package com.java.cols;

public class LambdaExpr2 {

	public static void main(String[] args) {
		ICalculation obj1 = (a,b) -> {
			return a+b;
		};
		System.out.println("Sum is  " +obj1.calc(12, 5));
		
		
		ICalculation obj2 = (a,b) -> {
			return a-b;
		};
		System.out.println("Sub is  " +obj2.calc(12, 5));
		
		ICalculation obj3 = (a, b) -> {
			return a*b;
		};
		System.out.println("Mult is  " +obj3.calc(12, 5));
	}
}
