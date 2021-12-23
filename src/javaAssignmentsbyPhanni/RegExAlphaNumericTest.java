//Create a regular expression whose length is only 6 characters long 
// and it should accept only alphanumeric characters.

package javaAssignmentsbyPhanni;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExAlphaNumericTest 
{

	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<String>();
	       
		names.add("Adam12");  
		names.add("Paul123");  
		names.add("Sam123-");
		names.add("123456"); 
		 
		String regex = "^[a-zA-Z0-9]{6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for (String name : names)
		{
		  Matcher matcher = pattern.matcher(name);
		  System.out.println(matcher.matches());
		}

	}

}
