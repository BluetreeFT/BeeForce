package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class EattendanceHomePage extends BaseClass {

	public EattendanceHomePage() {

		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//span[text()='Settings']")
	WebElement settings;

	@FindBy(xpath="//span[text()='Employee Data']")
	WebElement employeeData;

	@FindBy(xpath="//div[@id='empData']/child::ul/li/a[text()='Employees']")
	WebElement employees;

	@FindBy(id="wdt-search-input")
	WebElement txtSearch;

	@FindBy(id="wdt-search-button")
	WebElement btnSearch;



	public void clickSettingDropdown() {

		settings.click();

	}

	public void clickEmployeeDataDropdown() {

		employeeData.click();

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
