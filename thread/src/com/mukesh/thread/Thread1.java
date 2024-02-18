package com.mukesh.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Thread1 {
public static void main(String[] args) {
	ExecutorService executor= (ExecutorService) Executors.newFixedThreadPool(3);
	for (int i = 0; i < 5; i++) {
		((Executor) executor).execute(() ->{
			System.out.println(Thread.currentThread().getName()+ " Executing task ");
			
		});
		
		
	}
}
}
