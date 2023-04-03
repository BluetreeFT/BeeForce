package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class FlipkartEAttendanceEmployeeHomePage extends BaseClass {

	public FlipkartEAttendanceEmployeeHomePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//span[text()='Attendance']")
	WebElement attendanceDropdown;

	@FindBy(xpath="//a[text()='My Attendance']")
	WebElement myAttendanceLink;

	@FindBy(xpath="//a[text()='My Schedule']")
	WebElement myScheduleLink;

	@FindBy(xpath="//span[text()='Requests']")
	WebElement RequestsDropdown;

	@FindBy(xpath="//a[text()='My Timeoff']")
	WebElement myTimeoffLink;

	@FindBy(xpath="//a[text()='My Regularization']")
	WebElement myRegularizationLink;

	@FindBy(xpath="//a[text()='Request/Process List']")
	WebElement requestListLink;


	private void clickAttendanceDropdown() {

		attendanceDropdown.click();

	}

	private void clickRequestsDropdown() {

		RequestsDropdown.click();

	}
	
	private void clickMyAttendanceLink() {

		myAttendanceLink.click();

	}

	private void clickmyScheduleLink() {

		myScheduleLink.click();

	}
	
	private void clickMyTimeoffLink() {

		myTimeoffLink.click();

	}

	private void clickmyRegularizationLink() {

		myRegularizationLink.click();

	}
	
	private void clickrequestListLink() {

		requestListLink.click();

	}

}
