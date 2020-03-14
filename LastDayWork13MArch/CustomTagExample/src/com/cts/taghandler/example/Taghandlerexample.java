package com.cts.taghandler.example;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Taghandlerexample extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("I am in do");
	JspWriter out=	pageContext.getOut();
	try {
		out.write("<h1>"+new Date()+"</h1>");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		//return super.doStartTag();
	//return EVAL_BODY_INCLUDE;
	return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("I am in End ");
		//return super.doEndTag();
		return EVAL_PAGE;
	}

}
