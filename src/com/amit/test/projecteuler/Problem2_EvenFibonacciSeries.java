package com.amit.test.projecteuler;

public class Problem2_EvenFibonacciSeries {

	public static void main(String[] args) {
		
		Problem2_EvenFibonacciSeries p2 = new Problem2_EvenFibonacciSeries();
//		p2.fibonacciSeries(100);
		System.out.println("Sum = "+p2.fibonacciSeries(4000000));

	}

	private int getSumOfEvenTerms(int number, int sum) {
		if (number % 2 == 0) {
			sum += number;
			return sum;
		}
		return sum;
	}

	private int fibonacciSeries(int limit) {
		int previousTerm = 0;
		int currentTerm = 1;
		int nextTerm=1, sum=0;
		while (nextTerm < limit) {
			
			nextTerm = getNextTerm(previousTerm, currentTerm);
			previousTerm = currentTerm;
			currentTerm = nextTerm;
			sum = getSumOfEvenTerms(currentTerm, sum);
			System.out.println(currentTerm);
		}
		return sum;
	}

	private int getNextTerm(int previousTerm, int currentTerm) {
		return previousTerm + currentTerm;
	}
}
