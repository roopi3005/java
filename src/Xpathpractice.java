import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Baseclass.com.BaseClass;
import com.pom.com.InstaLogIn;


public class Xpathpractice extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException 
		
	 {browserLaunch("chrome");
	 implicitWait();
	 LaunchThisUrl("https://www.instagram.com/");
	 InstaLogIn il = new InstaLogIn(driver);
	 giveInputAs(il.getUsername(), "roopika");
	 giveInputAs(il.getPasswrd(),"123454");
	 explixit(il.getLogin());	 
	 clickIt(il.getLogin());
	 takeASnap("insta.png");
			
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
//			
//			ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
//			
//			options.addArguments("incognito");
//			
//			WebDriver driver= new ChromeDriver(options);
//			
//			driver.get("https://www.instagram.com/");
//			
//			Thread.sleep(3000);
//			
//			//tagname[@attribute name= "value"]
//			
//			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("9962707980");
//						
//			//tagname[contains(@attribute name,’ value’ )]
//			
//			driver.findElement(By.xpath("//input[contains(@name,'password' )]")).sendKeys("kidvscat");
//	
//			//tagname[text()="text"]
//			
//			driver.findElement(By.xpath("//div[text()='Log In']")).click();;
//			
//			Thread.sleep(3000);
//									
//			TakesScreenshot ss= (TakesScreenshot) driver;
//			
//			File s = ss.getScreenshotAs(OutputType.FILE);
//			
//			File d = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\login.png");
//			
//			FileUtils.copyFile(s, d);
		   			
		
			
			
}}

