package org.java17recipes.chapter02.recipe02_06;

// This is a lot like C#'s one - we can specify the base constructor here, and add methods as needed
public record Professor(Integer id, String name, String surname) {
	public String getFullName() {
		return this.name + " " + this.surname;
	}
}
