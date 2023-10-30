package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployBeanRemote {
	 String addEmploy(Employ Employ);
	  List<Employ> showEmploy();
	  Employ searchEmploy(int id);
	  String deleteEmploy(int id);
	  String updateEmploy(Employ EmployNew);
}
