package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InstaLogIn {
	public static WebDriver driver;
	
	public InstaLogIn(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}	

	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[contains(@name,'password' )]")
	private WebElement passwrd;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//*[@type=\"submit\"]")
	private WebElement login;

	public WebElement getPasswrd() {
		return passwrd;
	}

}
