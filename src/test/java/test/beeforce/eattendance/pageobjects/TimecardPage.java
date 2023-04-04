package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class TimecardPage extends BaseClass {

	public TimecardPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//label[text()='Group']/parent::div/child::select")
	WebElement group;

	@FindBy(xpath="//label[text()='Function']/parent::div/child::select")
	WebElement function;

	@FindBy(xpath="//label[text()='Department']/parent::div/child::select")
	WebElement department;

	@FindBy(xpath="//label[text()='Team']/parent::div/child::select")
	WebElement team;

	@FindBy(xpath="//label[text()='State']/parent::div/child::select")
	WebElement state;

	@FindBy(xpath="//label[text()='Location']/parent::div/child::select")
	WebElement location;

	@FindBy(xpath="//label[text()='Contractor']/parent::div/child::select")
	WebElement contractor;

	@FindBy(xpath="//label[text()='Attendance Date']/parent::div/child::input")
	WebElement attendanceDate;

	@FindBy(id="searchButton")
	WebElement btnSearch;


	private void selectGroup(String Group ) {

		selectDropdownOption(group, Group);

	}

	private void selectFunction(String Function) {

		selectDropdownOption(function, Function);

	}

	private void selectDepartment(String Department) {

		selectDropdownOption(department, Department);

	}

	private void selectTeam(String Team) {

		selectDropdownOption(team, Team);

	}

	private void selectState(String State) {

		selectDropdownOption(state, State);

	}

	private void selectLocation(String Location) {

		selectDropdownOption(location, Location);

	}

	private void selectcontractor(String Contractor) {

		selectDropdownOption(contractor, Contractor);

	}

	private void setAttendanceDate(String Attendance) {

		attendanceDate.sendKeys(Attendance);

	}
	
	private void clickSearch() {
		
		btnSearch.click();

	}




}
