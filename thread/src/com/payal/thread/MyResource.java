package com.payal.thread;

import java.io.Writer;

public class MyResource {
	public synchronized void Writer() {
	
		for (int i = 1; i <= 5; i++) {
			  try {
				  System.out.println(Thread.currentThread().getName()+"Writing operation is on line " +i);
	      		Thread.sleep(10000);
	      	} catch (InterruptedException e) {
	      		e.printStackTrace();
		}
	 }
	}
	public synchronized void read() {
		for (int i = 1; i <= 5; i++) {
			  try {
				  System.out.println(Thread.currentThread().getName()+"read operation is on line " +i);
	      		Thread.sleep(10000);
	      	} catch (InterruptedException e) {
	      		e.printStackTrace();

	}
		}

}
}