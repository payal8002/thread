package com.mukesh.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableInterface {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 ExecutorService service1 = (ExecutorService) Executors.newSingleThreadExecutor();
	        Future<?> future1 = ((ExecutorService) service1).submit(() -> {
	            System.out.println("Executing task by Runnable run() method returns nothing ");
	        });
	        System.out.println("Result: " + future1.get());
	        service1.shutdown();
	        
	
	
	 ExecutorService service2 = (ExecutorService) Executors.newSingleThreadExecutor();
     Future<?> future2 = ((ExecutorService) service2).submit(() -> {
         System.out.println("Executing task by Callable run() method returns a value  ");
         return 10;
     });
     System.out.println("Result: " + future2.get());
     service2.shutdown();
     
}

}

