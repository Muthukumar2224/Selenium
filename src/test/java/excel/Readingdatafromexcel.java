package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(
				"C:\\Users\\2125244\\eclipse-workspace\\Seleniumrevise\\TestData\\Datapawan.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrows = sheet.getLastRowNum();
		
		int totalcells = sheet.getRow(1).getLastCellNum();
			System.out.println(totalrows + "\n" +totalcells);	
			
			for(int r=0;r<=totalrows;r++)
			{
				XSSFRow currentrow = sheet.getRow(r);
				for(int c=0;c<totalcells;c++)
				{
				  XSSFCell cell=currentrow.getCell(c); //currentrow.getCell(c).toString();
				 System.out.print(cell.toString()+"\t");                                    
				}
			System.out.println();
			}
			workbook.close();
			file.close();
	}

}
