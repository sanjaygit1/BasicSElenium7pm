package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcel {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fes = new FileInputStream("./ExcelSheet.xlsx");
        Workbook book = WorkbookFactory.create(fes);
        Sheet sheet = book.getSheet("Sheet1");
        Row row = sheet.createRow(5);
        Cell cell = row.createCell(6);
        cell.setCellValue("Qspiders");
        
        FileOutputStream fos = new FileOutputStream("./ExcelSheet.xlsx");
        book.write(fos);
        book.close();
	
	}

}
