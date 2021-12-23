package javaAssignmentsbyPhanni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> intList = new ArrayList<>();
		intList.add(90);
		intList.add(20);
		intList.add(40);
		intList.add(60);
		intList.add(10);
		intList.add(50);
		
		System.out.println("Unsorted ArrayList: " + intList);
	
		// asc
		Collections.sort(intList);
		
		System.out.println("Asc sorted ArrayList: " + intList);
		
		//dec
		Collections.sort(intList, Collections.reverseOrder());
		
		System.out.println("Dsc sorted ArrayList: " + intList);		
		
	}
}
