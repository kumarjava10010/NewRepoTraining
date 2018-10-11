package com.java.bnak.MyBankDemo;

import java.awt.DisplayMode;

public class StaticDemo {
	
	int a;
	static int b;
	
	static final String checkingAcct = "CHECKING";
	static final String savingAcct = "SAVING";
	
	static final String deFAULTiNTrATE = "1.5";

	
	public StaticDemo() {
		a++; //1
		b++; //2 +1
	}
	
	public void display() {
		System.out.println("Variable A:  "+a); //1
		System.out.println("Static Varible B : "+b); // 1
		

	}
	
	//Utility Method
	public  static double calulatePMI(double principlaBalnce, int term, double interestRate) {
		
		double d = principlaBalnce*term*interestRate/100;
		
		System.out.println(d);
		
		return d;
		
	}

}
