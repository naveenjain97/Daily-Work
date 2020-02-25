package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDao;



public class EmployeeDAOImpl implements EmployeeDao {
	Connection conn=getConnection();
	PreparedStatement ps=null;







@Override
public List<Employee> getAllEmployees() {
	// TODO Auto-generated method stub
	List<Employee>employees=new ArrayList<Employee>();
	String sql="select *from employee";
//	try {
//	ps=conn.prepareStatement(sql);
//	ResultSet rs=ps.executeQuery();
//	while(rs.next())
//	{
//		Employee emp=new Employee();
//		emp.setId(rs.getInt("id"));
//		emp.setName(rs.getString("name"));
//		emp.setAge(rs.getInt("age"));
//		emp.setAddress(rs.getString("address"));
//		emp.setPhone(rs.getLong("phone"));
//		emp.setDesignation(rs.getString("designation"));
//		emp.setSalary(rs.getInt("salary"));
//		employees.add(emp);
//	}
//	return employees;
//	}catch(SQLException e)
//	{
//		e.printStackTrace();
//	}
//


	return null;
}
private Connection getConnection() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");


		String url = "jdbc:mysql://localhost:3306/ctspune";

		conn = DriverManager.getConnection(url, "root", "root");
		System.out.println("connection Establish successfully");
		return conn;
	}catch(Exception e)
	{
		return null;
	}
}
@Override
public boolean saveEmployee(Employee employee) {
	// TODO Auto-generated method stub
	String query="insert into employee values (?,?,?,?,?,?,?)";
	try {
		ps=conn.prepareStatement(query);
		ps.setInt(1,employee.getId());
		ps.setString(2,employee.getName());
		ps.setString(3,employee.getAddress());
		ps.setInt(4,employee.getAge());
		ps.setLong(5,employee.getPhone());
		ps.setString(6,employee.getDesignation());
		ps.setInt(7,employee.getSalary());
		ps.executeUpdate();
		return true;
		
	}catch(SQLException e)
	{
		e.printStackTrace();
		return false;
	}
	
}
@Override
public boolean updateEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean deleteEmployee(Employee employee) {
	// TODO Auto-generated method stub
	
	return false;
}
@Override
public Employee getEmployeeById(int id)  {
	// TODO Auto-generated method stub
	String sql="select *from employee where id=?";
	
	try {ps=conn.prepareStatement(sql);
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	Employee emp=null;
	while(rs.next())
	{
		emp=new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAge(rs.getInt("age"));
		emp.setAddress(rs.getString("address"));
	emp.setPhone(rs.getLong("phone"));
		emp.setDesignation(rs.getString("designation"));
		emp.setSalary(rs.getInt("salary"));
		
	}
	return emp;
		
	}catch(SQLException e)
	{
		e.printStackTrace();
	
	}
	return null;
}
}
