package javaAssignmentsbyPhanni;

public class PrimeNumberTest {
	public static void main(String[] args) {

		int i;
		int j;
		System.out.print("List of Prime number");
		System.out.println("");
		for (i = 1; i <= 10; i++) {
			int counter = 0;
			for (j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) 
			{
				
				System.out.print("" + i + " ");
				System.out.println("");
			}
		}
	}
}
