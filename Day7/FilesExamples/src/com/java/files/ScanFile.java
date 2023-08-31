package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/files/Employ.txt");
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
