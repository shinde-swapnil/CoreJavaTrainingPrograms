package javaBasics;

//Static method accessed directly in static and non-static method

public class StaticDemo {
	
	// static variables
	static int variable = 121;
	static String str = "Nividous";

	// Static method
	static void saticMethodDisplay() {
		System.out.println("int value:" + variable);
		System.out.println("string value:" + str);
	}

	// non-static method
	void nonStaticMethod() {
		// Static method called in non-static method
		System.out.println("Static method called in non-static method");
		saticMethodDisplay();
		System.out.println("");
	}

	// static method
	public static void main(String args[]) {
		StaticDemo obj = new StaticDemo();
		// You need to have object to call this non-static method
		obj.nonStaticMethod();

		// Static method called in another static method
		System.out.println("Static method called in another static method (main method)");
		saticMethodDisplay();
	}
}
