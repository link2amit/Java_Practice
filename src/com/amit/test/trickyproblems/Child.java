package com.amit.test.trickyproblems;

public class Child extends Parent {

	@Override
	public void methodToBeOverridden() throws RuntimeException {
		int a = 10, b = 0, c;
		c = a / b;
		System.out.println("Child method");
	}
}
