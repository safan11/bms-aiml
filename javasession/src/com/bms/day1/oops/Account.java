package com.bms.day1.oops;

public class Account {

	int accountNumber;
	String accountHolderName;
	double balance;
	double rateOfInterest;
	
	public Account(int accountNumber, String accountHolderName, double balance, double rateOfInterest) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
	}
	
	void withdraw(double amount)
	{
		// balance=balance-amount
		if(balance>amount)
		{
			balance-=amount;
			System.out.println("withdraw successful of amount: "+ amount);
		}
		    
		else
			System.out.println("insuffcient fund");
	}
	
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("successfully deposit of amount :"+ amount);
	}
	
	void displayBalance()
	{
	   System.out.println("Your Balance is :"+ balance);	
	}
	
	
}
