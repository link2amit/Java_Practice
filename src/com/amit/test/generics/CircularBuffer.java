package com.amit.test.generics;

import java.util.Arrays;

public class CircularBuffer {

	final int size;
	private int readCursor;
	private int writeCursor;
	private Object[] buffer;

	public CircularBuffer(int size) {
		this.size = size;
		this.buffer = new Object[size];
		readCursor = 0;
		writeCursor = 0;
	}

	public boolean offer(Object o) {
		if (buffer[writeCursor] == null) {
			buffer[writeCursor] = o;
			writeCursor = next(writeCursor);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private int next(int index) {
		return (index + 1) % buffer.length;
	}

	public Object poll() {
		Object value = buffer[readCursor];
		if (value != null) {
			buffer[readCursor] = null;
			readCursor = next(readCursor);
		}
		return value;
	}
	
	public String toString() {
		return Arrays.toString(buffer);
	}

}
