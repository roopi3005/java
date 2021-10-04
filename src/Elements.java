	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Elements {
public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
		
		options.addArguments("incognito");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/");
		
		//Thread.sleep(3000);	//can be used to pause the execution of current thread for specified time in milliseconds	
			
		WebElement username = driver.findElement(By.id("identifierId"));
		
		String att = username.getAttribute("id");//returns the value of a specified attribute on the element
		
		System.out.println(att);
		
		boolean d = username.isDisplayed();
		
		System.out.println(d);
		
		boolean e = username.isEnabled();
		
		System.out.println(e);			
		
		username.sendKeys("suresh11prashanth");
				
		WebElement next = driver.findElement(By.tagName("button"));
		
		boolean s = next.isSelected();
		
		System.out.println(s);
		
		next.click();
		
		

}
}
