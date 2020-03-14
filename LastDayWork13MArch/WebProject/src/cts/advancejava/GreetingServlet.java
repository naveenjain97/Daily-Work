package cts.advancejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.service(req, resp);
		PrintWriter pw=resp.getWriter();
		String userName=req.getParameter("un");
		String password=req.getParameter("pwd");
		if(password.equals("Jain"))
		{
			pw.write("<h1>Welcome "+ userName+" "+password+"</h1>");
		}
		else
		{
			pw.write("<h1>wrong</h1>");
		}
//		System.out.println(userName);
//		System.out.println(Password);
		//pw.write("<h1>Welcome"+userName+"</h1>");
	}
}
