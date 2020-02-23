package com.cts.training.controller.Feb22;

public class PriorityThread {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		onePrioty one=new onePrioty ();
		TwoPriority two =new TwoPriority ();
		Thread t1=new Thread(one);
		Thread t2=new Thread(two);
		t1.setPriority(onePrioty.MAX_PRIORITY);
		t2.setPriority(TwoPriority.NORM_PRIORITY+2);
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		
System.out.println("main Thread Priority: "+Thread.currentThread().getPriority());
System.out.println("thread -1:"+t1.getPriority());
System.out.println("thread -2:"+t2.getPriority());
	}

}
