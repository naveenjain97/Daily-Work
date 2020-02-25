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
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FetchDynamic {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the empid");
		int id = Integer.parseInt(br.readLine());

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");

		System.out.println("connection Establish successfully");
		String query = "select * from employee ";
		PreparedStatement ps = conn.prepareStatement(query);

		//ps.setInt(1, id);
		ResultSet res = ps.executeQuery();
		while(res.next())
			
		{
		int id1=res.getInt("id");
		String namee=	res.getString( "name");
		String add=	res.getString( "address");
		int agee=	res.getInt("age");
		long phonee=	res.getLong("phone");
		System.out.println(id1+" "+namee+" "+add +" "+agee +""+phonee);
		}
		System.out.println("Fetch  successfully....");

	}

}
