package com.bms.day1.oops;

class Account1
{
	Account1()
	{
		System.out.println("Account default constructor");
	}
	
	Account1(int id)
	{
		System.out.println("Account parameter constructor ");
		System.out.println("Id is "+ id);
	}
}

class SavingAccount extends Account1
{
	SavingAccount()
	{   
		super(); // it is going to call the parent class constructor
		System.out.println("saving account constructor");
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount();
		
	}

}
