import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Xpath {
 public static void main(String[] args) throws IOException, InterruptedException {
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
		
		options.addArguments("incognito");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/");		
		
		//(//tagname[@attribute name= "value"])[]
				
		driver.findElement(By.xpath("(//input[@name= \"identifier\"])[1]")).sendKeys("2s563");
		
		 //tagname[contains(text()," text" )]		
		
		driver.findElement(By.xpath(" //span[contains(text(),\"Next\" )]")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ss= (TakesScreenshot) driver;
		
		File ss1 = ss.getScreenshotAs(OutputType.FILE);
		
		File d1 = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\error.png");
		
		FileHandler.copy(ss1, d1);
		
}
}
