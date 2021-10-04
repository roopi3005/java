package com.pom.com;

import org.openqa.selenium.WebDriver;

import com.Baseclass.com.BaseClass;
import com.Helperreader.com.FileReaderManager;

public class Combine extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
	
	driver=browserLaunch(FileReaderManager.getInstanceFR().getInstanceCR().getBrowser());	
	LaunchThisUrl(FileReaderManager.getInstanceFR().getInstanceCR().geturl());
	SingleTonPom manager = new SingleTonPom(driver);
	implicitWait();
	giveInputAs(manager.getInstanceIl().getUsername(), FileReaderManager.getInstanceFR().getInstanceCR().getusername());
	giveInputAs(manager.getInstanceIl().getPasswrd(), FileReaderManager.getInstanceFR().getInstanceCR().getpassword());
	clickIt(manager.getInstanceIl().getLogin());
	goToPage(FileReaderManager.getInstanceFR().getInstanceCR().geturl2());
	clickIt(manager.getInstanceLp().getSignIn());
	giveInputAs(manager.getInstanceLp().getEmailId(), FileReaderManager.getInstanceFR().getInstanceCR().getusername());
	giveInputAs(manager.getInstanceLp().getPassword(),FileReaderManager.getInstanceFR().getInstanceCR().getpassword());
	clickIt(manager.getInstanceLp().getLogin());
}

}