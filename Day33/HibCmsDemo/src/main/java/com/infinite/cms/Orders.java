package com.infinite.cms;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ManagedBean(name="orders")
@SessionScoped
@Table(name="Orders")
public class Orders {

	@Id
	@Column(name="ORD_ID")
	private int orderId;
	
	@Column(name="CUS_ID")
	private int custId;
	@Column(name="VEN_ID")
	private int venId;
	@Column(name="MEN_ID")
	private int menuId;
	@Column(name="WAL_SOURCE")
	private String walSource;
	@Column(name="ORD_DATE")
	private Date orderDate;
	@Column(name="ORD_QUANTITY")	
	private int orderQuantity;
	@Column(name="ORD_BILLAMOUNT")		
	private double orderBillAmount;
	@Column(name="ORD_STATUS")
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	@Column(name="ORD_COMMENTS")				
	private String orderComments;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getOrderBillAmount() {
		return orderBillAmount;
	}
	public void setOrderBillAmount(double orderBillAmount) {
		this.orderBillAmount = orderBillAmount;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderComments() {
		return orderComments;
	}
	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}
}
