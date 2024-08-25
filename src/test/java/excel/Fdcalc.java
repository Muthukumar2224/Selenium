package excel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fdcalc {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//div[@class='wzrk-button-container']//button[1]")).click();
    
    String filePath = System.getProperty("user.dir")+"\\TestData\\fd.xlsx";
	int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
	
	
	
	for(int i=1;i<=rows;i++)
	{
		//read from excel
		String principal = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
		String rate = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
		String period = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
		String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
		String freq = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
		String matvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
		
		//pass data into application
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principal);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period);
		
		Select perioddrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		perioddrp.selectByVisibleText(period1);
		
		Select frqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		frqdrp.selectByVisibleText(freq);
		
				
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		
		//Validation
		
		String act_matvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
			if(Double.parseDouble(act_matvalue)==Double.parseDouble(matvalue))
			{
				System.out.println("Test passed");
					ExcelUtils.setCellData(filePath, "Sheet1", i, 7,"Passed");
					ExcelUtils.fillGreenColor(filePath, "Sheet1", i,7);

			}
			else {
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7,"Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clear button
	}
	driver.quit();
		
	}

}
