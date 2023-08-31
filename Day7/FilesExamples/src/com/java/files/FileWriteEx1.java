package com.java.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args) {
		File f1 = new File("d:/files/output.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f1);
			fw.write("Welcome to Java...\n");
			fw.write("Welcome to Files...\n");
			fw.write("Thank You All...\n");
			fw.close();
			System.out.println("Data Saved in File...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
