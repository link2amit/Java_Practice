package com.amit.test;

public class DoubleTest {

	public static void main(String[] args) {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

		System.out.println(testMethod_One());
	}
	
	private static int testMethod_One() {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
			System.exit(0);
			return c;
			
		} catch (Exception e) {
			System.out.println("inside catch block");
//			return 0;
		} finally {
			System.out.println("Inside finally block");
//			return -1;
		}
		return 0;
	}

}
