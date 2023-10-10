package org.java17recipes.chapter02.recipe02_05;

public class InstanceOfExample {
	public static void main(String[] args) {
		// Java 16+ has pattern matching with the "instanceof" operator
		// It's used in the same way as .NET's "is" operator
		Object selectedObject = "Minorinrin~";
		
		// We can perform a regular check here
		if (selectedObject instanceof String) {
			// Which makes it safe to cast afterwards
			String selectedString = (String) selectedObject;
			System.out.println(selectedString.length());
		}
		
		// Or we can cast at the same time
		// Unlike C# (I think), the auto-casted variable scope is only within the if statement's block
		if (selectedObject instanceof String selectedString) {
			// So we don't need to cast manually
			System.out.println(selectedString.length());
		}
	}
}
