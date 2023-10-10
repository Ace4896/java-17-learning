package org.java17recipes.chapter06.recipe06_02;

import java.util.function.Function;

public class MoreLambdas {
	public static void main(String[] args) {
		// Instead of pre-declaring the type, we can use the Function<> interface
		// There's a few pre-defined ones in java.util.function, but they're more restricted than C#
		// Java's Consumer<T> is the equivalent to C#'s Action<T> is, though with only one input variable 
		Function<String, String> reverser = (input) -> {
			String tmpStr = "";
			for (String part : input.split(" ")) {
				tmpStr += new StringBuilder(part).reverse().toString() + " ";
			}
			
			return tmpStr;
		};
		
		System.out.println(reverser.apply("some input string"));
	}
}
