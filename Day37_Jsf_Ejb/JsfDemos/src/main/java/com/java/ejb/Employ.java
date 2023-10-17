package com.java.ejb;

import java.io.Serializable;

public class Employ implements Serializable{

	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public Employ(int empno, String name, String dept, String desig, int basic) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}

	public Employ() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ "]";
	}
	
}
