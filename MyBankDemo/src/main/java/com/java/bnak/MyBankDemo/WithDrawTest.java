package com.java.bnak.MyBankDemo;

public class WithDrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account("Robert", 1234);
		
		double newBalce;
		try {
			newBalce = obj.depositAmount(2000.00);
			System.out.println(newBalce);
		} catch (BankCustomException e) {
			//e.printStackTrace();
			
			System.out.println(" I am in Exception Block::::::   "+e.getMessage());
		}
		
		

	}

}
