package com.cts.training.controller.Feb22.CWQuestion;

public class PingThread extends Thread {
	  public  void run(){
		  //int num =2;
	        for(int i=1;i<=5;i++) {
	        	
	        	try {
	        	if(i%2!=0)
	        		System.out.println("ping");
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					
					
					e.printStackTrace();
	          
	        }
	    }
	  }
}
