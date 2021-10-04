import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_types {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session
	options.addArguments("incognito");		
	WebDriver driver= new ChromeDriver(options);
	driver.get("http://www.leafground.com/pages/Alert.html");  
    driver.manage().window().maximize();
    //Simple alert
    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
    driver.switchTo().alert().accept();
    //confirm alert
    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
    driver.switchTo().alert().dismiss();
    //prompt alert
    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
    Alert prompt = driver.switchTo().alert();
    prompt.sendKeys("roopika");
    prompt.accept();
    
   
}
}
