package com.java.bnak.MyBankDemo;

public class SavingAccount extends Account{

	public SavingAccount(String name, double acctNUmber) {
		super(name, acctNUmber);
		System.out.println("name "+ name);
		System.out.println("acctNUmber "+ acctNUmber);
		
	}
	
	@Override
	public double getInterestRate() {
		
		// Got o DB or Property FIles or Third party applications
		
		System.out.println("Override Interest Rate ");
		return 4.5;
	}
	
	public static void main(String[] a) {
		
		SavingAccount saveAcct = new SavingAccount("Robert", 12345);
		
		double intRate = saveAcct.getInterestRate();
		
		System.out.println(intRate);
	}
	

}
