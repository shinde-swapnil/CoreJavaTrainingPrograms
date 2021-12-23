package javaBasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.regex.Pattern;
public class DateTimeDemo {

	public static void main(String[] args) 
	{
		
		LocalDateTime now = LocalDateTime.now();        
        System.out.println(now);
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(now.format(df));
        
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH:MM:SS");
        System.out.println(now.format(df2));
        
        //LocalDate 
        //LocalTime
        
        double d = 7435.9876;
        double roundDbl = Math.round(d);
        System.out.println("Rounded Double value: "+roundDbl);
     
        int r = new Random().nextInt();
        
        System.out.println(Pattern.matches("[a]?", "a"));//false (a or m or n must come one time) 
        
	}

}
