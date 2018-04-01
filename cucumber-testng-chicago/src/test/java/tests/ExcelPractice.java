package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	public static void main(String[] args) throws IOException {
    File file = new File("Workbook6.xlsx");
	System.out.println(file.exists());	
	
	FileInputStream input = new 	FileInputStream(file);
	XSSFWorkbook wBook = new XSSFWorkbook(input);
	XSSFSheet sheet = wBook.getSheet("Sheet1");
	
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell1 = row.getCell(0);
	
	System.out.println(sheet.getRow(0).getCell(0));
	System.out.println(cell1);
	
	XSSFCell cellToChange = sheet.getRow(0).getCell(0);
	
	
	System.out.println(sheet.getPhysicalNumberOfRows());
	
	
	
	
	
	cellToChange.setCellValue("23452433");
	FileOutputStream output = new FileOutputStream(file);
	wBook.write(output);
	output.close();
	
	
	
	
	
	
	}
}
