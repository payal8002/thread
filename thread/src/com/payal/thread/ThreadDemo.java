package com.payal.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("main() running by "+Thread.currentThread().getName());
		MyWriter w = new MyWriter();
		MyReadable r = new MyReadable();
		Thread t1 = new Thread(w);
		t1.setName("Writer thread");
		Thread t2 = new Thread(r);
		t2.setName("Readar thread");
		t1.start();
		t2.start();
		System.out.println("main() finished by "+Thread.currentThread().getName());

	}

}
