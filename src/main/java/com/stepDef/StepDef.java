 package com.stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.masterPageFactory.MasterPageFactory2;
import com.util.Highlighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	MasterPageFactory2 mpf2;
	@Given("open the browser")
	
	public void open_the_browser() {
		DriverManager dm = new DriverManager();
		driver = dm.getfirefoxDriver(driver);	    
	}

	@Given("pass the URL {string}")
	public void pass_the_url(String URL) {		
	 driver.navigate().to(URL);  
	    
	}

	@When("enter username {string} in the username field")
	public void enter_username_in_the_username_field(String username) {
	  mpf2 = new MasterPageFactory2(driver) ;
	  Highlighter.addColor(driver,mpf2.getUsername() );
	  mpf2.getUsername().sendKeys(username); 
	  
	}

	@When("enter password {string} in the password field")
	public void enter_password_in_the_password_field(String password) {
	 Highlighter.addColor(driver,  mpf2.getPassword());	
	 mpf2.getPassword().sendKeys(password);  
	    
	}
	@When("click on login")
	public void click_on_login() {
		Highlighter.addColor(driver,  mpf2.getLoginbtn());	
	 mpf2.getLoginbtn().click(); 
	   
	}

	@Then("validate login is successful")
	public void validate_login_is_successful() {
	   
	 Assert.assertTrue(mpf2.getLogoutbtn().isDisplayed(),"Login is successful");
	 if(mpf2.getLogoutbtn().isDisplayed()) {
		 System.out.println("Login is successful");
	 }
	 else {
		System.out.println("Login is not successful"); 
	 }
	 
	}
	@When("click on log out")
	public void click_on_log_out() {
	Highlighter	.addColor(driver, mpf2.getLogoutbtn());
	mpf2.getLogoutbtn().click();	
	   
	   
	}

	@Then("validate logout is successful")
	public void validate_logout_is_successful() {
	 Assert.assertTrue(mpf2.getLoginbtn().isDisplayed(), "Logout successful");  
	  if (mpf2.getLoginbtn().isDisplayed()) {
		  System.out.println("Logout is successful");
	  }
	  else {
		  System.out.println("Logout will be Failed!");
	  }
	  
	}
	

}
