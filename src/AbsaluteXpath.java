import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsaluteXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/");
		
		Thread.sleep(15000);
		
		List<WebElement> nifty50 = driver.findElements(By.xpath("//*[@id=\"market_action\"]/div[3]/div/div/div/table/tbody/tr[1]"));
		
		for (WebElement text : nifty50) {
			
			System.out.println(text.getText());
			
		}
	}

}
