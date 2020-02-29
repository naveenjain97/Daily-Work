package com.cts.training.controller;

 
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDao;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDao obj=new EmployeeDAOImpl();
//		
		
		//Employee employee=new Employee(111,"anhdj","indore","HR",34,98989987,6000l);
	// fetch the data 
		
//		List<Employee>list= obj.getAllEmployees();
//	list.forEach(System.out::println);
	//obj.saveEmployee(employee);
		//update
	Employee emp =obj.getEmployeeById(301);
//		emp.setAge(50);
//		obj.updateEmployee(emp);
// 		System.out.println(emp);
 		//update
 		
 		
 		//delete
 		
 		//Employee employee = new Employee();
		//obj.deleteEmployee(emp);
		//delete
		
		EmployeeDao empObj= new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(2);
		employee1.setName("Naveen");
		empObj.updateEmployee(employee1);
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);

	}

}

