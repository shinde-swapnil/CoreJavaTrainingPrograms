package exceptionHandlingDemo;

import java.io.*;

class Example {
	public void testMethod(int n) throws IOException, ClassNotFoundException {
		System.out.println("Inside artOfTesting");
		if (n < 0)
			throw new IOException("IOException occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException occurred");
	}
}

class ThrowsExample {
	public static void main(String args[]) {
		Example E = new Example();
		try {
			E.testMethod(-1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside main method");
		}
	}
}