package com.java.day1;

public class Fact {
	public void calc(int n) {
		int i=1, f=1;
		while(i <= n) {
			f = f * i;
			i++;
		}
		System.out.println("Factorial Value " +f);
	}
	public static void main(String[] args) {
		int n=5;
		Fact obj = new Fact();
		obj.calc(n);
	}
}
