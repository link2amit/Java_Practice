package com.test.amit.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("one", 10));
		list.add(new Product("two", 20));
		list.add(new Product("three", 15));
		list.add(new Product("one", 10));

		List<Product> listStream = list.stream().distinct().collect(Collectors.toList());

		System.out.println(listStream);
	}
}
