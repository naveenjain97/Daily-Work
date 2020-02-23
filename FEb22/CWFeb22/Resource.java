package com.cts.training.controller.Feb22;
//Synchronization
public class Resource {
	public /*synchronized*/ void display(String name) {
		
		synchronized(this)
		{
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name Count:" + i + " -" + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
}
