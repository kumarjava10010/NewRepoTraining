package com.java.bnak.MyBankDemo;

 public class Account {

	public String acctHolderName;
	double acctNumber;

	private final double DEFAULT_INT_RATE = 2.5;

	public Account(String name, double acctNUmber) {

		this.acctHolderName = name;
		this.acctNumber = acctNUmber;

	}

	public double depositAmount(double amount) throws BankCustomException {

		// business logic
		// Go to db ==> get current Balance where acctNumber = acctNumber  DAoClass
		
		// Account is not active 
		
		boolean isAcctActive = true;
		
		if(acctNumber == 1234) {
			isAcctActive = false;
		}
		
		if(!isAcctActive) {
			throw new BankCustomException("Account is not Active");
		}

		double currentBalance = 1000.00;

		double newbalance = currentBalance + amount;

		// Go to DB --> update New blance where acctnumber = acctNumber
		System.out.println("I am in Account class depositAmount()");

		return newbalance;

	}

	protected double getInterestRate() {
		
		System.out.println("Super Class Interest Rate ");

		return DEFAULT_INT_RATE;
	}
	
	public void helperMethod() {
		
	}

}
