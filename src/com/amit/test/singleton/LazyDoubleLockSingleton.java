package com.amit.test.singleton;

public class LazyDoubleLockSingleton {
	private static LazyDoubleLockSingleton INSTANCE;

	private LazyDoubleLockSingleton() {

	}

	public static LazyDoubleLockSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyDoubleLockSingleton.class) {
				if (INSTANCE == null)
					INSTANCE = new LazyDoubleLockSingleton();
			}
		}
		return INSTANCE;
	}
}
