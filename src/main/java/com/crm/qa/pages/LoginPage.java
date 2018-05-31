package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Defining Page Factory or Object Repository
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contain(text(),Sign Up")
	WebElement signupBtn;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	WebElement crmLogo;
	
	//Initializing Page Factory by creating constructor
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		//all the above variable will be initialize with the driver
	}

	//Now we will define different actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		return new HomePage();
	}


	
	

}