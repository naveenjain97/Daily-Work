//Create a Java program that creates two threads namely Thread1 and Thread2. 
//You need to create a method that prints a table for a specified integer up to 
//10 numbers. Thread1 should print the table of 2 and Thread2 should print the table of 4. The table values must be printed with a delay of 1 second. You need to ensure that only one thread at a time can print the table.
//Further, the name of the thread that is printing the table should be displayed. 





package com.cts.training.controller.Feb22.CWQuestion;

public class QueThread2 implements Runnable {
	public  void run() {
		int num1 = 4;
		for (int i = 1; i <= 10; i++) {
			
		
		try {
			
			Thread.sleep(2000);
			System.out.println("Table of 4 :" + num1*i);
		} catch (InterruptedException e) {

			e.printStackTrace();

			// System.out.println("table of two :"+num1);
		}

	}
}
}