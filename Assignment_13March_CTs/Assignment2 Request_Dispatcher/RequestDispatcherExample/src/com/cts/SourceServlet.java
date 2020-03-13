package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("from doGet of Source Servlet");
	String customername =req.getParameter("username");
	int termInYears=Integer.parseInt(req.getParameter("term"));
	int premiumamount=Integer.parseInt(req.getParameter("premium"));
	req.setAttribute("cname",customername);
	req.setAttribute("noOfYears", termInYears);
	req.setAttribute("premium", premiumamount);
	System.out.println("Your paid amount ="+ premiumamount* termInYears);
	PrintWriter pw=resp.getWriter();
	pw.write("<h1>Assured amount &nbsp; &nbsp;"+(premiumamount* termInYears)+"</h1>");
//	resp.sendRedirect("https://maheshwaripulkit.blogspot.com/");
	RequestDispatcher dispatch=req.getRequestDispatcher("/http://localhost:8080/WebApp2/login.html");
	dispatch.include(req, resp);
	
}
	

}
