package com.bms.day1.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("get ready");
		System.out.println("breakfast");
		System.out.println("drive for 10 mts");
		try
		{
			System.out.println(1/1);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("do not divide ");
		}
		
		System.out.println("take elevator");
		System.out.println("enter the class");
		
	}

}
