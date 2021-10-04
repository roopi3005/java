import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) throws AWTException {
		
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//chromedriver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	Actions g = new Actions(driver);
	Robot r = new Robot();	
	WebElement x = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	g.click(x).perform();
	WebElement topoffers = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]"));
	WebElement grocery = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]"));
	WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]"));
	WebElement travel = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[8]"));	
	g.contextClick(topoffers).perform();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
	g.contextClick(grocery).perform();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
	g.contextClick(mobiles).perform();	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
	g.contextClick(travel).perform();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}}




