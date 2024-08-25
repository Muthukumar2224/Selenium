package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileOutputStream file = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\2125244\\\\\\\\eclipse-workspace\\\\\\\\Seleniumrevise\\\\\\\\TestData\\\\\\\\DynamicWrite.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Dynamic");
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter no of rows:");
	int rowcount = sc.nextInt();
	System.out.println("Enter no of rows:");
	int cellcount = sc.nextInt();
	
	for(int r=0;r<=rowcount;r++)
	{
		XSSFRow currentrow = sheet.createRow(r);
		for(int c=0;c<cellcount;c++)
		{
			XSSFCell cell =currentrow.createCell(c);
			cell.setCellValue(sc.next());
		}
	}
	workbook.write(file);
	workbook.close();
	file.close();
		
	}

}
