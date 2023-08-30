package com.java.employ;

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

}
