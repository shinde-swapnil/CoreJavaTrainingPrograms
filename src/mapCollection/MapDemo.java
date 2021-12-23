package mapCollection;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) 
	{
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    //To access a value in the HashMap, use the get() method and refer to its key:
	    System.out.println(capitalCities.get("England"));
	    
	    // Print size of Map
	    System.out.print("size of Map = ");
	    System.out.print(capitalCities.size());
	    System.out.println("");
	    
	    // Print keys
	    System.out.println("Print keys");
	    for (String i : capitalCities.keySet()) 
	    {
	      System.out.println(i);
	    }

	    // Print values
	    System.out.println("Print values");
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }

	    // Print keys and values
	    System.out.println("Print keys and values");
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	  }
}
