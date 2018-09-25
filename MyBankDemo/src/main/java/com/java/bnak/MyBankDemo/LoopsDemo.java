/**
 * 
 */
package com.java.bnak.MyBankDemo;

/**
 * @author cragh
 *
 */
public class LoopsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//IF 
		LoopsDemo obj = new LoopsDemo();
		
		boolean isTransactionAllowed = obj.ifDemo(1000, 2000);
		
		System.out.println("Transaction Allowed : "+isTransactionAllowed);
		//For
		
		for(int i =0; i<10; i++) {
			System.out.println("Hello "+i);
		}
		
		//while
		
		int x =0;
		
		while(x<=5) {
			System.out.println("My X value is  " + x);
			x++;
		}
		
		//Swith
		int day =2;
		String today;
		
		switch(day) {
		case 1:
			today = "monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednsday";
			break;
			
		default:
			today = "sunday";
			break;
		
		}
		
		System.out.println(today);

	}
	
	public boolean ifDemo(int cuurentBalnce, int withdrawAmount) {
		
		
		// Current balance from DB 
		
		if(cuurentBalnce <= withdrawAmount) {
			return false;
		}else if(cuurentBalnce == withdrawAmount) {
			return true;
		}
		
		return false;
	}

}
