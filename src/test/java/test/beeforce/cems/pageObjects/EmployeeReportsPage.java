package test.beeforce.cems.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class EmployeeReportsPage extends BaseClass{
	
	
	public EmployeeReportsPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="statusTypeList")
	WebElement status;
	
	@FindBy(id="submitButton")
	WebElement btnsubmit;
	
	@FindBy(id="downloadBtn")
	WebElement btndownload;
	
	
	private void selectStatus(String Status) {

		selectDropdownOption(status, Status);
		
	}
	
	private void clickSubmitButton() {

		btnsubmit.click();
	}
	
	private void clickDownloadButton() {

		btndownload.click();
	}
	
	public void downloadEmployeefullList() {
		
		ChrmsHomePage ch=new ChrmsHomePage();
		
		ch.clickEmployeeReportsDropdown();
		
		ch.clickEmployeefullList();
		
		clickDownloadButton();
	

	}
}