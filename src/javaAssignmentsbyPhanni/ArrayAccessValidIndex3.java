package javaAssignmentsbyPhanni;

import java.util.Scanner;

public class ArrayAccessValidIndex3 {

	public static void main(String[] args) 
	{		
		int sizeOfArray=0;
		Scanner s = new Scanner(System.in);
		//Ask user - how many elements in array ?
		System.out.println("Ask user - how many elements in array ? ");
		sizeOfArray= s.nextInt();
		
		int array[]=new int[sizeOfArray];
		// enter elements upto sizeOfArray
		
		int counter=0;  // this will count
		int i =0; 		// this will track index		
		
		System.out.println("enter elements upto " +sizeOfArray+ " ");
		while (counter < sizeOfArray)
		{
			array[i] = s.nextInt();
			i++;
			counter++;
		}
		
		System.out.println("Array elements :");
		for (int j = 0; j < sizeOfArray; j++)
            System.out.print(array[j] + "  ");
		
		
		
		
		// Taking input from user
        Scanner s1 = new Scanner(System.in);
        
 
       while(true)
       {
    	   
    	   System.out.print("Enter index for finding array value ");
    	   int input = s1.nextInt();
    	   
       
        // Try block to check exception
        try 
        {
        	if(input < array.length)
        	{
        		System.out.println("The value at index: " +input+ " is " +array[input] );           
            }
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            // Print message when any exception occurs
            System.out.println(
                "Array Bounds Exceeded...\nTry Again");
        }
       }
		
	}

}
