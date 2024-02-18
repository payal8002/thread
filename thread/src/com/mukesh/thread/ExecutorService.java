package com.mukesh.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {
	 public static void main(String[] args) {
	        Executor executor = Executors.newSingleThreadExecutor();
	   

	        executor.execute(() ->{
	                System.out.println(Thread.currentThread().getName()+"ExecutorService Thread Demo");
	    });
	 }

	
	}

	

