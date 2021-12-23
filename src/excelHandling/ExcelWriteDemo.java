package excelHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
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
		
		
		// idea
		// create row
		// create col/cell
		// set cell value
		
		Row row = sheetObject.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("FirstHeader");
		
		
		
		workbookObject.write(fosObject);
		fosObject.close();
		
		
	}


}
