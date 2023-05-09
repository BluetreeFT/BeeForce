package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class AutoLivEattendanceHomePage extends BaseClass {

	public AutoLivEattendanceHomePage() {

		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//p[text()='Settings']")
	WebElement settings;

	@FindBy(xpath=" //a[text()='Employees']")
	WebElement employees;

	@FindBy(id="wdt-search-input")
	WebElement txtSearch;

	@FindBy(id="wdt-search-button")
	WebElement btnSearch;



	public void clickSettingDropdown() {

		settings.click();

	}

	public void clickEmployees() {

		employees.click();

	}
	
	public void searchEmployee(String employeeNumber) {
		
		txtSearch.clear();
		txtSearch.sendKeys(employeeNumber);
		btnSearch.click();
		
	}




}
