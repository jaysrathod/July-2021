package TestNGDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readdataFromExcel() throws IOException {
		FileInputStream file = new FileInputStream("D:\\NewTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		// Writing data into Excel
				Row row = sheet.createRow(10);
				Cell cell = row.createCell(5);
				cell.setCellValue("Utkarshaa Academy");
				FileOutputStream fos = new FileOutputStream("D:\\NewTestData.xlsx");
				workbook.write(fos);
				fos.close();
				System.out.println("END OF WRITING DATA IN EXCEL");
		
	}
}
