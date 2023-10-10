package org.java17recipes.chapter02.recipe02_03;

public class MultipleLineStringEx {
	public static void main(String[] args) {
		// Only available in Java 13+
		String multiLineStr = """
		<html>
			<p>Ciao, hello</p>
		</html>
		""";
		
		System.out.println(multiLineStr);
	}
}
