package com.atrm.withdrawProcess;

import com.atm.account.Account;

public class WithdrawService implements Runnable{
	
	private Account acc;
	
	public WithdrawService(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			try {
				makeWithdrawal(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private synchronized void makeWithdrawal(int amnt) throws InterruptedException {
		
		if(acc.getBalance()>=amnt)
		{
			System.out.println(Thread.currentThread().getName() +" is going to withdraw amnt");
			acc.withdraw(amnt);
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" successfully withdrawn "+amnt);
			
		}
		else
		{System.out.println("Not enough money in account for "+Thread.currentThread().getName());}	
	}

}
