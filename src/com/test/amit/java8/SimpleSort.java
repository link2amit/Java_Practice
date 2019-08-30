package com.test.amit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleSort {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("One");
	list.add("Abc");
	list.add("BCD");
	Comparator<String> comparator =  (a, b) -> {
	    return a.compareTo(b);
	};
	Collections.sort(list, comparator.reversed());

	System.out.println(list); 
}
}
