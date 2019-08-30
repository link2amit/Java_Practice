package com.amit.test.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.amit.test.singleton.LazyDoubleLockSingleton;

class SingletonTest {

	@Test
	void test() {
		LazyDoubleLockSingleton ldcs1 = LazyDoubleLockSingleton.getInstance();
		LazyDoubleLockSingleton ldcs2 = LazyDoubleLockSingleton.getInstance();
		assertEquals(ldcs1, ldcs2);
	}

}
