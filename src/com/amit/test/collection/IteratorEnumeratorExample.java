package com.amit.test.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorEnumeratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		Vector<String> v = new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");

		Enumeration<String> listEnum = v.elements();
		while (listEnum.hasMoreElements()) {
			System.out.println("Enumeration: " + listEnum.nextElement());
			v.remove(0);
		}
		System.out.println(v);
		
		Iterator<String> listItr = list.iterator();
		while (listItr.hasNext()) {
			System.out.println("Iterator: " + listItr.next());
			listItr.remove();
		}
		System.out.println(list);

	}
}
