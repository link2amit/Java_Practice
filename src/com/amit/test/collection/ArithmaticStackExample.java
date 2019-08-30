package com.amit.test.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArithmaticStackExample {

	private final Deque<String> stack = new ArrayDeque<String>();

	private int process() {
		int result = 0;
		while (stack.size() > 1) {
			int left = Integer.parseInt(stack.pop());
			String operator = stack.pop();
			int right = Integer.parseInt(stack.pop());
			switch (operator) {
			case "+":
				result = left + right;
				break;
			case "-":
				result = left - right;
				break;
			}
			stack.push(String.valueOf(result));
			System.out.println(stack);
		}
		return Integer.parseInt(stack.pop());
	}

	public static void main(String[] args) {
		String str = "1 - 3 + 2 + 4";
		ArithmaticStackExample calculator = new ArithmaticStackExample();
		for(String s : str.split(" "))
			calculator.stack.add(s);
		System.out.println(calculator.process());
	}

}
