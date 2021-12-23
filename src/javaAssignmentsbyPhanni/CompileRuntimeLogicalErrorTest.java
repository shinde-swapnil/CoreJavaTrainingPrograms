package javaAssignmentsbyPhanni;

public class CompileRuntimeLogicalErrorTest 
{
	
	public static void compileTimeError() 
	{
		//System.out.println("a") // Syntax error. Semicolon missing.
	}
	
	public static void runTimeError() 
	{
		int arr[ ] = {1, 2, 3, 4, 5}; // Here, array size is 5.
		 System.out.println("Value at 5th position: "+arr[5]);
	}
	
	public static void logicalError() 
	{
		int a[]={1, 2 , 5, 6, 3, 10, 12, 13, 14};  
		 
		System.out.println("Even Numbers:");  
		for(int i = 0; i <a.length; i++)
		{  
		if(a[i] / 2 == 0) // Using wrong operator.
		{  
		  System.out.println(a[i]);  
		 }  
		}  
	}

	public static void main(String[] args) 
	{
		compileTimeError() ;
		
		runTimeError() ;
		
		logicalError() ;
	}

}
