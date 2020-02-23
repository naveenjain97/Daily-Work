package com.cts.training.controller.Feb22;

//Synchronization
public class ThreadMain {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2);
		Resource res = new Resource();
		Thread1 one = new Thread1(res);
		Thread2 two = new Thread2(res);
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.start();
		t2.start();

	}
}
