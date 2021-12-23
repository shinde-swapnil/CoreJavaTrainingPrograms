package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileDemo 
{

	public static void main(String[] args) 
	{
		
		File f1 = new File("File.txt");
		System.out.println("File created : "+ f1.getName());
		
		System.out.println("File Path : "+ f1.getAbsolutePath());
		try {
			FileWriter fw = new FileWriter(f1);
			fw.write("Java is simple");
			fw.write("Java is so simple");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
