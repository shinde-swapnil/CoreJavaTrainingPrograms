package propertiesInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PropDemo {

	public static void main(String[] args) 
	{
		File myProp = new File(System.getProperty("user.dir")+"/src/propertiesInJava/first.properties");
		System.out.println(myProp.getAbsoluteFile());
		try {
			FileWriter fw = new FileWriter(myProp);
			fw.write("url=https:\\www.google.com");
			fw.write("\n");
			fw.write("env=Test");
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
