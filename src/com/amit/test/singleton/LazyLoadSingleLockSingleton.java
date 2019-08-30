package com.amit.test.singleton;

public class LazyLoadSingleLockSingleton {
	private static LazyLoadSingleLockSingleton INSTANCE;
	private LazyLoadSingleLockSingleton() {
		
	}
	
	public static synchronized LazyLoadSingleLockSingleton getInstance() {
		if(INSTANCE == null) {
				INSTANCE = new LazyLoadSingleLockSingleton();
		}
		return INSTANCE;
	}

}
