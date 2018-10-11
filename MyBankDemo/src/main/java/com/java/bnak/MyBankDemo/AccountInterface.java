package com.java.bnak.MyBankDemo;

import java.util.List;

public interface AccountInterface {
	
	 public List<TransactionHistory> getTransactionHIstory(int acctNumber);
	 
	/* default int getInterestRate() {
		 int interstRate = 1;
		 
		 //Business lOgic
		 
		 return interstRate;
	 }
	 
	 static int getARMInterestRate() {
		 int interstRate = 2;
		 
		 //Business lOgic
		 
		 return interstRate;
	 }*/
	
}
