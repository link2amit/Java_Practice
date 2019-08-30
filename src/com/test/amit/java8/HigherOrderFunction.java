package com.test.amit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HigherOrderFunction {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Collections.sort(list, (a, b) -> a.compareTo(b));
		
		System.out.println(list);
	}

}
