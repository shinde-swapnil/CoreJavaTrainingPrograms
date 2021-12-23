package javaAssignmentsbyPhanni;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
       
        
    }
}
class CustomExceptions {
    public static void main(String args[]) throws MyException
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Age = ");
    	int age = s.nextInt();
    	
        try 
        {
        	if(age < 18)
        		throw new MyException("Custom Exception has occurred - Under-age !!!");
        	else
        		System.out.println("Go and Vote !!!");
        }
        catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
