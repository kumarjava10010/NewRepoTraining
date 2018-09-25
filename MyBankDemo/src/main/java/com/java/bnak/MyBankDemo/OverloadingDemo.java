package com.java.bnak.MyBankDemo;

public class OverloadingDemo {

	// MonthlyPaymnet.java
	public double getMonthlyPayment(double principal, double interest, int term) {

		// Go to DB
		return (principal * interest * term) / 100;
	}

	public double getMonthlyPayment(String principal, double interest, int term) {

		double d = Double.valueOf(principal);
		// Go to DB
		return (d * interest * term) / 100;
	}

	public double getMonthlyPayment(String principal, String interest, int term) {

		double d = Double.valueOf(interest);
		
		double principalDouble = Double.valueOf(principal);
		// Go to DB
		return (d * principalDouble * term) / 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
