package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.sun.java.swing.plaf.windows.TMSchema.State;

public class Createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "root");
		System.out.println("connection Establish successfully");
		Statement stmt = conn.createStatement();

		//String Query = "insert into emp values(2,'Vishnu','Surat')";
// String Query ="alter table emp add pincode int";
		String Query="update emp set pincode=5446 where id=2";
		int result = stmt.executeUpdate(Query);
		if(result>0)
		{
			System.out.println("created");
		}
		else
		{
			System.out.println(" Not created");
		}
			
	
	}

}
