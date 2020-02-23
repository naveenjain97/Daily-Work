package com.cts.training.controller.Feb22;

//Synchronization
public class Thread2 implements Runnable {
	Resource resource;

	public Thread2(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("Thread-2");
	}

}
