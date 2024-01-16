package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public  WebDriver getfirefoxDriver(WebDriver driver) {
		//open the browser
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	//public  WebDriver getFirefox(WebDriver driver) {
		//open the browser
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//return driver;
}

