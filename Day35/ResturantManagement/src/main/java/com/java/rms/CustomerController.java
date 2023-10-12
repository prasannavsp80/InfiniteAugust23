package com.java.rms;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.loader.custom.Return;

public class CustomerController {

	
	private Customer customer;
	private CustomerDaoImpl daoImpl;
	private RestaurantDaoImpl resDao;
	
	
	public RestaurantDaoImpl getResDao() {
		return resDao;
	}

	public void setResDao(RestaurantDaoImpl resDao) {
		this.resDao = resDao;
	}

	public CustomerDaoImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(CustomerDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String addCustomer() {
		if (addValid()) {
				return daoImpl.addCustomerDao(customer);
		}
		return "";
	}
	public String customerLogin() {
			return daoImpl.customerLoginDao(customer);
	}
	
	public String showCustomerWallet() {
		return daoImpl.showCustomerWalletDao();
	}
	public String searchCustomer() { 
		return daoImpl.searchCustomerDetailsDao();
	}
	public List<Restaurant> showRestaurants() {
		return resDao.showRestaurantsDao();
	}
	
	public boolean addValid() {
	    //Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		FacesContext context = FacesContext.getCurrentInstance();
		
	    String name = "^[A-Za-z\\s]+$";
	    String phoneNumber = "^(\\+91|91|0)?[6789]\\d{9}$";
	    String username = "^[^\\s]{8,10}$";
	    String passWord = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,16}$";
	    String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

	    if (!Pattern.matches(name, customer.getCusname())) {
	    // sessionMap.put("nameError", "Invalid Name. Only letters are allowed.");
			context.addMessage("form:name", new FacesMessage("Customer Name Contains min 5 characters"));
	        return false;
	    }

	    if (!Pattern.matches(phoneNumber, customer.getCusphnno())) {
	        //sessionMap.put("phnError", "Invalid Phone Number.");
	    	context.addMessage("form:phoneno", new FacesMessage("Customer Name Contains min 5 characters"));
	        return false;
	    }

	    if (!Pattern.matches(username, customer.getCususername())) {
	        //sessionMap.put("userError", "Invalid Username. It should be 8-10 characters without spaces.");
	    	context.addMessage("form:username", new FacesMessage("Customer Name Contains min 5 characters"));
	        return false;
	    }

	    if (!Pattern.matches(passWord, customer.getCuspassword())) {
	        //sessionMap.put("passError", "Invalid Password. It should be 8-16 characters with at least one uppercase, one lowercase, one digit, and one special character.");
	    	context.addMessage("form:password", new FacesMessage("Customer Name Contains min 5 characters"));
	        return false;
	    }

	    if (!Pattern.matches(email, customer.getCusemail())) {
	        //sessionMap.put("emailError", "Invalid Email.");
	    	context.addMessage("form:email", new FacesMessage("Customer Name Contains min 5 characters"));
	        return false;
	    }

	    return true;
	}
}
