package com.test.amit.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
public interface ExtendedFunctionalInterface<T, U, R> extends BiFunction<T, U, R> {

	default Function<U, R> curry1(T t) {
		return (u) -> apply(t, u);
	}
	
}
