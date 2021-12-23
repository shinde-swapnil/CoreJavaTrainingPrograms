//Use local date time class in Java to print the date & time in the following format and 
// then store it inside String –>  23rd-Sat-Oct-21

package javaAssignmentsbyPhanni;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CustomeDateTimePrint {
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        
//        String result1 = now.format(df);
//        System.out.println(result1);
//        DayOfWeek dayOfWeek = now.getDayOfWeek();
//        System.out.println(now.getDayOfWeek());
//        
//        	
//
//       String day = dayOfWeek.name();
//       SimpleDateFormat sdf = new SimpleDateFormat("EEE");
//   	//	String stringDate = sdf.format();
//   	//	System.out.println("Today is: "+stringDate);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-EEE-MMM-yyyy");
		String stringDate = sdf2.format(new Date());
		System.out.println("Today is: " + stringDate);

		int date = now.getDayOfMonth();
		System.out.println("I am extracting date here: " + date + " ");
		
		String suffix = getDayOfMonthSuffix(date);
		
		System.out.println(new SimpleDateFormat(" d'" + suffix + "'-EEE-MMM-yyyy").format(new Date()));
	}		
	
	public static String getDayOfMonthSuffix(int number)
	{
		if (number >= 11 && number <= 13) 
		{
	        return "th";
	    }
	    switch (number % 10) {
	        case 1:  return "st";
	        case 2:  return "nd";
	        case 3:  return "rd";
	        default: return "th";
	    }
	}
}
