package com.java.bnak.MyBankDemo;

public class Casting {
	
	public static void main(String[] a) {
		
		int i =100;
		
		int j =200;
		
		if(i == j) {
			System.out.println("BOth are equal ");
		}
		
		long l = (long)i;
		
		
		System.out.println("l "+l);
		
		int prin =100000;
		
		double prinDouble = (double)prin;
		
		System.out.println("prinDouble "+prinDouble);
		
		StaticDemo.calulatePMI(prinDouble, 24, 0.03);
		
		
	}

}
