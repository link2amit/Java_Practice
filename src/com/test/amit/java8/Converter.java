package com.test.amit.java8;

import java.util.function.Function;

public class Converter implements ExtendedFunctionalInterface<Double, Double, Double> {
	public Double apply(Double conversionRate, Double value) {
		return conversionRate * value;
	}
	
	public static void main(String... args) {
		Converter converter= new Converter();
		Function<Double, Double> milesToKm = converter.curry1(1.609);
		System.out.println(milesToKm.apply(10.0));
	}
}
