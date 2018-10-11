package com.java.bnak.MyBankDemo;

import java.util.Timer;
import java.util.TimerTask;

public class MyTzimerDemo extends TimerTask{

	@Override
	public void run() {
		System.out.println("My Task Started");
		
		try {
			releaseChecks();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("MY Task Ended");
		
		System.out.println("___________________________");
		
	}
	
	public void releaseChecks() throws InterruptedException {
		//GO to DB
		//Get All CHASE check infomration
		//Go to CHASE Applicaiton
		//Pass all checks info.. chase validate all checks 
		//get the money from chase
		
		System.out.println("Check releasing ");
		
		Thread.sleep(100);
	}
	
	public static void main(String[] a) {
		Timer timer = new Timer();
		TimerTask task = new MyTzimerDemo();
		//timer.schedule(task, 10000, 100000);
		
		timer.scheduleAtFixedRate(task, 1000, 10000);
		
		System.out.println("I am here");
		
	}

}
