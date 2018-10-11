package com.java.bnak.MyBankDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		

	}

	public static void listDemo() {
		// TODO Auto-generated method stub

		AccountInterface obj = new AccountImpl();

		List<TransactionHistory> myTranList = obj.getTransactionHIstory(1234);

		// Traversing list through Iterator

		// Iterator<TransactionHistory> itr= myTranList.iterator();

		/*
		 * while(itr.hasNext()){ TransactionHistory tranObj = itr.next();
		 * System.out.println(tranObj.toString());
		 * 
		 * }
		 */
		System.out.println("******************");

		/*
		 * for (int i = 0; i < myTranList.size(); i++) {
		 * 
		 * TransactionHistory tranObj = myTranList.get(i);
		 * System.out.println(tranObj.toString());
		 * 
		 * }
		 */

		for (TransactionHistory transactionHistory : myTranList) {
			System.out.println(transactionHistory.toString());
			// DB
			//Apply Business logic
			//Send this info to UI
			//Other applicaiton
			
		}
		

		List<TransactionHistory> tranHisgtoryList2 = new ArrayList<TransactionHistory>();
		for (int i = 0; i < 5; i++) {

			TransactionHistory obj2 = new TransactionHistory();
			obj2.setAcctNo(123456);
			obj2.setPrevBalance(1000 * (i + 1) + "");
			obj2.setTransactionAmount("500");
			obj2.setNewBalance(1000 * (i + 1) + 500 + "");
			tranHisgtoryList2.add(obj2);
		}

		myTranList.addAll(tranHisgtoryList2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		for (TransactionHistory transactionHistory : myTranList) {
			System.out.println(transactionHistory.toString());
		}

		HashMap<String, List<String>> mymap = new HashMap<String, List<String>>();

		List<String> usastateList = new ArrayList<String>();
		List<String> indstateList = new ArrayList<String>();
		List<String> ukstateList = new ArrayList<String>();

		mymap.put("USA", usastateList);

		mymap.put("India", indstateList);

		mymap.put("UK", ukstateList);
	}
	
	public void myMethod() {
		
		// all my business
	}

}
