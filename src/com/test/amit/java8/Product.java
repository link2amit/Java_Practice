/**
 * 
 */
package com.test.amit.java8;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author Amit
 *
 */
public class Product {

	public static final Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);

	public Product(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.getName());
	}

	private String name;
	private int weight;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Name: " + this.name;
	}
}
