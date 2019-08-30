package com.amit.test.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Supplier {

	public Collection<Product> products() {
		Product window = new Product("window", 10);
		Product doorPanel = new Product("door-panel", 35);
		Collection<Product> products = new ArrayList<Product>();
		products.add(window);
		products.add(doorPanel);
		return products;
	}

}
