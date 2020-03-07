package com.cts.servelet.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("from in it...........");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From Service");
		if(req.getMethod().equals("GET"))
		{
			doGet(req,resp);
		}
		else {
			doPost(req,resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From do get>>>>>>");
		//doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From doPost.................");
	}

}
