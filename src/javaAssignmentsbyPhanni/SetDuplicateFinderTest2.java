package javaAssignmentsbyPhanni;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDuplicateFinderTest2 
{
	public static void main(String[] args) {
		
	
	 int number=0;
	Scanner scanner = new Scanner(System.in);
	Set<Integer> hs = new HashSet<Integer>();
   int counter=0;
    do 
    {
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        while (hs.contains(number)) 
        {         
            System.out.printf(" " + number+ " is a duplicate number.\n");
            break;
        }
        
        hs.add(number); 
        counter++;
        
    } while (counter < 10);

    System.out.println("Final List");
    for (int value : hs)            
        System.out.print(value + ", ");
}
}
