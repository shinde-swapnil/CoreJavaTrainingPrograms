package excelHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelObjectWriting 
{
	public static void main(String[] args) throws IOException 
	{
		// workbook object 
        XSSFWorkbook workbook = new XSSFWorkbook();
        // spreadsheet object 
        XSSFSheet spreadsheet = workbook.createSheet(" Employee Data ");
        // creating a row object 
        XSSFRow row;
        // This data needs to be written (Object[]) 
        Map<String, Object[]> studentData = new TreeMap<String, Object[]>();

        studentData.put("1", new Object[] { "Employee Id", "NAME", "POST" });
        
        studentData.put("2", new Object[] { "101", "Vidhi", "QA1" });
        studentData.put("3", new Object[] { "102", "Ashwini", "QA2 Consultant" });
        studentData.put("4", new Object[] { "103", "Swapnil", "QA3 Engineer" });
        studentData.put("5", new Object[] { "104", "Uma", "QA4 Engineer" });
        studentData.put("6", new Object[] { "105", "Meena", "QA5 Intern" });

        Set<String> keyid = studentData.keySet();

        int rowid = 0;
        // writing the data into the sheets...
        for (String key : keyid) 
        {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 0;

            for (Object obj : objectArr) 
            {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
                System.out.println(cellid +" "+cell);
            }
        }
        // .xlsx is the format for Excel Sheets... 
        // writing the workbook into the file... 
        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Swapnil.Shinde\\Desktop\\Write.xlsx"));
        workbook.write(out);
        out.close();
    }
}

