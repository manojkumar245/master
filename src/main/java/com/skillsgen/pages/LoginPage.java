package com.skillsgen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skillsgen.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "emailInput")
	WebElement emailBox;
	
	@FindBy(xpath = "//input[@id='passwordInput']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	WebElement submitBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Accept all cookies')]")
	WebElement cookiesbtn;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage navigateHomePage() {
		emailBox.sendKeys(prop.getProperty("username"));
		passwordBox.sendKeys(prop.getProperty("password"));
		cookiesbtn.click();
		submitBtn.click();
		return new HomePage();
	
		}
	

}
