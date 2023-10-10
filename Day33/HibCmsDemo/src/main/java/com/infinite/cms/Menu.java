package com.infinite.cms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean(name="menu")
@SessionScoped 
@Entity
@Table(name="Menu")
public class Menu {

	@Id
	@Column(name="MEN_ID")
	private int menuId;
	@Column(name="MEN_ITEM")
	private String menuItem;
	@Column(name="men_price")
	private double menuPrice;
	@Column(name="Restaurant_ID")	
	private int restaurantId;
	@Column(name="MEN_CALORIES")		
	private double calories;
	@Column(name="MEN_SPECIALITY")			
	private String menuSpeciality;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public String getMenuSpeciality() {
		return menuSpeciality;
	}
	public void setMenuSpeciality(String menuSpeciality) {
		this.menuSpeciality = menuSpeciality;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuItem=" + menuItem + ", menuPrice=" + menuPrice + ", restaurantId="
				+ restaurantId + ", calories=" + calories + ", menuSpeciality=" + menuSpeciality + "]";
	}
	
	
}
