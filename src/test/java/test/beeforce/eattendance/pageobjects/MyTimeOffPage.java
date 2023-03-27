package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class MyTimeOffPage extends BaseClass{

	public MyTimeOffPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(id="prop-startDate")
	WebElement startDate;

	@FindBy(id="prop-endDate")
	WebElement endDate;

	@FindBy(id="prop-paycode")
	WebElement parycode;

	@FindBy(id="submitButton")
	WebElement btnSubmit;




	private void setStartdate(String StartDate) {
		
		startDate.sendKeys(StartDate);

	}

	private void setEndDate(String EndDate) {

		endDate.sendKeys(EndDate);

	}

	private void selectLeavetype(String LeaveType) {

		selectDropdownOption(parycode, LeaveType);

	}
	
	private void clickSubmitButton() {
		
		btnSubmit.click();
	}
}
