package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class STLModulesPage extends BaseClass   {
	public STLModulesPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//li/a/span[contains(text(),'Onboarding')]")
	WebElement onboardingModule;

	@FindBy (xpath="//li/a/span[contains(text(),'CHRMS')]")
	WebElement chrmsModule;	

	@FindBy(xpath ="//li/a/span[contains(text(),'Eattendance')]")
	WebElement eattendanceModule;

	@FindBy(xpath ="//li/a/span[contains(text(),'Compliance')]")
	WebElement complianceModule;
	
	@FindBy(xpath ="//li/a/span[contains(text(),'Offboarding')]")
	WebElement OffboardingModule;

	
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

			clickOnboardingModule();

			break;

		case "CHRMS":  
			
			clickCHRMSModule();

			break; 
			
		case "eattendance": 
			
			clickEattendanceModule();

			break;  

		}

	}
}
