package com.cts.training.controller.Feb22;
import java.util.*;
public class StringChange {
	
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String = ");
			String name1=sc.nextLine();
			String name2=modify(name1);
			System.out.println(name2);
			sc.close();
		}
		static String  modify(String name)
		{	String s=name;
		    s=s.replaceAll("yes", "s");
		    s=s.replaceAll("you","u");
		    s=s.replaceAll("today", "2day");
		    s=s.replaceAll("why","y");
			return s;
			
		}
	}
