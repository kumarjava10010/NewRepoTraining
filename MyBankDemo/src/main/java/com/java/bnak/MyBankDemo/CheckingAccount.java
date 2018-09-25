package com.java.bnak.MyBankDemo;


public class CheckingAccount extends Account {
	
	/*@param(name= Name holds Account holder firstname and last name)
	 * @param(acctNUmber= acctNUmber holds Account number of the customer )
	*/
	public CheckingAccount(String name, double acctNUmber) {
		super(name, acctNUmber);
		System.out.println("name "+ name);
		System.out.println("acctNUmber "+ acctNUmber);
	}
	
	public double withdrawAmount( double amount) {

		// business logic
		// Go to db ==> get current Balance where acctNumber = acctNumber
		double currentBalance = 1000.00;

		double newbalance = currentBalance - amount;

		// Go to DB --> update New blance where acctnumber = acctNumber

		System.out.println("I am in CheckingAccount class withdrawAmount()");

		return newbalance;

	}

}
