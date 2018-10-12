package com.bank.service;

import com.bank.persistance.model.Customer;

public interface CustomerServiceIfc {
	
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);


}
