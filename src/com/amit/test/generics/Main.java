package com.amit.test.generics;

public class Main {

	public static void main(String[] args) {
		CircularBuffer circularBuffer = new CircularBuffer(5);
		circularBuffer.offer("a");
		circularBuffer.offer("b");
		circularBuffer.offer("c");
		circularBuffer.offer("d");
		String val;
		String result = "";
		System.out.println(circularBuffer);
		while ((val = (String) circularBuffer.poll()) != null) {
			result += val;
			System.out.println(val);
		}
		System.out.println(result);
	}

}
