
//How to Get Elements By Index from HashSet in Java?


package javaAssignmentsbyPhanni;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetAssignment 
{
	
	public static void main(String[] args) 
	{
		hashsetUsingIndex();
		
		
	}
	
	public static void hashsetUsingIndex()
	{	
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    
	    int requiredIndex=0;
	    int hashSetSize = cars.size();
	    
	    System.out.println("Size of Set = " + hashSetSize);
	    System.out.println("Elements are :  " + cars);
	    
	    while(true)
	    {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Index value = ");
		    requiredIndex = sc.nextInt();
		    if(requiredIndex <= hashSetSize && requiredIndex >=1)
		    {
		    	break;
		    }
		    else 
		    {
		    	System.out.println("Please enter valid index value !!!");
		    }
	    } 
	
        int currentIndex = 0;
  
        for (String element : cars) 
        {    
            if (currentIndex == requiredIndex)
            {
                System.out.println("Element at index "+requiredIndex+ " is: "+ element);
                break;
            }
            currentIndex++;
        }
    }
	
	public static void hashSetToArrayList()
	{
		// Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a List of HashSet elements
	     List<String> list = new ArrayList<String>(hset);
	 
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	  }
	
	public static void hashSetToArray()
	{
		HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("13");
        set.add("27");
        set.add("87");
        set.add("19");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
        
        // toArray() method converts the set to array
        set.toArray(arr);
  
        for (String n : arr)
            System.out.println(n);
   
	}
	
}


