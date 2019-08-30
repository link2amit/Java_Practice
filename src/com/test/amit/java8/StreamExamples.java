package com.test.amit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> primeNumbers = Arrays.asList(1, 2, 3, 5, 7, 11);
		List<Integer> oddNumbers = Arrays.asList(3, 5, 7, 11);
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 12);

		List<List<Integer>> combinedList = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

		System.out.println("Before: " + combinedList);

		List<Integer> numbers = combinedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

		System.out.println("After: " + numbers);
		System.out.println("Prime Numbers Before : " + primeNumbers);
		List<Integer> primes = primeNumbers.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("Prime Numbers After : " + primes);

		long primeCount = primeNumbers.stream().count();

		System.out.println("Count of prime numbers: " + primeCount);

		Predicate<Integer> predicate = (i) -> i % 2 == 0;
		numbers.stream().filter(predicate).forEach(System.out::println);

		int count = primes.stream().reduce(0, (a, b) -> a+=1);
		
		System.out.println("Reduce Count: "+count);

	}

}
