package com.atm.client;

import com.atm.account.Account;
import com.atrm.withdrawProcess.WithdrawService;

public class Client {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
				
		WithdrawService wth = new WithdrawService(acc);
		
		Thread t1 = new Thread(wth);
		Thread t2 = new Thread(wth);
		
		t1.setName("Shibin");
		t2.setName("Swetha");
		
		t1.start();
		t2.start();
	}

}
