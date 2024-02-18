package com.payal.thread;

public class MyReaderWriter {
public void write() {
	for (int i = 1; i <= 5; i++) {
		  try {
			  System.out.println("Writing operation is on line " +i);
      		Thread.sleep(10000);
      	} catch (InterruptedException e) {
      		e.printStackTrace();
	}
 }
}
public void read() {
	for (int i = 1; i <= 5; i++) {
		  try {
			  System.out.println("read operation is on line " +i);
      		Thread.sleep(10000);
      	} catch (InterruptedException e) {
      		e.printStackTrace();

}
	}
}
}
