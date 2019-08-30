package com.amit.test.trickyproblems;

public class Main {

	public static void main(String[] args) {
//		Parent p = new Child();
		Child c = new Child();
		try{
			c.methodToBeOverridden();
		}catch(ArithmeticException e) {
			
		}
//		c.methodToBeOverridden();

	}

}
