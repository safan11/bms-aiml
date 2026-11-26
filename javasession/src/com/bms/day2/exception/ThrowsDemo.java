package com.bms.day2.exception;

class InValidAgeException extends Exception 
{
	public InValidAgeException(String msg) {
       super(msg);
	}
}



public class ThrowsDemo {

	void validageAge(int age) throws InValidAgeException
	{
		if(age<18)
		{
			throw new InValidAgeException("age is less");
		}
		else 
			System.out.println("eligible to vote");
	}
	
	public static void main(String[] args)   {

		ThrowsDemo throwsDemo = new ThrowsDemo();
		try
		{
			throwsDemo.validageAge(2);
		}
		catch (InValidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
