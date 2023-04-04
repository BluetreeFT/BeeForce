package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class FlipkartEAttendanceFTEHomePage extends BaseClass {

	public FlipkartEAttendanceFTEHomePage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[text()='Timecard']")
	WebElement timecard; 

	@FindBy(xpath="//a[text()='Tasks']")
	WebElement task;

	@FindBy(xpath="//span[text()='Reports']")
	WebElement reports;

	@FindBy(xpath="//a[text()='Employee']")
	WebElement employee;

	@FindBy(xpath="//a[text()='Attendance']")
	WebElement attendance;

	@FindBy(xpath="//a[text()='Continuous Absent']")
	WebElement continuousAbsent;

	@FindBy(xpath="//a[text()='Attendance Transaction']")
	WebElement attendanceTransaction;

	@FindBy(xpath="//a[text()='Continuous Present']")
	WebElement continuousPresent;

	@FindBy(xpath="//a[text()='Overtime Summary']")
	WebElement overtimeSummary;

	@FindBy(xpath="//a[text()='Leave Balance']")
	WebElement leaveBalance;

	@FindBy(xpath="//a[text()='Pending Request'] ")
	WebElement pendingRequest;

	@FindBy(xpath="//a[text()='Approved Request']")
	WebElement approvedRequest;

	@FindBy(xpath="//a[text()='Exception']")
	WebElement exception;

	@FindBy(xpath="//a[text()='Device Punch']")
	WebElement devicePunch;

	@FindBy(xpath="//a[text()='Muster Roll']")
	WebElement musterRoll;

	@FindBy(xpath="//span[text()='Planners']")
	WebElement planners;

	@FindBy(xpath="//a[text()='Overtime Planner']")
	WebElement overtimePlanner;

	@FindBy(xpath="//a[text()='Schedule Planner']")
	WebElement schedulePlanner;

	@FindBy(xpath="//span[text()='Uploads']")
	WebElement uploads;

	@FindBy(xpath="//a[text()='Schedule']")
	WebElement schedule;


	public void clickTimecard() {

		timecard.click();
		
	}

	public void clickTask() {

		task.click();

	}

	public void clickrReportsDropdown() {

		reports.click();

	} 

	public void clickEmployeeLink() {

		employee.click();

	}

	public void clickAttendanceLink() {

		attendance.click();

	}
	public void clickContinuousAbsentLink() {

		continuousAbsent.click();

	}
	public void clickAttendanceTransactionLink() {

		attendanceTransaction.click();

	}

	public void clickContinuousPresentLink() {

		attendanceTransaction.click();

	}

	public void clickOvertimeSummaryLink() {

		overtimeSummary.click();

	}

	public void clickLeaveBalanceLink() {

		leaveBalance.click();

	}

	public void clickPendingRequestLink() {

		pendingRequest.click();

	}

	public void clickApprovedRequestLink() {

		approvedRequest.click();

	}

	public void clickExceptionLink() {

		exception.click();

	}
	
	public void clickDevicePunchLink() {

		devicePunch.click();

	}
	
	public void clickMusterRollLink() {

		musterRoll.click();

	}
	
	public void clickplannersDropdown() {

		planners.click();

	}
	public void clickOvertimePlannerLink() {

		overtimePlanner.click();

	}

	public void clickSchedulePlannerLink() {

		schedulePlanner.click();

	}
	
	public void clickUploadsDropdown() {

		uploads.click();

	}

	public void clickScheduleLink() {

		schedule.click();

	}



}
