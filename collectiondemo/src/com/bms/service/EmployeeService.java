package com.bms.service;

import java.util.ArrayList;
import java.util.List;

import com.bms.exception.IdNotFoundException;
import com.bms.exception.InValidAgeException;
import com.bms.model.Employee;

public class EmployeeService {

	ArrayList<Employee> employees = new ArrayList<Employee>();

    
	public String addEmployee(Employee employee) throws InValidAgeException
	{
		 if(employee.getAge()<22)
			 throw new InValidAgeException("age is less");
		  employees.add(employee);
		
		return "employee added successfully";
	}
	
	
	public List<Employee> getAllEmployee()
	{
		return employees;
	}
	
	
	public Employee findEmployeeById(int id) throws IdNotFoundException
	{
		boolean found=false;
		for(Employee employee : employees)
		{
			if(employee.getId()==id)
			{
				found=true;
				return employee;
			}
		}
		if(!found)
			throw new IdNotFoundException("employee id not ");
			
		
		return null;
	}


}
