package com.java.ejb;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name = "Employ")
public class Employ implements Serializable {
 
	 private static final long serialVersionUID = 1L;
	    
	 @Id
	 @GeneratedValue
	 @Column(name = "empno")
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
    
}

