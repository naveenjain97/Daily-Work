package com.cts.servelet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormConnecting
 */
//@WebServlet("/FormConnecting")
public class FormConnecting extends HttpServlet {
	String user, password, driver, url;
	Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			// DriverManager.getConnection(url,user,password,EmpId,salary);
			conn = DriverManager.getConnection(url, user, password);

			System.out.println(conn);
		} catch (Exception e) {
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int eId = Integer.parseInt(req.getParameter("empid"));
		String name = req.getParameter("empname");
		String pass = req.getParameter("pwd");
		int salary = Integer.parseInt(req.getParameter("salary"));
		try {
			PreparedStatement ps;
			String sql = "insert into em values (?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, eId);
			ps.setString(2, name);
			ps.setString(3, pass);
			ps.setInt(4, salary);
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("Data Inserted Successfully!");
			} else {
				System.out.println("Something went wrong..");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
