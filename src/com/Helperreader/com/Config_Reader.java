package com.Helperreader.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	public static Properties p;
	public Config_Reader() throws Throwable{
	File f = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\src\\com\\Helper\\com\\Config.Properties");
	
	FileInputStream fis = new FileInputStream(f);
	 p = new Properties();
	 p.load(fis);}	
	
	public String getBrowser() {
		String Browser = p.getProperty("Browser");
		return Browser;	}
	
	public String geturl() {
		String url = p.getProperty("URL");
		return url;	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;	}
	
	public String geturl2() {
		String url2 = p.getProperty("url2");
		return url2;	}
	
}