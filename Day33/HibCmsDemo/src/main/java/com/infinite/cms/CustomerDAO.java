package com.infinite.cms;


public interface CustomerDAO {
	String addCustomerDao(Customer customer);
	String validateMe(Customer customer);
	Customer searchByCustomerUser(String userName);
}
