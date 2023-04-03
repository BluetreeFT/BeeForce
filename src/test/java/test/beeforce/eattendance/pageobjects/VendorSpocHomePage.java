package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class VendorSpocHomePage extends BaseClass{
	
	public VendorSpocHomePage() { 
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//a[normalize-space()='Tasks']")
WebElement Task;
public void clickmytaskLink() {
	Task.click();
}

}
