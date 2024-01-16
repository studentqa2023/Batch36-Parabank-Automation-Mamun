package com.masterPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory2 {
	public MasterPageFactory2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//handel the null pointer exception
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@class='button']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//*[contains(text(),'Log Out')]")
	private WebElement logoutbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

}
