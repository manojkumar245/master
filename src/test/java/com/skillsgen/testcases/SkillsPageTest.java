package com.skillsgen.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.skillsgen.base.TestBase;
import com.skillsgen.pages.HomePage;
import com.skillsgen.pages.LoginPage;
import com.skillsgen.pages.SkillsPage;

public class SkillsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	SkillsPage skillspage;
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage =loginPage.navigateHomePage();
		skillspage = homePage.navigateSkillsPage();

	}
	
	
	@Test
	public void verifyEditSkillsTest() {
		Assert.assertTrue(skillspage.verifyPopUp());
		
		
	}
	
	

}
