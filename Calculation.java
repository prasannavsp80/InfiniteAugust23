package com.java.infinite;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is  " +c);
		} catch(ArithmeticException e) {
			System.out.println("Divison by zero impossible");
		} catch (InputMismatchException e) {
			System.out.println("String cannot be converted as integer");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
