package com.java.oops;

public class Employ {

	private int empno;
	private String name;
	private double basic;
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employ employ = (Employ)obj;
		if (employ.getEmpno()==empno &&
				employ.getName()==name &&
				employ.getBasic() == basic
				)  {
			return true;
		}
		return false;
	}
}
