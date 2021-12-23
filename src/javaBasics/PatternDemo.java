package javaBasics;

// RIGHT pascal triangle pattern 

public class PatternDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("* ");

			}
			System.out.println();
		}

		for (int i = 9 - 1; i >= 0; i--) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*" + " ");
			}

			System.out.println();
		}
	}
}