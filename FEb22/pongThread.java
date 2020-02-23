package com.cts.training.controller.Feb22.CWQuestion;

public class pongThread extends Thread {
	public  void run() {
for (int i = 1; i <= 5; i++) {
			
		
		try {
			if(i%2==0)
			System.out.println("pong");
			Thread.sleep(500);
			
		} catch (InterruptedException e) {

			e.printStackTrace();

			// System.out.println("table of two :"+num1);
		}


}
}}
