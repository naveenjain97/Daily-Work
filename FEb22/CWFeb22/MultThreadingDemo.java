package com.cts.training.controller.Feb22;

public class MultThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();

		System.out.println(t);//[Main,5,Main] output main is Name of name Thread
		// 5 priority and Main == is Name of Demon
		System.out.println(t.getName());
		t.setName("Demo");
		
		System.out.println("Set the name"+t);
		System.out.println("provide the priority= "+t.getPriority());
		System.out.println("Is Demon= "+t.isDaemon());
		System.out.println("live or not ="+t.isAlive());
	}

}
