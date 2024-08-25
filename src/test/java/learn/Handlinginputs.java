package SeleniumLetcode.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		// Append a text and press keyboard tab
				driver.findElement(By.id("join")).sendKeys(" person", Keys.TAB);
				String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
				System.out.println(isReadOnly);
	}

}
