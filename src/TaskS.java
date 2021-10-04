import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\newchrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
			
		//options.addArguments("incognito");
		
		//options.addArguments("headless");	
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]/button/span[2]")).click();
	}

}
