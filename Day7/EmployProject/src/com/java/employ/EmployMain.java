package com.java.employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployMain {

	static EmployBAL bal;
	static Scanner sc;
	
	static {
		bal = new EmployBAL();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Delete Employ");
			System.out.println("5. Update Employ");
			System.out.println("6. Exit");
			System.out.println("7. WriteEmploy File");
			System.out.println("8. Read Employ File");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				deleteEmployMain();
				break;
			case 5 : 
				try {
					updateEmployMain();
				} catch (EmployException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6 : 
				return;
			case 7 : 
				try {
					writeEmployFileMain();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 8 : 
				try {
					readEmployFileMain();
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}while(choice!=6);
	}

	public static void readEmployFileMain() throws FileNotFoundException, ClassNotFoundException, IOException {
		System.out.println(bal.readEmployFileBal());
	}
	
	public static void writeEmployFileMain() throws FileNotFoundException, IOException {
		System.out.println(bal.writeEmployFileBal());
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		System.out.println(bal.deleteEmployBal(empno));
	}
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		Employ employ = bal.searchEmployBal(empno);
		if (employ!=null) {
			System.out.println(employ);
		} else {
			System.out.println("Record Not Found...");
		}
	}
	
	public static void showEmployMain() {
		List<Employ> employList= bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void updateEmployMain() throws EmployException {
		Employ employUpdated = new Employ();
		System.out.println("Enter Employ Number   ");
		employUpdated.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employUpdated.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employUpdated.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employUpdated.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employUpdated.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employUpdated.setBasic(sc.nextDouble());
		System.out.println(bal.updateEmployBal(employUpdated));
	}
	
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
	}
}
