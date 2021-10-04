package com.suresh.practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDayOne {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	
	ChromeOptions c = new ChromeOptions();
	c.addArguments("start-maximized");
	c.addArguments("incoginto");
	
	WebDriver driver = new ChromeDriver(c);
	driver.get("https://www.youtube.com/");
	
	Dimension d = new Dimension(500,750);
	driver.manage().window().setSize(d);
	
	  
	
}
}
