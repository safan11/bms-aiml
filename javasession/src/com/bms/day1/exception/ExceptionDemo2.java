package com.bms.day1.exception;

class User
{
	void checkEligiblity(int age)
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new ArithmeticException("ag is less");
	}
	
}






public class ExceptionDemo2 {

	public static void main(String[] args) {

	}

}
