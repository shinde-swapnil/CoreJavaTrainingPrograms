package arrayDemo;

public class ArrayOrder {

	public static void main(String[] args) {
		
		// declaration, instantiation and initialization
		int arr[] = { 33, 3, 4, 5, 24, 15, 28, 34, 31, 36 };

		// traversing array in sequence
		System.out.println("traversing array in sequence");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);

		System.out.println();

		// traversing array in reverse order
		System.out.println("traversing array in reverse order");
		for (int i = (arr.length - 1); i >= 0; i--)
			System.out.print(" " + arr[i]);

		System.out.println();

		// display only even numbers
		System.out.println("display only even numbers");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2 == 0)
			{
				System.out.print(" " + arr[i]);
			}
		}
		
		System.out.println();

		// display only odd numbers
		System.out.println("display only odd numbers");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2 != 0)
			{
				System.out.print(" " + arr[i]);
			}
		}

	}

}
