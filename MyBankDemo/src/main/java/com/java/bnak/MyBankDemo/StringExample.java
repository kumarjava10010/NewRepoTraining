package com.java.bnak.MyBankDemo;

public class StringExample {
	
	public static void main (String[] a) {
		
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1.indexOf('o'));
		
		String acct = "123456|Kiran M|1000 Irving| USA|1000.00";
		
		String[] arrayAcc = acct.split("|", 2);
		
		System.out.println(arrayAcc);
		
		for(int i = 0; i<arrayAcc.length ; i++) {
			System.out.println(arrayAcc[i]);
		}
	}

}
