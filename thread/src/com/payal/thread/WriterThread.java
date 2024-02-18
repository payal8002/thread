package com.payal.thread;

public class WriterThread extends Thread{
	private MyResource mReaderWriter;

	public WriterThread(MyResource res) {
		
		this.mReaderWriter = res;
	}
	
	@Override
	public void run() {
		mReaderWriter.read();
	}
}
