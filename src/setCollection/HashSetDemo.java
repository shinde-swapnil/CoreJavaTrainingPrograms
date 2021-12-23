package setCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	   
	    boolean b = cars.equals("Volvo");
	    
	    // simple sop 
	    System.out.println(cars);
	    
	    // for-each loop	    
	    for (String i : cars) 
	    {
	    	  System.out.println(i);
	    }
	    
	    // iterator interface
	    Iterator itr = cars.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }	
	    
	  }

}
