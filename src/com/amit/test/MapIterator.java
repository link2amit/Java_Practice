package com.amit.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Amit
 *
 */
public class MapIterator {

	private final Map<String, String> products = new HashMap<String, String>();

	public MapIterator() {
		products.put("1", "Door");
		products.put("2", "Window");
		products.put("3", "Floor Panel");

	}

	public void iterateThroughKeys() {
		Set<String> keys = products.keySet();
		for (String key : keys) {
			System.out.println("key -> " + key + " value -> " + products.get(key));
		}
	}

	public void iterateThroughEntries() {
		Set<Map.Entry<String, String>> entries = products.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue());
		}
	}

	public void iterateThroughEntriesIterator() {
		Iterator<Map.Entry<String, String>> entriesItr = products.entrySet().iterator();
		while (entriesItr.hasNext()) {
			Map.Entry<String, String> entry = entriesItr.next();
			System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue());
		}
	}

	/**
	 * 
	 */
	public void iterateThroughForEachAction() {
		products.forEach((key, value) -> System.out.println("key -> " + key + " value -> " + value));
	}
	
	

	public static void main(String[] args) {
		MapIterator mapIterator = new MapIterator();
		mapIterator.iterateThroughForEachAction();

	}

}
