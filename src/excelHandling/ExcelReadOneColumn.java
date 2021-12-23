package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOneColumn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// step 1: create file object
		File fileObject = new File("C:\\Users\\Swapnil.Shinde\\Desktop\\TestData.xlsx");

		// step 2: get file data in bytes
		FileInputStream fisObject = new FileInputStream(fileObject);

		// refer excel file
		XSSFWorkbook workbookObject = new XSSFWorkbook(fisObject);
		// refer sheet into excel file
		XSSFSheet sheetObject = workbookObject.getSheetAt(0);
		int rowNumber = sheetObject.getLastRowNum();
		int counter=0;
		Row row=null;
		Cell cell=null;
		
		//decide which column you want
		int colNumber=1;
		
		while(counter < rowNumber)
		{
			row = sheetObject.getRow(counter);

			cell = row.getCell(colNumber);

			System.out.println(cell.toString());

			counter++;
		}
		
		fisObject.close();
		

	}

}
