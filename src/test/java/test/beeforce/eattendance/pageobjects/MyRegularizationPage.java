package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class MyRegularizationPage extends BaseClass {


	public MyRegularizationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="type")
	WebElement type;

	@FindBy(id="attendanceDate")
	WebElement attendanceDate;

	@FindBy(id="dayShift")
	WebElement dayShift;

	@FindBy(id="nightShift")
	WebElement nightShift;

	@FindBy(id="regularizedPunchIn")
	WebElement regularizedPunchIn;

	@FindBy(id="regularizedPunchOut")
	WebElement regularizedPunchOut;


	private void selectType(String Type) {

		selectDropdownOption(type, Type);
	}

	private void setAttendanceDate(String AttendanceDate) {

		attendanceDate.sendKeys(AttendanceDate);

	}

	private void selectShift(String Shift) {

		if (Shift.equalsIgnoreCase("DayShift")) {

			dayShift.click();

		} else if(Shift.equalsIgnoreCase("NightShift")){

			nightShift.click();
		}

	}

	private void setPunchIn(String punchin) {

		regularizedPunchIn.sendKeys(punchin);

	}

	private void setPunchOut(String punchout) {

		regularizedPunchOut.sendKeys(punchout);

	}





}
