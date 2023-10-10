package org.java17recipes.chapter02.recipe02_04;

public class NullPointerExample {
	public static void main(String[] args) {
		// Java 14+ runtimes have a much clearer error message - can easily see which null variable caused the error
		// Eclipse seems to have static null analysis already, which is nice
		String professor = null;
		System.out.println(professor.length());
	}
}
