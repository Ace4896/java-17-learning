package org.java17recipes.chapter06.recipe06_01;

public class LambdaExample {
	// One way to use lamdas is to pre-declare the type
	// The first step is to make an interface tagged with @FunctionalInterface
	@FunctionalInterface
	public interface HelloType {
		void hello(String text);
	}
	
	public static void main(String[] args) {
		// We can then use this type to store the lambda in a variable
		// NOTE: Since we already specified the type in HelloType, we can use var instead of String
		HelloType helloLambda = (String text) -> { System.out.println("Hello " + text); };
		helloLambda.hello("Lambda");
	}
}
