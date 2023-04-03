package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class STLBudgectingAndSourcing extends BaseClass  {
	
	
	public STLBudgectingAndSourcing() {
		
		PageFactory.initElements(driver, this);
		
	}
	
   @FindBy(xpath="//button[contains(text(),'Create')]")
   WebElement btnCreate;
   
   @FindBy(xpath="//label[contains(text(),'BU')]/following-sibling::div/select")
   WebElement businessUnit;
   
   
   
   
	
	
	
	 

}
