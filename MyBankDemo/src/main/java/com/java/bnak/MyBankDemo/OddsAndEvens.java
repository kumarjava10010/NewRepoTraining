package com.java.bnak.MyBankDemo;

import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {

	public static void Intro() {
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your name");
		String name = input.nextLine();
		System.out.println("hi " + name + " what do you choose (O)dds or (E)even?");
		String user = input.nextLine();
		if (user.equals("O") || user.equals("odds") || user.equals("o") || user.equals("odd")) {
			System.out.println("you have choosed odds! so, computer is even!");

		} else if (user.equals("E") || user.equals("evens") || user.equals("e") || user.equals("even")) {
			System.out.println("you have choosed evens!so, the computer is odd!");
		} else {
			System.out.println("enter either odd or even");
			return;
		}
		System.out.println("--------------------");

		System.out.println("how many finguers you want to put out?");
		int userNum = input.nextInt();
		Random rand = new Random();
		int comNum = rand.nextInt(6);
		System.out.println("the computer played " + comNum + " finguers");
		System.out.println("--------------------");
		int res = userNum + comNum;
		boolean OddorEven = res % 2 == 0; //ture
		boolean usernum = userNum % 2 == 0;
		
		if (OddorEven) { 
			System.out.println(userNum + " + " + comNum + "=" + res);
			System.out.print(res + "......is even!\n");
		}else {
			System.out.println(userNum + " + " + comNum + "=" + res);
			System.out.print(res + "......is odd!");
		}  
		if (user.equals(OddorEven == usernum) || user.equals(OddorEven == usernum)) {
			
			System.out.println("user wins..!");
		}
		// else if (user.equals(OddorEven == false)) {
		// System.out.println("user wins..!");
		// }
		else {
			System.out.println("computer wins...!");
		}

		System.out.println("--------------------");
		
		input.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("let's play odds or evens!");
		OddsAndEvens o = new OddsAndEvens();
		o.Intro();

	}

}
