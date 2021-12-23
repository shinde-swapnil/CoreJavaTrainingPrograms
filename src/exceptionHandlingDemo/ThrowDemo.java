package exceptionHandlingDemo;

public class ThrowDemo {

	static void checkEligibilty(int age) {
		System.out.println("Age: " + age);
		try {
			if (age < 15) {
				throw new ArithmeticException("The Person is not eligible for Voting");
			} else {
				System.out.println("The Person is Eligible!");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you");
		}
	}

	public static void main(String args[]) {
		System.out.println("Let's find out your eligibility for Voting!");
		checkEligibilty(12);
		
	}

}
