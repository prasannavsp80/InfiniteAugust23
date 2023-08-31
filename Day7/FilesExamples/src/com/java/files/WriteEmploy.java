package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		Employ employ = new Employ(1, "Abhishek", 84234);
		try {
			FileOutputStream fout =
		new FileOutputStream("d:/files/EmployNew.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("Employ Object Stored...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
