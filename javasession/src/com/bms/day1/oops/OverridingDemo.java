package com.bms.day1.oops;

class Parent 
{
	void breakfast()
	{
		System.out.println("idly");
	}
	void marry()
	{
		System.out.println("swetha");
	}
}

class Child extends Parent
{
	
	void marry()
	{
		System.out.println("sushma");
	}
	
	void sport()
	{
		System.out.println("badminton");
	}
}



public class OverridingDemo {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
		child.marry();
		child.sport();
		
		System.out.println("-----------------");
		
		Parent parent = new Child();
		parent.breakfast();
		parent.marry();
		//parent.sport();
		
	}

}
