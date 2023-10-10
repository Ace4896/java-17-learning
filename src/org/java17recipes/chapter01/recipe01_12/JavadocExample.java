package org.java17recipes.chapter01.recipe01_12;

import java.math.BigInteger;

public class JavadocExample {
	/**
	 * Accepts an array of {@link BigInteger}s and returns the sum.
	 * @param nums The {@link BigInteger}s to sum.
	 * @return The sum of all the {@link BigInteger}s in the array.
	 */
	public static BigInteger addNumbers(BigInteger[] nums) {
		BigInteger result = new BigInteger("0");
		
		for (BigInteger num : nums) {
			result = result.add(num);
		}
		
		return result;
	}
	
	/**
	 * Main method for testing the {@link JavadocExample#addNumbers} method.
	 * @param args Not used
	 */
	public static void main(String[] args) {
		BigInteger[] someValues = {BigInteger.TEN, BigInteger.ONE};
		
		System.out.println(addNumbers(someValues));
	}
}
