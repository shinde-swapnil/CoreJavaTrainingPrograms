package javaAssignmentsbyPhanni;

import java.util.Arrays;
import java.util.List;

public class ListDuplicateFinding 
{
	public static void main(String[] args) 
	{		       
        List<Integer> intList = Arrays.asList(10,20,30,40,50,60,30,20,10);
        for (int i = 0; i < intList.size(); i++) 
        {
            for (int j = i+1; j <intList.size() ; j++) 
            {
                if(intList.get(i).equals(intList.get(j)))
                {
                    System.out.println(intList.get(i));
                }
            }
        }
	}
}
