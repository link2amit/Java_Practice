package com.amit.test.design_patterns.concrete;

public class Apple implements Fruit {

	@Override
	public String color() {
		return "Red";
	}

	@Override
	public double weight() {
		return 0.15;
	}

	@Override
	public double price() {
		return 3.0;
	}

}
