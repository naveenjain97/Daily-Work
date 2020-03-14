package com.cts.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * thuid difjkfjkdhjkd
 * @author admin
 *
 */
@WebServlet("/CookieHandler2")
public class CookieHandler2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Cookie cookie[] = request.getCookies();
		if (cookie != null) {
			for (Cookie cookies2 : cookie) {
				out.write("<h2>" + cookies2.getName() + ";&nbsp;&nbsp;&nbsp;" + cookies2.getName());
			}
		} else {
			out.write("<h1> no cokies are associated with the current session</h1>");
		}

	}
}
