package com.cts.training.controller.Feb22.CWQuestion;

public class PingPongMain extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PingThread  t111 = new PingThread ();
		pongThread  t222 = new pongThread();
	        Thread oneee = new Thread (t111);
	        Thread twooo = new Thread(t222);
	        oneee.start();
	        twooo.start();
//	        try {
//	        	oneee.join();
//	        	}
//	        catch(Exception e){System.out.println(e);}
	      
	        }

	
}

	
	
	


