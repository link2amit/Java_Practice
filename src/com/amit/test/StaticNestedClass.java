package com.amit.test;

public class StaticNestedClass {

	private static int a = 0;

	public static final class NestedClass {
		private static int b = 1;

		public static void staticMethod() {
			System.out.println("a= " + a);
			System.out.println("b= " + b);
		}

		public void nonStaticMethod() {
			System.out.println("Non static a: " + a);
			System.out.println("Non static b: " + b);
		}
	}

}
