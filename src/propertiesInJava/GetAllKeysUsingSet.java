package propertiesInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class GetAllKeysUsingSet {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/src/propertiesInJava/loginData.properties");
		
	        Properties prop = new Properties();
	        prop.load(fi);
	        
	        
	        Set<Object> obj = new HashSet<Object> ();
	        		
	        obj = prop.keySet();
	        
	        for (Object key: obj) 
	        {
	            System.out.println(key + ": " + key.toString());
	        }
	    }
		

	

}
