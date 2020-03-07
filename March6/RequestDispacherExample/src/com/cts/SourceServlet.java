package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SourceServlet
 */
@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From  doGet of SoucerService ...");
		String custName=req.getParameter("CustomerName");
		int term=Integer.parseInt(req.getParameter("Term"));
		int premiumamout=Integer.parseInt(req.getParameter("Premium"));
		//fetching data 
		req.setAttribute("customerName", custName);
		req.setAttribute("noOfYear", term);
		req.setAttribute("amount", premiumamout );
		
		System.out.println("your Paid amount ==="+(premiumamout*term));
		
		PrintWriter pw= resp.getWriter();
		pw.write("<h1> Your Paid Amount &nbsp;&nbsp;"+(premiumamout*term)+"</h1>");
		
		resp.sendRedirect("http://www.google.com");
		
//		RequestDispatcher dispacher=req.getRequestDispatcher("/http://localhost:8080/WebProject/Form.html");
//		dispacher.include(req, resp);
	}
}