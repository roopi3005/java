package com.Baseclass.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.pom.com.LoginPage;


public class MiniProject extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch("chrome");
		implicitWait();
		LaunchThisUrl("http://automationpractice.com/index.php");
		LoginPage lp = new LoginPage(driver);	

		clickIt(lp.getSignIn());

		giveInputAs(lp.getEmailId(), "roopi444553@gmail.com");

		giveInputAs(lp.getPassword(), "123456");

		clickIt(lp.getLogin());

//		clickIt(lp.getWomen());
//
//		scroll(lp.getDress());
//
//		clickIt(lp.getDress());
//
//		frames(0);
//
//		clickIt(lp.getAddToCart());
//
//		explixit(lp.getCheckout());
//		
//		clickIt(lp.getCheckout());
//
//		clickIt(lp.getCheckout2());
//		
//		clickIt(lp.getConfirmAddress());
//
//		clickIt(lp.getAgree());
//
//		clickIt(lp.getProcessCarrier());
//
//		clickIt(lp.getPayment());
//
//		clickIt(lp.getFinalbutton());

		takeASnap("mini.png");
//		clickIt(Women)
		
//		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
//		clickIt(createAccount);
//		WebElement gender = driver.findElement(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
//		clickIt(gender);
//		Thread.sleep(3000);
//		particularElementIsSelectedOrNot(gender);
//		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
//		giveInputAs(firstName, "Roopika");
//		WebElement lastNAme = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
//		giveInputAs(lastNAme, "Nandagopal");
//		WebElement Password = driver.findElement(By.id("passwd"));
//		giveInputAs(Password, "123456");
//		Select d = new Select(driver.findElement(By.xpath("//*[@name=\"days\"]")));
//		d.selectByIndex(30);
//		Select m = new Select(driver.findElement(By.xpath("//*[@name=\"months\"]")));
//		m.selectByIndex(5);
//		Select y = new Select(driver.findElement(By.xpath("//*[@name=\"years\"]")));
//		y.selectByValue("1996");
//		WebElement idName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
//		giveInputAs(idName, "roopika");
//		WebElement idName2 = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
//		giveInputAs(idName2, "Nandapopal");
//		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
//		giveInputAs(address1, "likjyhuikj");
//		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
//		giveInputAs(city, "chennai");
//		Select state = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
//		state.selectByIndex(13);
//		WebElement postcode = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
//		giveInputAs(postcode, "60000");
//		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"id_country\"]")));
//		country.selectByValue("21");
//		WebElement num = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
//		giveInputAs(num, "958696895");
//		WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
//		clickIt(register);

//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\screenshot\\miniproject.png"));
//	//		TakeASnap((WebElement) driver);
	}

}
