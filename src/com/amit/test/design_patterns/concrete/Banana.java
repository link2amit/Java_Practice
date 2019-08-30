package com.amit.test.design_patterns.concrete;

public class Banana implements Fruit{

	@Override
	public String color() {
		return "Yellow";
	}

	@Override
	public double weight() {
		return 0.20;
	}

	@Override
	public double price() {
		return 4.25;
	}

}
