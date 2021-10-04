package com.pom.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClasss {

	public static WebDriver driver;

//browser launch
	public static WebDriver browserLaunch(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\newchrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\newchrome\\gecko.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("launch Failed");
		}
		driver.manage().window().maximize();
		return driver;
	}

//close	
	public static void closecurrentpage() {
		driver.close();
	}

//quit
	public static void CloseWholeBrowser() {
		driver.quit();
	}

//navigate to
	public static void goToPage(String url) {
		driver.navigate().to(url);
	}

//navigate back
	public static void goBacktoPage() {
		driver.navigate().back();
	}

//navigate forward
	public static void goForwardtoPage() {
		driver.navigate().forward();
	}

//navigate refresh
	public static void refreshpage() {
		driver.navigate().refresh();
	}

//get
	public static void LaunchThisUrl(String url) {
		driver.get(url);
	}

//alert
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void DismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void promtAlert(String r) {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(r);
		prompt.accept();
	}

//actions		
	public static void actions(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

//frames
	public static void frames( int i) {
		driver.switchTo().frame(i);
	}

//robot
	public static void robo() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//windows handle
	public static void windowsHandle(WebElement ele, int i) {
		Set<String> allwindow = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(allwindow);
		driver.switchTo().window(list.get(i));
	}

//DropDown
	public static void selectDropDown(int i) {
		Select d = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		d.selectByIndex(i);
	}

//is selected			
	public static void particularElementIsSelectedOrNot(WebElement ele) {
		boolean s1 = ele.isSelected();
		System.out.println(s1);
	}

//is Displayed
//	public static static void particularElementIsDisplayedOrNot(WebElement ele) {
//		boolean s1 = ele.isDisplayed();
//		System.out.println(s1);
//	}

//is Enabled
	public static void particularElementIsEnabledOrNot(WebElement ele) {
		boolean b = ele.isEnabled();
		System.out.println(b);
	}

//get Options
	public static void getOptions(WebElement ele) {
		WebElement l = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		Select s = new Select(l);
		List<WebElement> all = s.getOptions();
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}
	}

//get all selected Options
	public static void getAllSelectedOptions() {
		WebElement l = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		Select s = new Select(l);
		s.deselectByVisibleText("Texas");
		List<WebElement> i = s.getAllSelectedOptions();
		for (WebElement select2 : i) {
			System.out.println(select2.getText());
		}
	}

//get Title			
	public static void getTitle(WebElement ele) {
		String t = driver.getTitle();
		System.out.println(t);
	}

//current url
	public static void currentURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

//get text
	public static void getTheInput(WebElement ele) {
		ele.getText();
	}

//get Attribute
	public static void getTheAttribute(WebElement ele, String s) {
		String a = ele.getAttribute(s);
		System.out.println(a);
	}

//get 1st selected option
	public static void firstSelectedOption(WebElement ele) {
		WebElement l = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		Select s = new Select(l);
		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getText());
	}

//Scroll up or down
	public static void scroll(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);//scroll to specific element
	}

//take ScreenShot	

	public static void takeASnap(String location) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File s = ss.getScreenshotAs(OutputType.FILE);
		File g = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\"+location);
		FileUtils.copyFile(s, g);
	}

//click	
	public static void clickIt(WebElement ele) {
		ele.click();
	}

//clear
	public static void clearAll(WebElement ele) {
		ele.clear();
	}

//sendKeys
	public static void giveInputAs(WebElement ele, String s) {
		ele.sendKeys(s);
	}

//dimension	
	public static void changeToSize(WebElement ele) {
		Dimension size = ele.getSize();
		System.out.println(size);
	}

//tagname
	public static void getTheTagname(WebElement ele) {
		String t = ele.getTagName();
		System.out.println(t);
	}
//explixit wait
	public static  void explixit(WebElement ele) {
		WebDriverWait wdw = new WebDriverWait(driver,3);
		wdw.until(ExpectedConditions.elementToBeClickable(ele));}
	
	
//implicitwait
	public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		}
	
}
