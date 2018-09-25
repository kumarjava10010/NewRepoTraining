package com.java.bnak.MyBankDemo;

public class CastingDemo {

	public static void main(String[] args) { 
		
		CastingDemo demoObj = new CastingDemo();
		
		// Normal usage
		Account acctObj = new Account("kumar", 1234);
		double newBal = acctObj.depositAmount(100.00);
		System.out.println("My New Balance  : "+newBal);
		
		
		//Casting from a subclass to a superclass is called upcasting
		Account acctObj1 = new CheckingAccount("kumar", 1234);
		
		double newBal1 = acctObj1.depositAmount(100.00);
		System.out.println("My New Balance 1 : "+newBal1);
		
		// we cannot invoke withdraw method on acctObje=
		// acctObj.withdrawAmount(100.00);
		
		
		// casting from a superclass to a subclass
		
		Account acctObj2 = new CheckingAccount("kumar", 1234);
		
		//To call withdraw() we should downcast Account to CheckingAccount:
		double newBal2 = ((CheckingAccount) acctObj2).withdrawAmount(100.00);
		
		System.out.println("My New Balance 2 : "+newBal2);
		
		//Instance of - above example we’re trying to downcast only those objects which are really instances of CheckingAccount. To do this, we use the operator instanceof.
		
		double newBal3 = demoObj.withdrawTransaction(acctObj2, 500.00);
		System.out.println("My New Balance 3 : "+newBal3);

		//If we hadn’t checked the type with the instanceof operator, the compiler wouldn’t have complained. But at runtime, there would be an exception.
		Account acctObj4 = new SavingAccount("kumar", 1234);
		double newBal4 = demoObj.withdrawTransaction(acctObj4, 500.00);
		System.out.println("My New Balance 3 : "+newBal4);

	}
	
	public double withdrawTransaction(Object obj, double amount) {
		double newbalance = 0.0;
		
		if(obj instanceof CheckingAccount) {
			newbalance = ((CheckingAccount) obj).withdrawAmount(amount);
		}
		return newbalance;
	}

}