package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/files/obj.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(new String("Date is  "));
			objout.writeObject(new Date());
			objout.close();
			fout.close();
			System.out.println("*** Objects Stored ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
