package com.amit.test.design_patterns.factory;

import com.amit.test.design_patterns.concrete.Banana;

public class BananaFactory implements AbstractFruitFactory{

	@Override
	public Banana createFruit() {
		return new Banana();
	}

}
