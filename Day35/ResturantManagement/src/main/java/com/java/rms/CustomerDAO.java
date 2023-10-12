package com.java.rms;

import java.util.List;

public interface CustomerDAO {
	String searchCustomerDetailsDao();
	String addCustomerDao(Customer customer);
	String customerLoginDao(Customer customer);
	List<Customer> showCustomerDao();
	String showCustomerWalletDao();
}
