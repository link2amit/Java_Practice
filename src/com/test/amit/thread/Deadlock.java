package com.test.amit.thread;

public class Deadlock {
	
	Object key1 = new Object();
	Object key2 = new Object();

	public void method1() {
		synchronized(key1) {
			System.out.println("I am method1, I am synchronized on key1");
			method2();
		}
	}
	
	public void method2() {
		synchronized(key2) {
			System.out.println("I am method2, I am synchronized on key2");
			method3();
		}
	}
	
	public void method3() {
		synchronized(key1) {
			System.out.println("I am medhod3, I am synchronized on key1");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		
		Deadlock d = new Deadlock();
		Runnable t1 = () -> {
			d.method1();
		};
		Runnable t2 = () ->{
			d.method2();
		};
		Thread thread1 = new Thread(t1);
		thread1.start();
		Thread thread2 = new Thread(t2);
		thread2.start();
		thread1.join();
		thread2.join();
		
	}

}
