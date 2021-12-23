package propertiesInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyDemo {

	public static void main(String[] args) throws FileNotFoundException 
	{
File getProperty = new File(System.getProperty("user.dir")+"/src/propertiesInJava/get.properties");
FileOutputStream fo = new FileOutputStream(getProperty);
		
		Properties p=new Properties();  
		p.setProperty("username","Admin User");  
		p.setProperty("email","test@test.com");  
		
		try {
			
			p.store(fo, "Setproperties");
			
			System.out.println(p.getProperty("username"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
