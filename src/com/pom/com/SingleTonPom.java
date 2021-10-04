package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonPom {
	public static WebDriver driver;
	
	public SingleTonPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);}
	
	private LoginPage lp;
	private InstaLogIn il;
	private Inputs i;
	
	public LoginPage getInstanceLp() {		
	lp = new LoginPage(driver);
	return lp;
	}
	
	public InstaLogIn getInstanceIl() {		
		il = new InstaLogIn(driver);
		return il;
		}
	
}