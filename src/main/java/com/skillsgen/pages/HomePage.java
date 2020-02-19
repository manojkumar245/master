package com.skillsgen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skillsgen.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Skills')]")
	WebElement skills;
	
	@FindBy(xpath = "//span[contains(text(),'Assessments')]")
	WebElement Assessments;
		
	@FindBy(xpath = "//span[contains(text(),'Skill Gaps')]")
	WebElement skillGaps;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public SkillsPage navigateSkillsPage() {
		skills.click();
		return new SkillsPage();
	
		}
	
	
	

}
