package com.cts.training.controller.Feb22;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		//here we have only 1 thread
		
		CreateThread1 one=new CreateThread1();
		CreateThread2 Two=new CreateThread2();//new born state
		
		one.start();
		Two.start();//ready state
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+" : "+i);
//		}

	}

}
