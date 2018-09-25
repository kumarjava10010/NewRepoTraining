package com.java.bnak.MyBankDemo;

public class Deposit {
	
	
	//Constructor
	int acctNumber;
	String acctName;
	
	static int xyz;
	
	public Deposit(int xyz) {
		this.acctNumber = xyz;
		
	}
	
	public Deposit(int acctNumber, String acctName) {
		this.acctNumber = acctNumber;
		this.acctName = acctName;
		
	}
	
	static{
	
		System.out.println("this is my static block");
	}
	
	
	public double depositAmount(double amount) {
		
		// business logic
		// Go to db ==> get current Balance where acctNumber = acctNumber
		
		System.out.println("Acct NUmber : "+acctNumber);
		
		
		
		double currentBalance = 1000.00;
		
		double newbalance = currentBalance + amount ; 
		
		// Go to DB --> update New blance  where acctnumber = acctNumber
		
		return newbalance;
		
		
	}
	
	private void met2() {
		acctNumber = acctNumber +100;
	}
	
}
