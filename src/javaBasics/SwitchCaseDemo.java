package javaBasics;

import java.util.Scanner;

public class SwitchCaseDemo {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	while(true) 
	{
		System.out.println("Enter number = ");
		int day = sc.nextInt();
		//int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default: break;
		
	}
	
	}
	// Outputs "Thursday" (day 4)
}
	

}
