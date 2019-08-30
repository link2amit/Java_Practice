package com.amit.test;

import java.util.LinkedList;
import java.util.List;

public class InnerClassExample {

	private final int a = 0;
	
	private List<String> linkedList = new LinkedList<>();
	
	public void outerMethod() {
		
		System.out.println(InnerClass.b);
	}

	public class InnerClass {

		public static final int b = 1;

		public void innerMethod() {
			System.out.println("Inner Method: " + a);
		}
	}

}
