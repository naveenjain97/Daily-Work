package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// 1. load database Driver
		Class.forName("com.mysql.jdbc.Driver");

		// 1.2

		// Driver driver=new com.mysql.jdbc.Driver();

		// 2 Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "root");
		System.out.println("connection Establish successfully");

		// System.out.println(conn.getClass().getName());
		// Executing SQL Queries
		Statement stmt = conn.createStatement();

		//String query = "insert into employee values(3,'niraj paliwal','khandwa',22,908765432)";
		//String query = "delete from employee  where id=3";
		
		String query = "Select  * from employee";
		
		
		//String query = "update employee set address='Indore' where id=1";
		ResultSet result = stmt.executeQuery(query);
		while(result.next())
		{
			int id=result.getInt("id");
			String name=result.getString(2);
			String address=result.getString(3);
			int age=result.getInt(4);
			long phone=result.getLong(5);
			System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
		//	System.out.println(age);
		}
		
	}

}
