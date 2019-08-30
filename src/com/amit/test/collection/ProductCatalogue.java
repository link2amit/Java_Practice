package com.amit.test.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import static com.amit.test.collection.Product.BY_NAME;

public class ProductCatalogue implements Iterable<Product> {

	private final Set<Product> products = new TreeSet<Product>(BY_NAME);

	public void isSuppliedBy(Supplier supplier) {
		products.addAll(supplier.products());
	}

	public Iterator<Product> iterator() {
		return products.iterator();
	}

}
