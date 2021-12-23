package javaBasics;

public class DiffMethodTypes {
	double rate = 7.5;
	float principal = 450000;
	int time = 25;

	// Method type 1 : Void + No Arg

	public void interestCalC1() {
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Method type 1 :  Void + No Arg");
		System.out.println("SImple Interest = " + simpleInterest);

	}

	// Method type 2 : Void + With Arg

	public void interestCalC2(double principal, float rate, int time) {
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Method type 2 :  Void + With Arg");
		System.out.println("SImple Interest = " + simpleInterest);

	}

	// Method type 3 : Non Void + No Arg

	public double interestCalC3() {
		double rate = 6.5;
		float principal = 350000;
		int time = 22;
		double simpleInterest = (principal * rate * time) / 100;
		return (simpleInterest);

	}

	// Method type 4 : Non Void + With Arg

	public double interestCalC4(double principal, float rate, int time) {
		double simpleInterest = (principal * rate * time) / 100;
		return (simpleInterest);

	}

	public static void main(String args[]) {
		// create object of class

		DiffMethodTypes obj = new DiffMethodTypes();

		// call Method type 1 : Void + No Arg
		obj.interestCalC1();

		// call Method type 2 : Void + With Arg
		obj.interestCalC2(8.0, 60000, 20);

		// call Method type 3 : Non Void + No Arg
		double simpleInt3 = obj.interestCalC3();
		System.out.println("Method type 3 :  Non Void + No Arg");
		System.out.println("Simple interest = " + simpleInt3);

		// call Method type 4 : Non Void + With Arg
		double simpleInt4 = obj.interestCalC4(7.95, 55000, 15);
		System.out.println("Method type 4 :  Non Void + With Arg");
		System.out.println("Simple interest = " + simpleInt4);

	}
}
