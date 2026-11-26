package com.bms.day1.oops.encapsulation;


class Customer
{
	int id;
	String name;
	String contactNo;
	
	public Customer(int id, String name, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	
	
}



public class ToStringDemo {

	public static void main(String[] args) {

		int         a      = 10;
		Customer customer = new Customer(1001, "anil", "78787887");
		
		System.out.println("value of a :"+ a);
		System.out.println("value of customer :"+ customer);
		
		
	}

}
