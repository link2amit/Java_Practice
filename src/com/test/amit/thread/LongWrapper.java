package com.test.amit.thread;

public class LongWrapper {

	Object o = new Object();

	private long l = 0L;

	public long getValue() {
		return l;
	}

	public void increment() {
		synchronized (o) {
			l = l + 1;
		}
	}
}
