import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
			
		options.addArguments("incognito");
			
		WebDriver driver= new ChromeDriver(options);
			
		driver.get("https://www.netflix.com/in/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//WebElement speed = driver.findElement(By.xpath("//span[text()='Speed Test']"));
		
		js.executeScript("window.scrollBy(0,900)"," ");//scroll down
		
		Thread.sleep(3000);
				
		js.executeScript("window.scrollBy(0,-300)"," ");//scroll up
					
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('id_email_hero_fuji').value='1568769';");//alternative to send keys
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='Speed Test']")));//scroll to specific element
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Speed Test']")));//alternative to click
		
		Thread.sleep(10000);
								
		TakesScreenshot ss= (TakesScreenshot) driver;
		
		File s = ss.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\Speedtest.png");
		
		FileUtils.copyFile(s, d);
	}
}
