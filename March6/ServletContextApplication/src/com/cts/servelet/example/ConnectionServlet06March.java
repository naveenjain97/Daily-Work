
package com.cts.servelet.example;

import java.io.IOException;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ConnectionServlet")
public class ConnectionServlet06March extends HttpServlet {
	String user, password, url, driver;
	Connection con;
	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {

		context = config.getServletContext();
		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
		try {
			Class.forName(driver);
			// DriverManager.getConnection(url, user, password);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			System.out.println(config + " from cs2");
			System.out.println(context + "From CS2");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Hello from Service()22222!");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
