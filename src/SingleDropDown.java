import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");

	ChromeOptions Options = new ChromeOptions();	
	Options.addArguments("incognito");
	
	WebDriver driver = new ChromeDriver(Options);	
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.xpath("//*[@title=\"English (UK)\"]")).click();	
	driver.findElement(By.xpath("//*[text()=\"Sign up for Facebook\"]")).click();	
	driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Roopika");	
	driver.findElement(By.name("lastname")).sendKeys("Nandagopal");	
	driver.findElement(By.xpath("//*[contains(@name,\"reg_email__\")]")).sendKeys("8787898644");	
	driver.findElement(By.xpath("//*[contains(@data-type,\"password\")]")).sendKeys("oiuion468");
	
	Select d = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	d.selectByIndex(14);	
	Select m = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	m.selectByIndex(2);	
	Select y = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	y.selectByValue("2008");
	
	driver.findElement(By.xpath("//*[@type=\"radio\"]")).click();	
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	
	JavascriptExecutor js =(JavascriptExecutor) driver;	
	js.executeScript("window.scrollBy(0,4000)"," ");//scroll down
	
	Thread.sleep(10000);
	
	TakesScreenshot ss= (TakesScreenshot) driver;	
	File s = ss.getScreenshotAs(OutputType.FILE);	
	File g = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\miniproject.png");	
	FileUtils.copyFile(s, g);
   			
	
}
}
