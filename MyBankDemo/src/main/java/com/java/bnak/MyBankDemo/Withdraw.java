package com.java.bnak.MyBankDemo;

public class Withdraw {

	public double withdrawAmount(int acctNumber, double amount) {

		// business logic
		// Go to db ==> get current Balance where acctNumber = acctNumber
		double currentBalance = 1000.00;

		double newbalance = currentBalance - amount;

		// Go to DB --> update New blance where acctnumber = acctNumber

		return newbalance;

	}

}
