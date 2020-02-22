package com.cts.training.controller.Feb21;
import java.io.Console; 
public class ConsoleDemo {
  
	public static void main(String args[])throws NullPointerException {    
	Console con= System.console();
	System.out.println("Enter your name");
	String name=con.readLine();
	System.out.println("Welcome"+con);
	
	}
	}  