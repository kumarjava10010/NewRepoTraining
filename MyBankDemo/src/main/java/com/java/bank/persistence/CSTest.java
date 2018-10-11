package com.java.bank.persistence;

public class CSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerServicesIfc customerSer = new CustomerServiceImpl();
		
		Customer customer = customerSer.getCustomer(1234);
		
		System.out.println(customer.toString());

	}

}
