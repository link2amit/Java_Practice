package com.test.amit.thread;

public class Consumer {

	int[] buffer;
	int size;

	public Consumer(int[] buffer, int size) {
		buffer = new int[size];
	}

	public void consume() {
		while (buffer.length > 0) {
			buffer[--size] = 0;
		}
	}

}
