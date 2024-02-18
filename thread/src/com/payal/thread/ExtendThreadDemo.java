package com.payal.thread;

public class ExtendThreadDemo {

	public static void main(String[] args) {
		 MyResource res = new MyResource();
	        WriterThread th1 = new WriterThread(res);
	        th1.setName("th1");
	        ReadThread th2 = new ReadThread(res);
	        th2.setName("th2"); // Corrected the line to set the name for th2
	        th1.start();
	        th2.start();

	}

}
