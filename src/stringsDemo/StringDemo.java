package stringsDemo;

public class StringDemo {

	public static void main(String[] args) {
		
		// Declare String without using new operator
        String s = "Automation";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("Selenium");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
        
        
        char[] ch={'j','a','v','a','i','s','e','a','s','y'};  
        String s2=new String(ch);  
        
        // Prints the String.
        System.out.println("String s2 = " + s2);
		
       //upper case
        System.out.println(s.toUpperCase());
        
        //char at
        
        char ch2=s1.charAt(4);//returns the char value at the 4th index  
        System.out.println(ch2);  
        
        System.out.println("Character at last index is: "+ s1.charAt(s1.length()-1));     
	}

}
