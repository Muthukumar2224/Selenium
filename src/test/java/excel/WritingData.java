package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileOutputStream file = new FileOutputStream("C:\\\\Users\\\\2125244\\\\eclipse-workspace\\\\Seleniumrevise\\\\TestData\\\\WriteFile.xlsx");
     XSSFWorkbook workbook = new XSSFWorkbook();
     XSSFSheet sheet = workbook.createSheet("Data");
     
     XSSFRow row1 =sheet.createRow(0);
      row1.createCell(0).setCellValue("Java");
      row1.createCell(1).setCellValue(19);
      row1.createCell(2).setCellValue("Automation");
      
     XSSFRow row2 =sheet.createRow(1);
      row2.createCell(0).setCellValue("Python");
      row2.createCell(1).setCellValue(19);
      row2.createCell(2).setCellValue("Automation");
      
      XSSFRow row3 =sheet.createRow(2);
      row3.createCell(0).setCellValue("Python");
      row3.createCell(1).setCellValue(19);
      row3.createCell(2).setCellValue("Automation");
      
      workbook.write(file);
      
      workbook.close();
      
      file.close();
      
	}

}
