package com.test.amit.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionComposition {

	public static void main(String[] args) {
		Predicate<String> startsWithA = str -> str.startsWith("A");
		Predicate<String> endsWithX = str -> str.endsWith("x");
		Predicate<String> startsWithAEndsWithX = startsWithA.and(endsWithX);

		String str = "A quick brown fox";
		System.out.println(startsWithAEndsWithX.test(str));

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		Function<Integer, Integer> multiplyByFive = (a) -> a * 5;

		BiFunction<Integer, Integer, Integer> composed = add.andThen(multiplyByFive);
		System.out.println(composed.apply(5, 5));
	}

}
