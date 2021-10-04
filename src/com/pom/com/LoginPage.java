package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		}    	

	@FindBy(xpath = "//*[@title=\"Log in to your customer account\"]")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	@FindBy(id = "email")
	private WebElement emailId;

	public WebElement getEmailId() {
		return emailId;
	}

	@FindBy(id = "passwd")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
