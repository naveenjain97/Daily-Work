package com.cts.training.controller;
import java.util.Scanner;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		int id,id1;
		System.out.println("Eneter the id");
		Scanner sc=new Scanner(System.in);
	//	id=sc.nextInt();
		
	     id1=sc.nextInt();
	
		
		
		
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
//		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
//		empObj.addEmployee(emp);
		empObj.deleteEmployee(id1);
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
		
		
		//update
//		Employee em=empObj.getEmployeeById(id2);
//		for(Employee emp1:employees)
//		{
//		
//		if (emp1.getId() ==id2)
//		{ 
//			return (set(id.))
//		}
//		
//		
		
		
		
		//Delete
		
		//Employee em=empObj.getEmployeeById(id); 
	
		//Employee em1=empObj.getEmployeeById(id2); 
		
	//	System.out.println("First element of the ArrayList: "+em1);
		//System.out.println("First element of the ArrayList: "+em1);
//		System.out.println("Delete element of the ArrayList: "+emp);
	}

}

