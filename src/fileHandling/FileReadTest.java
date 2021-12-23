package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileReadTest {

	public static void main(String[] args) {
		
		String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File f1 = new File(fileSuffix+".txt");
		System.out.println("File created : "+ f1.getName());
		
		System.out.println("File Path : "+ f1.getAbsolutePath());
		try {
			FileWriter fw = new FileWriter(f1);
			fw.write("Java is simple \n");
			fw.write("Java is so simple");
			fw.close();
			// read data
			int lines=0;
			Scanner myReader = new Scanner(f1);
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        lines++;
		      }
			System.out.println("Total lines = "+ lines);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// read data
		
		
	}

}
