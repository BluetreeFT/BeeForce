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
   
   @FindBy(xpath="//label[contains(text(),'OU')]/following-sibling::div/select")
   WebElement organizationUnit;
   
   @FindBy(xpath="//label[contains(text(),'Location')]/following-sibling::div/select")
   WebElement location;
   
   @FindBy(xpath="//label[contains(text(),'Cost Center')]/following-sibling::div/select")
   WebElement costCenter;
   
   @FindBy(xpath="//label[contains(text(),'Department')]/following-sibling::div/select")
   WebElement department;
   
   @FindBy(xpath="//label[contains(text(),'Associate Type')]/following-sibling::div/select")
   WebElement associateType;
   
   @FindBy(id="name")
   WebElement name;
   
   @FindBy(id="comments")
   WebElement comments;
   
   @FindBy(xpath="//button[contains(text(),'Generate')]")
   WebElement btnGenerate;
   
   @FindBy(id="details0headCount")
   WebElement headCount;
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	
	
	
	 

}
