package com.skillsgen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skillsgen.base.TestBase;

public class SkillsPage extends TestBase{
	
	@FindBy(xpath = "//span[contains(text(),'Edit Skills')]")
	WebElement editSkillsBtn;
	
	@FindBy(css = "._3ZtyA")
	WebElement addSkillsBtn;
	
	@FindBy(xpath = "//h1[text()='Search a skill or competency']")
	WebElement text;
	
	
	public SkillsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPopUp() {
		editSkillsBtn.click();
		addSkillsBtn.click();
		return text.isDisplayed();
		
		
	}
	

}
