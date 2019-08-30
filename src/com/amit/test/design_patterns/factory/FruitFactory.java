/**
 * 
 */
package com.amit.test.design_patterns.factory;

import com.amit.test.design_patterns.concrete.Apple;
import com.amit.test.design_patterns.concrete.Banana;
import com.amit.test.design_patterns.concrete.Fruit;
import com.amit.test.design_patterns.concrete.Orange;

/**
 * @author Amit
 *
 */
public class FruitFactory {

	public Fruit getFruit(Fruits type) {
		switch (type) {
		case Apple:
			return new Apple();
		case Banana:
			return new Banana();
		default:
			return new Orange();
		}

	}

}
