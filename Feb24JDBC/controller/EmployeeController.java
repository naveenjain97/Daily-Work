package com.cts.training.controller;


import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDao;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDao obj=new EmployeeDAOImpl();
//		Employee employee=new Employee(111,"anhdj","indore","HR",34,98989987,6000l);
//		List<Employee>list= obj.getAllEmployees();
//		list.forEach(System.out::println);
	//obj.saveEmployee(employee);
		
		Employee emp =obj.getEmployeeById(111);
		System.out.println(emp);
		//Employee employee=new Employee();
		//obj.deleteEmployee(employee); 

	}

}

