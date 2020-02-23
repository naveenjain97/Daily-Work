package com.cts.training.controller.Feb22;

public class RunnableMain {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		// here we have only 1 thread

		RunnableDemo1 one = new RunnableDemo1();
		RunnableDemo2 Two = new RunnableDemo2();// new born state
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(Two);
		// ready state
		t1.start();
		t2.start();

//			for(int i=1;i<=5;i++)
//			{
//				System.out.println(Thread.currentThread().getName()+" : "+i);
//			}

	}

}
