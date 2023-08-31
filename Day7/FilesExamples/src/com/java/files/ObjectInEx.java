package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/files/obj.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			String str = (String)objin.readObject();
			Date date = (Date)objin.readObject();
			System.out.println(str + " " +date);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
