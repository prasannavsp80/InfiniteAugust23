package com.infinite.cms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean(name="customer")
@SessionScoped
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name="CUS_ID")
	private int custId;

	@Column(name="CUS_NAME")
	private String custName;

	@Column(name="CUS_PHN_NO")
	private String custPhoneNo;
	
	@Column(name="CUS_USERNAME")
	private String custUserName;
	
	@Column(name="CUS_PASSWORD")
	private String custPassword;
	
	@Column(name="CUS_EMAIL")
	private String custEmail;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhoneNo() {
		return custPhoneNo;
	}

	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}

	public String getCustUserName() {
		return custUserName;
	}

	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	
}
