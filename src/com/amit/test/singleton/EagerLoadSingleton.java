package com.amit.test.singleton;

public class EagerLoadSingleton {
	
	private static final EagerLoadSingleton SINGLE_INSTANCE = new EagerLoadSingleton();
	
	private EagerLoadSingleton() {
		
	}
	
	public static EagerLoadSingleton getInstance() {
		return SINGLE_INSTANCE;
	}

}
