package test.attest360.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class CommomPage extends BaseClass {
	public CommomPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/a[text()='Case Data']")
     WebElement casedata;
     @FindBy(xpath="//li/a[text()='Fill Data']")
     WebElement filldata;
     
     
     public void clickCaseData() {
    	 casedata.click();
     }
     public void clickFillData() {
    	 filldata.click();
     }
}
