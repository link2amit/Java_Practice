package com.amit.test;

import java.util.Arrays;

import com.amit.test.StaticNestedClass.NestedClass;

public class Main {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("p1", 2, 180);
		Passenger p2 = new Passenger("p2", 3, 90);
		Passenger p3 = new Passenger("p3", 1, 10);
		Passenger p4 = new Passenger("p4", 3, 180);
		Passenger p5 = new Passenger("p5", 2, 180);
		Passenger[] passengers = { p1, p2, p3, p4, p5 };
		Arrays.sort(passengers);
		for (Passenger p : passengers)
			System.out.println(p);
		
		NestedClass.staticMethod();
		NestedClass nc = new NestedClass();
		nc.nonStaticMethod();

	}

}
