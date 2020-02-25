package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicManipulation {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter t5he empid");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter t5he Name");
		String name = br.readLine();
		System.out.println("Enter t5he Address");
		String address = br.readLine();
		System.out.println("Enter t5he age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter t5he phone");
		long phone = Long.parseLong(br.readLine());

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "root");
		System.out.println("connection Establish successfully");

		Statement stmt = conn.createStatement();
		String query = "insert into employee values(?,?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setInt(4, age);
		ps.setLong(5, phone);
		int result = ps.executeUpdate();
		
			System.out.println("inserted....");
	
	}
}
