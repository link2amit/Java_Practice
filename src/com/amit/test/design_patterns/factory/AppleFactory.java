package com.amit.test.design_patterns.factory;

import com.amit.test.design_patterns.concrete.Apple;

public class AppleFactory implements AbstractFruitFactory {

	@Override
	public Apple createFruit() {
		return new Apple();
	}

}
