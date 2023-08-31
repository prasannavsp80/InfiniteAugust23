package com.java.employ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Record Inserted...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employUpdated) {
		Employ employFound = searchEmployDao(employUpdated.getEmpno());
		if (employFound!=null) {
			for (Employ employ : employList) {
				if (employ.getEmpno()==employUpdated.getEmpno()) {
					employ.setName(employUpdated.getName());
					employ.setDept(employUpdated.getDept());
					employ.setDesig(employUpdated.getDesig());
					employ.setGender(employUpdated.getGender());
					employ.setBasic(employUpdated.getBasic());
					break;
				}
			}
			return "Employ Record Updated...";
		}
		return "Employ Record not Found...";
	}

	@Override
	public String writeEmployFileDao() throws IOException {
		FileOutputStream fout = 
			new FileOutputStream("d:/files/EmployProject.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(employList);
		objout.close();
		fout.close();
		return " *** Data Stored in File ***";
	}

	@Override
	public String readEmployFileDao() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("d:/files/EmployProject.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		employList = (List<Employ>)objin.readObject();
		objin.close();
		fin.close();
		return "Data Retrieved From File...";
	}

}
