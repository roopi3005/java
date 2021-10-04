import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//chromedriver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/drop.html");
	Actions action = new Actions(driver);
	WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    action.click(from)
    	  .dragAndDrop(from,to)
    	  .build()
    	  .perform();
    
   
}
}
