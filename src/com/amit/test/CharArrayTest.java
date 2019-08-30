package com.amit.test;

import java.util.Arrays;

public class CharArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] chars = new char[] {'\u0103'};
		
		String str = new String(chars);
		System.out.println(str);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
