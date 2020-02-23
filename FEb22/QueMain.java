//Create a Java program that creates two threads namely Thread1 and Thread2. 
//You need to create a method that prints a table for a specified integer up to 
//10 numbers. Thread1 should print the table of 2 and Thread2 should print the table of 4. The table values must be printed with a delay of 1 second. You need to ensure that only one thread at a time can print the table.
//Further, the name of the thread that is printing the table should be displayed. 



package com.cts.training.controller.Feb22.CWQuestion;

public class QueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueThread1  t11 = new QueThread1  ();
		QueThread2  t22 = new QueThread2 ();
	        Thread onee = new Thread (t11);
	        Thread twoo = new Thread(t22);
	        onee.start();
	       
	        try {
	        	onee.join();
	        }
	        catch(Exception e){System.out.println(e);}
	        twoo.start();
	        }

	}


