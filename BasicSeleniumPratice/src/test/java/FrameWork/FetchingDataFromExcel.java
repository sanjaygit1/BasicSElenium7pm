package FrameWork;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws Throwable {

     FileInputStream fes = new FileInputStream("./ExcelSheet.xlsx");
          Workbook book = WorkbookFactory.create(fes);
          Sheet sheet = book.getSheet("Sheet1");
          Row row = sheet.getRow(1);
          Cell cell = row.getCell(1);
          String exceldata = cell.getStringCellValue();
	      System.out.println(exceldata);
	}

}
