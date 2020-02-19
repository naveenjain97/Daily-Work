package com.cognizant.traning;
import java.util.Scanner;
public class CwQuestion2 {

	   public static void main(String[] args){

		   int count = 0;
		   
		   System.out.println("Enter the lower");
		   Scanner sc=new Scanner(System.in);
		   int lower=sc.nextInt();
		   int upper =sc.nextInt();
		    for(int i = lower; i<=upper; i++)
		    {
		    	
		        String number = String.valueOf(i);
		        while(number.contains("1"))
		        {
		            number= number.substring(number.indexOf("1")+1);
		            count ++;
		        }
		    }
		    System.out.println(count);
	   }
}