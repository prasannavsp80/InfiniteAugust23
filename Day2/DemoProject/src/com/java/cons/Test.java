package com.java.cons;

public class Test {

	int a, b;
	Test() {
		a = 5;
		b = 7;
	}
	
	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		Test obj1 = new Test();
		System.out.println(obj1);
		Test obj2= new Test(12, 18);
		System.out.println(obj2);
	}
}





