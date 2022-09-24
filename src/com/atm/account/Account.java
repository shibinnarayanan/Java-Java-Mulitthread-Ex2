package com.atm.account;

public class Account {
	
	private int balance = 12000;
	
	public int getBalance()
	{
		return balance;
	}
	
    public void withdraw(int amount)
    {
    	balance = balance-amount;
    }
}
