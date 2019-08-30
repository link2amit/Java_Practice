package com.amit.test.singleton;

public class NestedInnerClassSingleton {
	
	private NestedInnerClassSingleton() {
		
	}
	
	private static class InnerClass{
		static final NestedInnerClassSingleton INSTANCE = new NestedInnerClassSingleton();
	}
	
	public static NestedInnerClassSingleton getInstance() {
		return InnerClass.INSTANCE;
	}

}
