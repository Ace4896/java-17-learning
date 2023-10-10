package org.java17recipes.chapter02.recipe02_01;

import java.util.Random;

public class KeywordVar {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Like C#, var is only allowed on local declarations, and a target type is necessary
		var num = 1;			// int
		var numLong = 10L;		// long
		var numDouble = 0.1;	// double
		var numFloat = 0.1f;	// single / float
		var city = "Toronto";	// String
		var arr = new int[] { 1, 2, 3 };	// int[]
		var randomInt = getRandomInt();		// int, from function return type
	}
	
	private static int getRandomInt() {
		Random rng = new Random();
		return rng.nextInt();
	}
}
