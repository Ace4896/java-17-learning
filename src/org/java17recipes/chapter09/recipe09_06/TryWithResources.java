package org.java17recipes.chapter09.recipe09_06;

import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {
		// Java has "try-with-resources", which is different from C#'s using blocks/statements
		// If there's no exceptions to handle, it seems like we can omit the catch/finally blocks
		// In C#, we have to write a separate try-catch
		// To use this auto-cleanup, it has to implement the AutoCloseable interface (like IDisposable in C#) 
		try (
			FileOutputStream fos = new FileOutputStream("out.log");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos)
		) {
			// ... write to the file here
			// Upon leaving the block (either successfully or with exception), the resources will be disposed
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
