package javaAssignmentsbyPhanni;

import java.util.Scanner;
public class ArrayAccessValidIndex {
	
	void assignment10() {
		Integer[] array1 = {2, 4, 6, 8, 10};
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter index for finding array value ");
		int input = sc.nextInt();
		
		try {
			System.out.println("The value at index: " +input+ " is " +array1[input] );
			}
			catch(Exception e)
			{
				System.out.println("Invalid Index Input");
				assignment10();
			}

	}
	
	public static void main(String[] args) {
		
		ArrayAccessValidIndex obj1 = new ArrayAccessValidIndex();
		obj1.assignment10();
    
	}
}