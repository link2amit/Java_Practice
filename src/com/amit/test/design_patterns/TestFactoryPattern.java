package com.amit.test.design_patterns;

import com.amit.test.design_patterns.concrete.Fruit;
import com.amit.test.design_patterns.factory.FruitFactory;
import com.amit.test.design_patterns.factory.Fruits;

public class TestFactoryPattern {

	public static void main(String[] args) {
		FruitFactory factory = new FruitFactory();

		Fruit banana = factory.getFruit(Fruits.Banana);
		System.out.println("Color: " + banana.color());
		System.out.println("Weight: " + banana.weight());
		System.out.println("Price: " + banana.price());
	}

}
