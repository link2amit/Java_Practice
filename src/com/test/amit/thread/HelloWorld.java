package com.test.amit.thread;

public class HelloWorld {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		Thread t = new Thread(r);
		t.start();
		
	}

}
