package com.cts.training.controller.Feb22;
//Synchronization
public class Thread1 implements Runnable {
	Resource resource;

	public Thread1(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("Thread-1");
	}

}
