package com.cts.training.controller.Feb22;

public class CreateThread2 extends Thread {
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			System.out.println("Thread-2:"+i);
		}
	}

}
