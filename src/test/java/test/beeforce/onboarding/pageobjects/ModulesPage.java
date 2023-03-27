package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class ModulesPage extends BaseClass   {
	public ModulesPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy (xpath="//ul/child::li/a[@class='nav-link dropdown-toggle arrow-none waves-effect waves-light']")
	WebElement navigationMenu;

	@FindBy(xpath="//span[text()='Onboarding']")
	WebElement onboardingModule;

	@FindBy (xpath="//span[text()='CHRMS']")
	WebElement chrmsModule;	

	@FindBy(xpath ="//span[text()='Eattendance']")
	WebElement eattendanceModule;

	@FindBy(xpath ="//span[text()='Compliance']")
	WebElement complianceModule;



	public void clickNavigationMenu () {

		navigationMenu.click();

	} 
	public void clickOnboardingModule() {

		onboardingModule.click(); 

	}

	public void clickCHRMSModule() {

		chrmsModule.click(); 

	}

	public void clickEattendanceModule() {

		eattendanceModule.click(); 

	}

	public void clickComplianceModule() {

		complianceModule.click(); 

	}


	public void selectModule(String module) {

		switch(module){    

		case "onboarding":
			
			clickNavigationMenu();

			clickOnboardingModule();

			break;

		case "CHRMS":  
			
			clickNavigationMenu();

			clickCHRMSModule();

			break; 
			
		case "eattendance": 
			
			clickNavigationMenu();

			clickEattendanceModule();

			break;  

		}

	}
}
