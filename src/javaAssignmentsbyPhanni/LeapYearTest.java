package javaAssignmentsbyPhanni;

import java.util.Scanner;
public class LeapYearTest {
	public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a year to check leap year or not: ");
			int year = sc.nextInt();
			
			if(year%4==0)
			{
				System.out.println(""+year+ " is a Leap Year");
			}
			else
			{
				System.out.println(""+year+ " is not a Leap Year");
			}
			
			
			
	}
	}
