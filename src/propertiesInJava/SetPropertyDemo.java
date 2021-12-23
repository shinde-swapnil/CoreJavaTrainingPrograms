package propertiesInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertyDemo {

	public static void main(String[] args) 
	{
		File setProperty = new File(System.getProperty("user.dir")+"/src/propertiesInJava/set.properties");
		
		Properties p=new Properties();  
		p.setProperty("username","Admin User");  
		p.setProperty("email","test@test.com");  
		
		try {
			FileWriter fw = new FileWriter(setProperty);
			p.store(fw, "Setproperties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
