package com.bms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	@GetMapping("/aboutus")
	public String aboutUs()
	{
		return "this is about us";
	}
	
}
