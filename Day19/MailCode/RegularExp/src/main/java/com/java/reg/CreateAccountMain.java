package com.java.reg;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Accounts accounts = new Accounts();
		System.out.println("Enter FirstName   ");
		accounts.setFirstName(sc.next());
		System.out.println("Enter LastName   ");
		accounts.setLastName(sc.next());
		System.out.println("Enter City   ");
		accounts.setCity(sc.next());
		System.out.println("Enter State   ");
		accounts.setState(sc.next());
		System.out.println("Enter Amount   ");
		accounts.setAmount(sc.nextDouble());
		System.out.println("Enter CheqFacil   ");
		accounts.setCheqFacil(sc.next());
		System.out.println("Enter AccountType   ");
		accounts.setAccountType(sc.next());
		
		AccounsDAO dao = new AccountsDAOImpl();
		try {
			System.out.println(dao.createAccount(accounts));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
