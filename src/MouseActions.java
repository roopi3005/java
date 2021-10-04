import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mkyong.com/");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
		
		Actions action = new Actions(driver);
		//action.click(driver.findElement(By.xpath("//*[@id="search-input"]"))).build().perform();					
		action.click(a)
			  .moveToElement(driver.findElement(By.xpath("//*[@id=\"left-nav\"]/ul/li[1]/a")))
			  .doubleClick()
			  .build()
			  .perform();
		WebElement next = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/a"));
		action.click(next)
			  .contextClick()			  	  	
			  .build()
			  .perform();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
	    action.click(from)
	    	  .dragAndDrop(from,to)
	    	  .build()
	    	  .perform();		
	}
}
