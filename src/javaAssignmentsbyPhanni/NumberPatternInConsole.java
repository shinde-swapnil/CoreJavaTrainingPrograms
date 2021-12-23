//Print the below sequence in the console: 
//54321
// 				 4321
//     				  321
//   21
// 			    1


package javaAssignmentsbyPhanni;

public class NumberPatternInConsole {

	public static void main(String[] args)
	{
		for(int x=5;x>=1;x--)
	    {
	        for (int y=x;y>0;y--)
	        {
	        	System.out.print(y);
	        }
	        System.out.println();
	    }

	}

}
