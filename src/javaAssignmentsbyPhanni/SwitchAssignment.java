package javaAssignmentsbyPhanni;

import java.util.Scanner;

public class SwitchAssignment {
	
	public static Scanner sc;
	public static int inputInt;
	public static String inputStr;
	
	

	public static void main(String[] args) 
	{		
		System.out.println("\n 1. Even Odd Test \n 2. Factorial Test \n 3. String Reverse Test \n 4. String Palindrom Test");
		sc = new Scanner(System.in);
		System.out.println("Enter number = ");
		int test = sc.nextInt();
		switch (test) 
		{
		  case 1:
		    System.out.println("Lets do evenOddTest");
		   	System.out.println(" " +  evenOddTest());
		    break;
		  case 2:
		    System.out.println("Lets do factorialTest");
		    sc = new Scanner(System.in);
			System.out.println("Enter input number for Factorial test= ");
			inputInt = sc.nextInt();
		    System.out.println("Factorial is:  " +  factorialTest(inputInt));
		    break;
		  case 3:
		    System.out.println("Lets do stringReverseTest");
		    System.out.println(" " + stringReverseTest());
		    break;
		  case 4:
		    System.out.println("Lets do stringPalindromTest");
		    System.out.println(" " + stringPalindromTest());
		    break;
		}
	}
	
	public static String evenOddTest()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter input number for Even/Odd test= ");
		inputInt = sc.nextInt();
		
		if(inputInt%2==0)
			return "Number "+inputInt+ " is Even";
		else
			return "Number "+inputInt+ " is Odd";
	}
	
	public static int factorialTest(int inputInt)
	{
		if (inputInt == 0)
	          return 1;
	    return ( (inputInt*factorialTest(inputInt-1)));	    
	}

	public static String stringReverseTest()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter String for Reverse test= ");
		inputStr = sc.nextLine();		
		StringBuilder input1 = new StringBuilder();
		input1.append(inputStr);        
        input1.reverse(); 
		return (" " + input1);
	}
	public static String stringPalindromTest()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter String for Reverse test= ");
		inputStr = sc.nextLine();
		String reverse="";
		for ( int i = inputStr.length() - 1; i >= 0; i-- )
			reverse = reverse + inputStr.charAt(i);	 
	      if (inputStr.equals(reverse))
	         return (" " + inputStr+" is a palindrome");
	      else
	    	  return (" " + inputStr+" is not a palindrome");
	}
}
