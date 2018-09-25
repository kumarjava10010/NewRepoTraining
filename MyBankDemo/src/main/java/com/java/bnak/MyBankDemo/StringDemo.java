package com.java.bnak.MyBankDemo;

public class StringDemo extends Object {

	public static void main(String[] a) {

		String str1 = "hello"; //12eww3
		String str2 = "hello"; //12eww3

		if (str1 == str2) {
			System.out.println("str1 & str2 are equal");
		}else {
			System.out.println("str1 & str2 are not equal");
		}

		String str3 = new String("hello"); // 5685tgedrg

		if (str1 == str3) {
			System.out.println("str1 & str3 are equal");
		} else {
			System.out.println("str1 & str3 are not equal");
		}
		
		String str4 = new String("hello"); // 9076yhfgff
		
		if (str3 == str4) {
			System.out.println("str4 & str3 are equal");
		} else {
			System.out.println("str4 & str3 are not equal");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str4 & str3 are equal");
		} else {
			System.out.println("str4 & str3 are not equal");
		}
		
		if(str1.equals(str4)) {
			System.out.println("str1 & str4 are equal");
		} else {
			System.out.println("str1 & str4 are not equal");
		}
	}

}
