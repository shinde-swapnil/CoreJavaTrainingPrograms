package excelHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteMultiCells {
	public static void main(String[] args) throws IOException 
	{

		// step 1: create file object
		File fileObject = new File("C:\\Users\\Swapnil.Shinde\\Desktop\\TestData2.xlsx");
		
		System.out.println("File Created at : " + fileObject.getAbsolutePath());

		// step 2: get file data in bytes
		FileOutputStream fosObject = new FileOutputStream(fileObject);

		// refer excel file
		XSSFWorkbook workbookObject = new XSSFWorkbook();
		// refer sheet into excel file
		XSSFSheet sheetObject = workbookObject.createSheet("sample");
		
		XSSFRow row ;
		XSSFCell cell;
		
		
		// idea
		// create row
		// create col/cell
		// set cell value
		
		String header[] = {"ID", "Name", "City","Designation"};
		int index= 0;
		
		int rowNum=0;
		int cellNum=0;
		
		for(int i=0;i<header.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				
			}
		}
		
		
		
		
		
		
		
		workbookObject.write(fosObject);
		fosObject.close();
		
		
	}


}
