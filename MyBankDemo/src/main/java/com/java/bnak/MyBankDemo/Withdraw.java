package com.java.bnak.MyBankDemo;

public class Withdraw extends Account {

	public Withdraw(String name, double acctNUmber) {
		super(name, acctNUmber);
		// TODO Auto-generated constructor stub
	}

	public double withdrawAmount(int acctNumber, double amount) throws BankCustomException {
		// business logic
		// Go to db ==> get current Balance where acctNumber = acctNumber
		double currentBalance = 1000.00;
			//1000.00
		if (currentBalance < amount) {
				// Do not withdraw amount 
			
			// Insufficicnat balance
			
			 throw new BankCustomException("Insufficicnat Funds!!!");
		}

		double newbalance = currentBalance - amount;

		// Go to DB --> update New blance where acctnumber = acctNumber

		return newbalance;

	}

}
