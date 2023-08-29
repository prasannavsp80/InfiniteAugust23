package com.java.day5;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a= new int[] {1,44};
		try {
			a[10]=88;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
