package com.amit.test;

public class PrintBeforeMain {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		PrintBeforeMain m = new PrintBeforeMain();
		System.out.println(m.i);
	}

	static {
		System.out.println("Before Main - Static Block");
	}

	public static int x = myMethod();

	public static int myMethod() {
		System.out.println("Before main - Static method");
		return 0;
	}

	int i = 0;

	{
		System.out.println("Normal block");
		i = 1;
	}
}
