import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\newchrome\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//global implicit common for all steps	
	driver.get("https://www.jio.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/button")).click();
	
	JavascriptExecutor js =(JavascriptExecutor) driver;	

	js.executeScript("window.scrollBy(3000,0)", "");
	
	WebDriverWait wdw = new WebDriverWait(driver,3);
	
	//local Explicit waits only till particular function is completed
	
	wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"collapse1\"]/div/div[1]/div/div[2]/div/a"))).click();
		
	Thread.sleep(3000);//holds for particular time
	
	driver.findElement(By.xpath("//*[@id=\"detailModal\"]/div/div/div[1]/a/img")).click();
	
	driver.navigate().to("https://www.instagram.com/");
	
	driver.navigate().back();
	
	driver.navigate().back();
	
	driver.manage().window().maximize();
	
	Dimension dim= new Dimension(250,300);
	
	driver.manage().window().setSize(dim);	 
	
	js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//*[@id=\"sites-footer\"]/nav/div/div/div/nav/div[6]/div/ul/li[2]/a/span")));
	
}
}
