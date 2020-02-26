package com.cts.training.Homework;
import java.util.Scanner;
public class MainC {
	
	    static int NumberofTimes(String str)
	    {
	        int temporary_sum = 0, count = 0;

	        while (str.length() > 1)
	        {
	            temporary_sum = 0;

	            // computing sum of its digits
	            for (int i = 0; i < str.length(); i++)
	                temporary_sum += ( str.charAt(i) - '0' ) ;

	            // converting temporary_sum into string
	            // str again .
	            str = temporary_sum + "" ;


	            count++;
	        }

	        return count;
	    }


	    public static void main(String[] args)
	    {
	    	Scanner Sc =new Scanner(System.in);
	         String s =Sc.nextLine();
	         System.out.println(NumberofTimes(s));
	    }
}
