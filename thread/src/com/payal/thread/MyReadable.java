package com.payal.thread;

public class MyReadable implements Runnable {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 1; i <= 10; i++) {
		
	System.out.println("File is being read line " + i+ " by "+ name);
	try {
		thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
		
	}
	}
	}

}
