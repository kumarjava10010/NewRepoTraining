package com.java.bnak.MyBankDemo;

/**
 * Hello world!
 *
 */
public class TestClient {
	public static void main(String[] args) throws CloneNotSupportedException {

		TestClient test = new TestClient();
		CustomerPojo myCust = new CustomerPojo();

		myCust.setFn("JOhn");
		myCust.setLn("weber");

		Object obj = myCust.clone();

		System.out.println(myCust.getFn()); // JOhn

		if (obj instanceof CustomerPojo) {
			CustomerPojo obj11 = (CustomerPojo) obj;
		} else {

		}
		

		/*
		 * CustomerServcie service = new CustomerServcie();
		 * 
		 * service.saveCustomer(myCust);
		 */

		/*
		 * System.out.println( "Hello World!" );
		 * 
		 * int x = 100;
		 * 
		 * double d =123.54;
		 * 
		 * Deposit myDepositBiject = new Deposit(12345);
		 */

		/*
		 * Deposit myDepositBiject2 = new Deposit(345667);
		 * 
		 * double result = myDepositBiject.depositAmount(500.00);
		 * 
		 * System.out.println(result);
		 * 
		 * SavingAccount savingObjct = new SavingAccount("Kiran", 12345);
		 * 
		 * double savingBalance = savingObjct.depositAmount(100.00);
		 * 
		 * System.out.println("Saving Balance  "+ savingBalance);
		 * 
		 * 
		 * CheckingAccount checkingObj = new CheckingAccount("Kiran", 12345);
		 * 
		 * double checkingBalance = checkingObj.depositAmount(500.00);
		 * 
		 * System.out.println("checkingBalance "+checkingBalance);
		 */

	}

	public void method(CustomerPojo obj) throws CloneNotSupportedException {

		obj.setFn("XYZ");

		System.out.println(obj.getFn()); // XYZ

	}
}
