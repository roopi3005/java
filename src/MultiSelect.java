import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");

	ChromeOptions Options = new ChromeOptions();	
	Options.addArguments("incognito");	
	WebDriver driver = new ChromeDriver(Options);	
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
    WebElement l = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));    
    Select s = new Select(l);    
    boolean b = s.isMultiple();    
    if (s.isMultiple()) {
	System.out.println(b);    
    System.out.println("__________________________________________________________________________");    
    System.out.println("size of dropdown is:");
    List<WebElement> all = s.getOptions();    
    int size = all.size();
    System.out.println(size);    
    System.out.println("__________________________________________________________________________");
    System.out.println("list of options are:");
    for (WebElement webElement : all) {
    System.out.println(webElement.getText());	}    
    System.out.println("__________________________________________________________________________");
    System.out.println("selected options are:");
    for (int i = 0; i <=size; i++) {
    if (i==5| i==3 |i==7| i==1) {
    s.selectByIndex(i);		}}     
    List<WebElement> e = s.getAllSelectedOptions();
    for (WebElement select : e) {
    System.out.println(select.getText()); }
    System.out.println("__________________________________________________________________________");
    System.out.println("final selected options are:");
    s.deselectByVisibleText("Texas");   
    List<WebElement> i = s.getAllSelectedOptions();
    for (WebElement select2 : i) {
    System.out.println(select2.getText());	}    
    System.out.println("__________________________________________________________________________");
    System.out.println("first selected option is:");
    WebElement fs = s.getFirstSelectedOption();
    System.out.println(fs.getText());
    
}}}
