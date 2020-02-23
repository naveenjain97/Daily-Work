package com.cts.training.controller.Feb22;

public class RunnableDemo1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println("Thread-1 :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
