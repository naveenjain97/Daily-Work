package com.cts.filter.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/RequestHandlerServlet")//not necessary to Same
public class SecondFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("from doflair of Second Filter");
		System.out.println("request  preprocessing2 logic --- Fromm SF");
		//System.out.println("from doflair of Second Filter");
		System.out.println("request post-processing2 logic -- from SF");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("From init of Second Filter");
		
	}

}
