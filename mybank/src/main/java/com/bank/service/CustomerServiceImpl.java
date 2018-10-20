package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.persistance.dao.CustomerDaoIfc;
import com.bank.persistance.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerServiceIfc{

	
	@Autowired
	CustomerDaoIfc customerDao;
	
	
	public Customer createCustomer(Customer customer) {
		// SSN --> we will cal some third party app to get your score
		// Address verification
		// background check
		//ID verification
		System.out.println("I am in CustomerServiceImpl ClASS ");
		@SuppressWarnings("unused")
		int result = customerDao.save(customer);
		
		return customer;
	}

	public Customer updateCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCusttomer(int acctNo) {
		
		return customerDao.findByAcctNumber(acctNo);
	}

}
