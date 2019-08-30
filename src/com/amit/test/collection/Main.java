package com.amit.test.collection;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		String str = "key";
		myMap.put(str, "Amit");
		System.out.println(myMap.get(str));
		str = "new_key";
		System.out.println(myMap.get(str));
	}

}
