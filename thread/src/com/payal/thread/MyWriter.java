package com.payal.thread;

public class MyWriter implements Runnable {

	

	@Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("writing on the file line " + i + "by " + Thread.currentThread().getName());
            try {
        		Thread.sleep(10000);
        	} catch (InterruptedException e) {
        		e.printStackTrace();
        }
    }
}
}