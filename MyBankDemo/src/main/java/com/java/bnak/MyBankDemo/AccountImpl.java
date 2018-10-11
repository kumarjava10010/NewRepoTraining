package com.java.bnak.MyBankDemo;

import java.util.ArrayList;
import java.util.List;

public class AccountImpl implements AccountInterface{

	public List<TransactionHistory> getTransactionHIstory(int acctNumber) {
		
		//DB COdde returns List
		
		List<TransactionHistory> tranHisgtoryList = new ArrayList<TransactionHistory>();
		for (int i = 0; i <5; i++) {
			
			TransactionHistory obj = new TransactionHistory();
			obj.setAcctNo(1234);
			obj.setPrevBalance(100*(i+1)+"");
			obj.setTransactionAmount("50");
			obj.setNewBalance(100*(i+1)+50+"");
			tranHisgtoryList.add(obj);
		}
		
		
		
		return tranHisgtoryList;
	}

}
