package com.test.amit.thread;

public class TestLongWrapper {

	public static void main(String[] args) throws InterruptedException {
		LongWrapper lw = new LongWrapper();
		Runnable thread = () -> {
			for (int i = 0; i < 1000; i++) {
				lw.increment();
			}
		};
		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(thread);
			threads[i].start();
			
		}
		
		for(int i=0; i<threads.length; i++)
			threads[i].join();
		
		System.out.println(lw.getValue());
	}

}
