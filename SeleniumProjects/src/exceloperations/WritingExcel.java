package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;//    .* indicates, it imports everything in xssf.usermodel

public class WritingExcel {
	@SuppressWarnings("resource") // this is just a warning
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Employee_Info");    // giving sheet name as "Employee_Info"
		Object empData[][] = { {"EmployeeID", "Name", "Job"},
				{101, "ABCD", "I DON'T KNOW"},
				{102, "EFGH", "REALLY DON'T KNOW"},
				{103, "IJKL", "SERIOUSLY DON'T KNOW"},
		};
		//USING FOR LOOP
		int rows = empData.length;
		int cols = empData[0].length;
		//System.out.println(rows);  // i,e., 4 rows
		//System.out.println(cols);  // i,e., 3 columns

		for(int r=0;r<rows;r++)//0
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.createCell(c);  //0
				Object value = empData[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filePath=".\\data\\Employee_Data.xlsx";  //giving filename as Employee_Data.xlsx
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workBook.write(outputStream);
		outputStream.close();
		System.out.println("data written in file successfully");

	}

}
