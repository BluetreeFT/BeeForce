package test.beeforce.cems.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.STLModulesPage;

public class ChrmsHomePage extends BaseClass {
	
 public ChrmsHomePage() {
	 
	 PageFactory.initElements(driver, this);
	 
}
 
 @FindBy(xpath="//span[text()='Data Management ']")
 WebElement dataManagement;
 
 @FindBy(xpath="//span[text()='Employee Data']")
 WebElement employeeData;
 
 @FindBy(xpath="//a[contains(text(),'Employee') and contains(text(),'View/Edit')]")
 WebElement employeeViewAndEdit;
 
 @FindBy(xpath="//i/following-sibling::span[contains(text(),'Employee Field') and contains(text(),'Update')]")
 WebElement employeeFieldUpadteDropdown;
 
 @FindBy (xpath="//li/child::a[contains(text(),'Employee') and contains(text(),'Field Update')]")
 WebElement employeeFieldUpdate;
 
 @FindBy (xpath="//li/child::a[contains(text(),'Employee') and contains(text(),'Field Status')]")
 WebElement employeeFieldStatus;
 
 @FindBy (xpath="//li/child::a/i/following-sibling::span[contains(text(),'Employee') and contains(text(),'Reports')]")
 WebElement employeeReportsDropdown;
 
 @FindBy (xpath="//li/child::a[contains(text(),'Employee Full List')]")
 WebElement employeeFullList;
 

 //payroll
 
 @FindBy (xpath="//li/child::a[contains(text(),'Payroll Details Update')]")
 WebElement payrollDetailsUpdate;
 
 @FindBy (xpath="//span[contains(text(),'Billing') and contains(text(),'Management')]")
 WebElement billingManagementDropdown;
 
 @FindBy (xpath="//span[contains(text(),'Employee Fixed CTC')]")
 WebElement employeeFixedCTC;

 @FindBy (xpath="//li/child::a[contains(text(),'CTC') and contains(text(),'Initiation')]")
 WebElement ctcInitiation;
 
 @FindBy (xpath="//li/child::a[contains(text(),'CTC') and contains(text(),'Run History')]")
 WebElement ctcRunHistory;
 
 @FindBy (xpath="//li/child::a[contains(text(),'CTC') and contains(text(),'Update')]")
 WebElement ctcUpdate;
 
 @FindBy (xpath="//span[contains(text(),'Pre-Payroll') and contains(text(),'Process')]")
 WebElement  PrePayrollProces;
 
 @FindBy (xpath="//li/child::a[contains(text(),'AMS Data Upload')]")
 WebElement  attendanceUpload;
 
 @FindBy (xpath="//li/child::a[contains(text(),'Variable Data') and contains(text(),'Upload')]")
 WebElement  variableUpload;
 
 @FindBy (xpath="//i[@class='mdi mdi-account-cash']/following-sibling::span[contains(text(),'Payroll') and contains(text(),'Management')]")
 WebElement  payrollManagement; // Payroll Management
 
 @FindBy (xpath="//i[@class='mdi mdi-alpha-r-box']/following-sibling::span[contains(text(),'Payroll')]")
 WebElement  payroll; // Payroll
 
 @FindBy (xpath="//li/child::a[contains(text(),'Attendance Input Upload')]")
 WebElement  attendanceInputUpload; //Attendance Input Upload
 
 @FindBy (xpath="//li/child::a[contains(text(),'Variable Input Upload')]")
 WebElement  variableInputUpload; //Variable Input Upload
 
 @FindBy (xpath="//li/child::a[text()='Payroll Run']")
 WebElement  payrollRun; // Payroll run
 
 @FindBy (xpath="//li/child::a[text()='Payroll Run History ']")
 WebElement  payrollRunHistory; // Payroll run History
 
 @FindBy (xpath="//span[contains(text(),'PayRoll') and contains(text(),'Reports')]")
 WebElement  payrollReports; // Payroll reports
 
 @FindBy (xpath="//li/child::a[text()='Pay sheet Report ']")
 WebElement  paysheetReport; // Pay Sheet reports
 
 
 
 
 
 
 public void clickDataManagement() {
	 
	 javaScriptExecutorClick(dataManagement);
	 
 }
 
public void clickBillingManagement() {
	 
	 javaScriptExecutorClick(billingManagementDropdown);
	 
 }
 
 public void clickEmployeeData() {
	 
	 javaScriptExecutorClick(employeeData);
	 
 }
 
public void clickPayrollDetailsUpdate() {
	 
	 javaScriptExecutorClick(payrollDetailsUpdate);
	 
 }
 public void clickEmployeeViewAndEdit() throws InterruptedException {
	 
	 Thread.sleep(1000);
	 javaScriptExecutorClick(employeeViewAndEdit);
	 
 }
 
 public void clickEmployeeFieldUpdateDropDown() {
	 
	 employeeFieldUpadteDropdown.click();
	 
 }
 
public void clickEmployeeFieldUpdate() {
	 
	employeeFieldUpdate.click();
	 
 }

public void clickEmployeeFieldStatus() {
	
	employeeFieldStatus.click();
	
}

public void clickEmployeeReportsDropdown() {
	
	employeeReportsDropdown.click();
	
}

public void clickEmployeefullList() {
	
	employeeFullList.click();
	
}


public void clickEmployeeFixedCTC() {
	
	employeeFixedCTC.click();

}

public void clickCTCInitiation() {
	
	ctcInitiation.click();

}

public void clickCTCUpdate() {

	ctcUpdate.click();
	
}

public void clickCTCRunHistory() {

	ctcRunHistory.click();
}

public void clickPayrollManagement() {

	payrollManagement.click();
}


public void clickpayroll() {

	payroll.click();
	
}

public void clickAttendanceInputUpload() {

	attendanceInputUpload.click();
}

public void clickVariableInputUpload() {
	
	variableInputUpload.click();
}

public void clickPayrollRun() {
	
	payrollRun.click();
}

public void clickPayrollRunHistory() {
	
	payrollRunHistory.click();
}

public void clickPayrollReports() {
	
	payrollReports.click();
	
}

public void clickPaysheetReport () {
	
	paysheetReport.click();
}



public void openEmployeeViewAndEditPage() throws InterruptedException {

//	STLModulesPage mp=new STLModulesPage();

	ChrmsHomePage chp=new ChrmsHomePage();

//	mp.clickNavigationMenu();

//	mp.clickCHRMSModule();

	chp.clickDataManagement();

	chp.clickEmployeeData();

	chp.clickEmployeeViewAndEdit();

}




}
