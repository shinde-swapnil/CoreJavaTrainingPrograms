package listCollection;
import java.util.*;

public class ArrayListDemo {
	
	public static void print(List list)
	{
		System.out.println("Size = " + " " + list.size());
		System.out.println("Elements = " + " " + list);
		
		//list.get(index);
		
	}
	
	public static void integerList()
	{
		//Integer List
				List<Integer> intList = new ArrayList<>();
				intList.add(10);
				intList.add(20);
				intList.add(30);
				print(intList);
				
				intList.add(2, 50);
				
				print(intList);
				
				for (int i : intList) 
			    {
			    	  System.out.println(i);
			    }
	}
	
	public static void charList() 
	{
		// create an array list for characters
	      ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: ");
	      print(al);
	      

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("after deletions: " );
	     print(al);
	}

	
	
	public static void main(String[] args) 
	{	
		
		integerList();
		
		charList();
		
	}
	
	
	

}
