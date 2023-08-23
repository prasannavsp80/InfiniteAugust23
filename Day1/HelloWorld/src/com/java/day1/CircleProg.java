package com.java.day1;

public class CircleProg {

	public void calc(double radius) {
		double area, circ;
		area = 3.14 * radius * radius;
		circ = 2 * 3.14 * radius;
		System.out.println("Area of Cirlce  " +area);
		System.out.println("Circumference  " +circ);
	}
	public static void main(String[] args) {
		double radius = 8.2;
		new CircleProg().calc(radius);
	}
}
