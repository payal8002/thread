package com.mukesh.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRealLifeExample {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	 ExecutorService service2 = (ExecutorService) Executors.newSingleThreadExecutor();
	 Future<?> future2 = ((ExecutorService) service2).submit(() -> {
		 System.out.println("OTP Generaged and sent to your phone number");
		 Thread.sleep(5000);
		 return 1234;
	 });
	while(!future2.isDone()) {
		System.out.println("Waiting for OTP");
		Thread.sleep(1000);
		
	}
	 System.out.println("Result: " + future2.get());
     service2.shutdown();
     
}
}
