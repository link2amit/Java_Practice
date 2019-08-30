package com.amit.test.projecteuler;

public class Problem1_MultipleThreeOrFive {

	public static void main(String[] args) {
		
		Problem1_MultipleThreeOrFive p = new Problem1_MultipleThreeOrFive();
		System.out.println(p.sumOfMultiplesOfThreeOrFive(1000));

	}

	private boolean multipleOfFive(int n) {
		return n % 5 == 0;
	}

	private boolean multipleOfThree(int n) {
		return n % 3 == 0;
	}

	private int sumOfMultiplesOfThreeOrFive(int limit) {
		int result = 0;
		for (int i = 1; i < limit; i++) {
			if (multipleOfThree(i) || multipleOfFive(i)) {
				result += i;
			}
		}
		return result;
	}

}
