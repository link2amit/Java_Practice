package com.amit.test.design_patterns.factory;

import com.amit.test.design_patterns.concrete.Fruit;

public class NewFruitFactory {
	public Fruit createFruit(AbstractFruitFactory aff) {
		return aff.createFruit();
	}

}
