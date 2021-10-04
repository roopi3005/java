import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverMethods {
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();//for customizing the ChromeDriver session

		options.addArguments("start-maximized");
		
		options.addArguments("incognito");
	
				
		WebDriver driver= new ChromeDriver(options);// ChromeOptions object into the ChromeDriver constructor:
		
		driver.get("https://www.instagram.com/");
		
		driver.get(driver.getCurrentUrl());//refresh alternative method
		
		driver.navigate().to("https://mail.google.com/");
		
		driver.navigate().back();
		
		Dimension dim= new Dimension(250,300);
		
		driver.manage().window().setSize(dim);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String t = driver.getTitle();
		
		System.out.println(t);
		
		//driver.close();
		
		driver.quit();
	
	}

}
