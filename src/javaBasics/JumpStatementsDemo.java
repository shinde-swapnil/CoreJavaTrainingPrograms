package javaBasics;

public class JumpStatementsDemo {

	
	public static void main(String[] args) {
		
		for(int i=0; i<9; i++)
		{
            System.out.println("The value of i is: "+i);
            if(i==5)
            	break;
       }
		
		
		for (int i = 0; i < 10; i++) 
		{
			  if (i == 4) 
			  {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
