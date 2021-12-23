package javaAssignmentsbyPhanni;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDuplicateFinderTest 
{
	public static void main(String[] args)
    { 
        Scanner s = new Scanner(System.in);
        
		Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<10;i++)
        {
        	System.out.println("Enter element- "+ (i+1));
        	int number = s.nextInt();        	
            if(hs.contains(number))
            {
            	System.out.println("Duplicate found --> " + number + " ");
            	break;
            }
            else        	
            	hs.add(number); 
        }
        System.out.println("Final List");
        for (int value : hs)            
            System.out.print(value + ", ");
         
        System.out.println();
    }

}
