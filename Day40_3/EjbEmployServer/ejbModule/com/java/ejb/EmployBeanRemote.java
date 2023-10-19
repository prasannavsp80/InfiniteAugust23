package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EmployBeanRemote {
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
}
