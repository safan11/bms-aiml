package com.bms.day2.collection;

import java.util.ArrayList;

public class CollectionDemo1 {

	public static void main(String[] args) {

		// unwanted infromation
		ArrayList obj = new ArrayList<>();
		obj.add(1);
		obj.add("anil");
		obj.add(null);
		obj.add(true);
		
		
		//generic collection 
		ArrayList<String> names = new ArrayList<String>();
		names.add("anil");
		names.add("sunil");
		names.add("sushma");
		
		
		
		
	}

}
