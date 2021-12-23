//Design a for-each loop which will break itself once its find the match with the key given by the user

package javaAssignmentsbyPhanni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoopBreak {

	public static void main(String[] args) 
	{
		// check for such strings which has length in multiple of 2
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(60);
		
		
		
		//System.out.println(list);
		
		Scanner scan = new Scanner (System.in);
		String key = scan.nextLine();
		
		for (int index  : list)
	     {
	         System.out.println(list.get(index)); // this time it's a name!
	     }
		
		
		
		

	}

}
