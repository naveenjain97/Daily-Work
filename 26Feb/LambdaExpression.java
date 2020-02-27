package com.cognizant.traning.nestedClass;

public class LambdaExpression {
	public static void main(String[] args) {
//		MyThread T=new MyThread();
//		Thread thread =new Thread(T);
//		thread.start();
		
		
//		Runnable r=()->System.out.println("Hello runnable");
//		Thread thread =new Thread(r);
//		thread.start();
		Hello h=()->"Good Morning";
		System.out.println(h.greeting());
	}
}
interface Hello
{
	

	String greeting();
	
}

//class MyThread implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("hello Runnable");
//
//	}
//
//}