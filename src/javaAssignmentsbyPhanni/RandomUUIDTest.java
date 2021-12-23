// Generate a randomUUID() and store it inside a String and 
// then split the UUID into 5 parts and 
// then print each part individually using a for loop 

package javaAssignmentsbyPhanni;

import java.util.UUID;

public class RandomUUIDTest {
	public static void main(String[] args) 
	{
	    //final String uuid = UUID.randomUUID().toString().replace("-", "");
		final String uuid = UUID.randomUUID().toString();
	    System.out.println("uuid = " + uuid);
	    
	    String result[] = { 
	    					uuid.substring(0, 8), 
	    					uuid.substring(10, 13), 
	    					uuid.substring(15, 18),
	    					uuid.substring(20, 23), 
	    					uuid.substring(24, 36)    
	    				  };
	    int i=0;
	    for(String s : result)
	    {	    	
	    	System.out.println("Part- "+(++i)+ " :  "+s);
	    }
	    
	}

}
