package com.amit.test.design_patterns.concrete;

public class Orange implements Fruit{

	@Override
	public String color() {
		return "Orange";
	}

	@Override
	public double weight() {
		return 0.10;
	}

	@Override
	public double price() {
		return 5.50;
	}

}
