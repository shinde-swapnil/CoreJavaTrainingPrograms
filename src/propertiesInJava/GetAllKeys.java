package propertiesInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetAllKeys {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/src/propertiesInJava/get.properties");
		
	        Properties prop = new Properties();
	        prop.load(fi);
	        printProperties(prop);
	  }
	 
	    public static void printProperties(Properties prop)
	    {
	        for (String key: prop.stringPropertyNames()) {
	            System.out.println(key + ": " + prop.getProperty(key));
	        }
	    }
		

	

}
