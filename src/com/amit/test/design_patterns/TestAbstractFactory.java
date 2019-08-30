package com.amit.test.design_patterns;

import com.amit.test.design_patterns.concrete.Fruit;
import com.amit.test.design_patterns.factory.AppleFactory;
import com.amit.test.design_patterns.factory.NewFruitFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		NewFruitFactory appleFactory = new NewFruitFactory();
		Fruit apple = appleFactory.createFruit(new AppleFactory());
		System.out.println("Color: " + apple.color());
		System.out.println("Weight: " + apple.weight());
		System.out.println("Price: " + apple.price());
	}

}
