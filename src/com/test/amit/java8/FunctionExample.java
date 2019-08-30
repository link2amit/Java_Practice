package com.test.amit.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		Function<Integer, Integer> adder = (value) -> value = value + 3;
		int result = adder.apply(3);

		System.out.println(result);

		BiFunction<Double, Double, Map<Double, Double>> fi = (k, v) -> {
			Map<Double, Double> map = new HashMap<>();
			map.put(k, v);
			return map;
		};
		
		System.out.println(fi.apply(3.0, 9.0));
	}

	// @Override
	// public Integer apply(Integer t) {
	// // TODO Auto-generated method stub
	// return null;
	// }
}
