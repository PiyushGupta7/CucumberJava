package com.qa.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	public static String browserg;
//	
	public static WebDriver init_driver(String browser) {
		    //browserg=browser;
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		} else if (browser.equals("safari")) {
			 driver=new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		return getDriver();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	


}
