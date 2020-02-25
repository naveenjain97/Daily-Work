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
public class UpdateDynamic {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter t5he empid");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter t5he Name");
		String name = br.readLine();
//		System.out.println("Enter t5he Address");
//		String address = br.readLine();
//		System.out.println("Enter t5he age");
//		int age = Integer.parseInt(br.readLine());
//		System.out.println("Enter t5he phone");
//		long phone = Long.parseLong(br.readLine());

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		System.out.println("connection Establish successfully");

		Connection conn = DriverManager.getConnection(url, "root", "root");
		
		
		
		String query="update employee set name=? where id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1,name);
		ps.setInt(2,id);
		int result=ps.executeUpdate();

		System.out.println("updated successfully....");

		
		

	}
}
