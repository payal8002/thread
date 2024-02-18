package com.mukesh.thread;

public class ThreadDemo {

	public static void main(String[] args) {
	
		Thread thread1 = new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+"Taks executing" +i);
				
			}
	});
		//thread1.setName("Thread1");
		thread1.start();
	
		Thread thread2 = new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+" executing" +i);
				
			}
	});
		//thread2.setName("Thread2");
		thread2.start();
	}
}
