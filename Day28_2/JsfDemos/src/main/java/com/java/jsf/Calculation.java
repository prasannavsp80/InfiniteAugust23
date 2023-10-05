package com.java.jsf;

import javax.faces.event.ActionEvent;

public class Calculation {

	private int firstNo;
	private int secondNo;
	private int result;
	
	public String show() {
		return "Menu.jsp?faces-redirect=true";

	}
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Calculation(int firstNo, int secondNo, int result) {
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.result = result;
	}
	public String redirect() {
		return "Menu.jsp?faces-redirect=true";
	}
	public Calculation() {
		
	}
	
	public void addition(ActionEvent evt) {
		this.result = this.firstNo + this.secondNo;
	}
}
