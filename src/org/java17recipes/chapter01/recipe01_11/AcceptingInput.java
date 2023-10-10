package org.java17recipes.chapter01.recipe01_11;

import java.io.*;

public class AcceptingInput {
	public static void main(String[] args) {
		// BufferedReader gives us a buffered stream of characters
		// It's constructor parameter indicates the source of the characters
		// - InputStreamReader is for reading from the console
		// - Can also use FileReader for reading from a file - we pass the file path into the constructor of FileReader
		BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
		
		String numberAsString = "";
		long numberAsLong = 0;
		boolean numberIsValid = false;
		
		do {
			System.out.println("Please enter a number: ");
			
			try {
				// Read in the number
				numberAsString = readIn.readLine();
				System.out.println("You entered " + numberAsString);
				
				// Parse the number
				numberAsLong = Long.parseLong(numberAsString);
				numberIsValid = true;
				System.out.println("" + numberAsLong + " is a valid long");
			} catch (IOException ex) {
				System.err.println("Something went wrong while reading input:");
				System.err.println(ex);
			} catch (NumberFormatException nfe) {
				System.err.println("Invalid number!");
			}
		} while (numberIsValid == false);
	}
}
