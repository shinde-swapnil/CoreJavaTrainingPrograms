package javaAssignmentsbyPhanni;

import java.util.Scanner;
public class ArrayAccessValidIndex2 {
	
	void assignment10() {
		
		
		Integer[] array1 = {2, 4, 6, 8, 10};
	    Scanner sc = new Scanner(System.in);	    
		System.out.print("Enter index for finding array value ");
		int input = sc.nextInt();	
		
		
		
		try {
			
			while(input<array1.length) 
			{
				System.out.println("The value at index: " +input+ " is " +array1[input] );
			    break;
			}
		}
			catch(Exception e)
			{
				System.out.println("Invalid Index Input");	
				System.out.print("Enter index for finding array value ");
			    input = sc.nextInt();	
			}
	}

	
	
	public static void main(String[] args) {
		
		ArrayAccessValidIndex2 obj1 = new ArrayAccessValidIndex2();
		obj1.assignment10();
    
	}
}