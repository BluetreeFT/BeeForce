package test.beeforce.onboarding.pageobjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class OnboardingHomePage extends BaseClass {

	public OnboardingHomePage() {

		PageFactory.initElements(driver, this);

	}
 
	//All HomePage

	// Contractor HomePage 

	@FindBy(xpath="//span[text()=' On-boarding']") //Onboarding dropdown
	WebElement onboardingDropDown;

	@FindBy(xpath="//a[contains(text(),'Employee Details') or contains(text(),'Associate Details') ]")  //employee Details Dropdown
	WebElement Employeedetails;

	@FindBy(xpath="//a[contains(text(),'Offline  creation - Bulk')]") // employee offline creation link
	WebElement employeeOfflineCreattion;

	@FindBy(xpath="//a[text()=' Employee Submission - Bulk' or text()='Associate Offline  creation - Bulk']") // employee Submission -bulk link
	WebElement employeeBulkSubmission;
	
	@FindBy(xpath="//a[text()='Total Employees' or text()='Total Associates']") // Total Employees  
	WebElement totalEmployees;
	
	@FindBy(xpath="//a[text()='Dashboard']") //dashboard
	WebElement dashboard;
	
	@FindBy(id="searchName") // Total Employees search  
	WebElement txtsearch;
			
	@FindBy(xpath="//span[text()='Budgeting']") // budgeting Dropdown
	WebElement budgeting;
	
	@FindBy(xpath="//a[text()='Budgets']")   // budgets link
	WebElement budgets;
	
	@FindBy(xpath="//span[text()='Sourcing']") // sourcing Dropdown
	WebElement sourcing;
	
	@FindBy(xpath="//a[text()='Sourcing Requests']")   // budgets link
	WebElement sourcingRequests;
	
	

	public void clickOnboardingDropdown() {
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='On-boarding']")));
		
		onboardingDropDown.click();

	}
	public void clickEmployeeDetailsDropdown() {

		Employeedetails.click();

	}
	public void clickEmployeeofflineCreation() {

		employeeOfflineCreattion.click();

	}
	public void clickEmployeebulkSubmission() {

		employeeBulkSubmission.click();

	}
	public void clickTotalEmployees() {

		totalEmployees.click();

	}
	public void clickDashboard() {
		
		dashboard.click();
		
	}	
	public void searchEmployee(String employeeNumber) {

		txtsearch.sendKeys(employeeNumber,Keys.ENTER);

	}
	
	public void clickBudgetingDropdown() {
		
		budgeting.click();
	}
	
public void clickBudgets() {
		
		budgets.click();
	}

public void clickSourcingDropdown() {
	
	sourcing.click();
}

public void clickSourcingRequest() {
	
	sourcingRequests.click();
}


	




}
