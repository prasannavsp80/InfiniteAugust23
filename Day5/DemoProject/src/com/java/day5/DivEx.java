package com.java.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division  " +c);
		}
		catch(ArithmeticException e) {
			System.err.println("Division by zero impossible...");
		}
		catch(InputMismatchException e) {
			System.err.println("String cannot be Converted as Integer...");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Program from Infinite August 2023 Batch...");
		}
	}
}
