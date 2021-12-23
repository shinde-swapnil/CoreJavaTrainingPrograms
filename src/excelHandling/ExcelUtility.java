package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static void main(String[] args) throws IOException {
		// step 1: create file object
				File fileObject = new File("C:\\Users\\Swapnil.Shinde\\Desktop\\TestData.xlsx");

				// step 2: get file data in bytes
				FileInputStream fisObject = new FileInputStream(fileObject);

				// refer excel file
				XSSFWorkbook workbookObject = new XSSFWorkbook(fisObject);
				// refer sheet into excel file
				XSSFSheet sheetObject = workbookObject.getSheetAt(0);
				
				


	}

}
