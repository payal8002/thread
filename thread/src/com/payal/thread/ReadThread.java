package com.payal.thread;

public class ReadThread extends Thread{
private MyResource mReaderWriter;

public ReadThread(MyResource res) {
	
	this.mReaderWriter = res;
}
@Override
public void run() {
	mReaderWriter.read();
}
}
