package org.java17recipes.chapter02.recipe02_06;

public class RecordsExample {
	public static void main(String[] args) {
		Professor prof = new Professor(1, "Haruka", "Kiritani");

		// The auto-generated class has method names matching the names in the constructor
		// These will act as the properties
		// These are immutable by default, so we'd have to add separate setter methods or make a new instance to change data
		System.out.println(prof.name() + " " + prof.surname() + " - " + prof.id());
	}
}
