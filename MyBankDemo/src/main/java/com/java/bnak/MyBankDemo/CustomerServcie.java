package com.java.bnak.MyBankDemo;

public class CustomerServcie {
	
	
	public void saveCustomer(CustomerPojo cust) {
		
		System.out.println(cust.getFn());
		System.out.println(cust.getLn());

		// Find any customer with same SSN
		CustomerPojo custfromDB = new CustomerPojo();
		custfromDB.setFn("JOhn");
		custfromDB.setLn("weber");
		
		if(custfromDB.equals(cust)) {
			System.out.println("both are equal ");
		}else {
			System.out.println("both are not equal");
		}
		
		
		System.out.println(cust.hashCode());
		System.out.println(custfromDB.hashCode());
		
		// logic to save data into DB
	}

}
