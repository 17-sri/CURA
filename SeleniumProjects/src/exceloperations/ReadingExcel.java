package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	@SuppressWarnings({ "resource", "incomplete-switch" })  // this is just  warning
	public static void main(String[] args) throws IOException {
		String excelFilePath = ".\\data\\Book1.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workBook.getSheetAt(0);    // OR use this line   -->>>   XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// USING FOR LOOP
		 
		int rows = sheet.getLastRowNum();
		short cols = sheet.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC:  System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN:  System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		} 
		
	}

}
