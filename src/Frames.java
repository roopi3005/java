import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
	options.addArguments("incognito");		
	WebDriver driver= new ChromeDriver(options);
	driver.get("http://www.leafground.com/pages/frame.html");  
    driver.manage().window().maximize();
    //size
    int size =driver.findElements(By.tagName("iframe")).size();
    System.out.println(size);
    //single frame
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();
    driver.switchTo().defaultContent();
    //nested frame
    driver.switchTo().frame(1);
    driver.switchTo().frame("frame2");//inside frame(1)
    driver.findElement(By.xpath("//*[@id=\"Click1\"]")).click();    
}}
