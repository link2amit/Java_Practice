package com.amit.test;

public class SubstringTest {

	public static void main(String[] args) {
		String first = "abcd";
		String second = new String("abcd");

		String first_one = first.substring(0, 2); // ab
		String first_two = first.substring(0, 2); // ab
		String first_three = first.substring(0, first.length());
		// Substring of the second string
		String second_one = second.substring(0, 2);
		String second_two = second.substring(0, 2); // ab
		String second_three = second.substring(0, second.length());

		System.out.println(first_one == first_two); // false
		System.out.println(second_one == second_two); // false

		System.out.println(first == first_three); // true
		System.out.println(second == second_three); // true

		String third = new String("?abcd");
		System.out.println(third == first);

		String four = "abcd";

		String third_one = third.substring(1, 5); //abcd
		System.out.println("Output string: "+third_one+".."); //
		System.out.println(four == first); //
	}

}
