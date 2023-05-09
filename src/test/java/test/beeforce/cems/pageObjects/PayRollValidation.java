package test.beeforce.cems.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class PayRollValidation  extends BaseClass{

	public PayRollValidation() {

		PageFactory.initElements(driver, this);
	}



	// Payroll Details Update

	@FindBy(id="fileUploaded")  //choose File Button
	WebElement fileUpload;


	@FindBy(xpath="//button[@type='submit' and @data-original-title='Upload Template']") //Upload Button
	WebElement btnFileUpload;

	//Attendance Input Upload

	@FindBy(id="processingStageId")
	WebElement processingStage;
	
	@FindBy(xpath="//legend[text()='Upload']//following-sibling::form/child::div/child::div/div/label[contains(text(),'Month')]/following-sibling::select")
	WebElement ctcMonth;
	
	@FindBy(xpath="//legend[text()='Upload']//following-sibling::form/child::div/child::div/div/label[contains(text(),'Year')]/following-sibling::select")
	WebElement ctcYear;

	@FindBy(id="month")
	WebElement month;

	@FindBy(id="year")
	WebElement year;

	@FindBy(xpath="//button[@type='submit' and @data-original-title='upload Template']") //Upload Button for CTC Initiation And Payroll Run
	WebElement btnFileUpload1;

	//Variable Input Upload

	@FindBy(id="cmptId")
	WebElement wageType;

	//Paysheet Sheet Report

	@FindBy(id="monthAndYearId")
	WebElement paysheetMonth;

	@FindBy(id="yearId")
	WebElement paysheetYear;

	@FindBy(id="employeeNumber")
	WebElement empNum;

	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement btnSubmit;



	private void chooseUploadFile(String file) {

		fileUpload.sendKeys(file);

	}
	private void clickUploadButton() {

		btnFileUpload.click();
	}

	private void clickUploadButton1() {

		btnFileUpload1.click();

	}

	private void selectProcessingStage(String ProcessingStage) {

		selectDropdownOption(processingStage, ProcessingStage);

	}
	
	private void selectCTCUploadMonth(String Month) {
		
		selectDropdownOption(ctcMonth, Month);

	}
	
	private void selectCTCUploadYear(String Year) {
		
		selectDropdownOption(ctcYear, Year);

	}

	private void selectMonth(String Month) {

		selectDropdownOption(month, Month);

	}

	private void selectYear(String Year) {

		selectDropdownOption(year, Year);
	}


	private void selectWageType(String WageType) {

		selectDropdownOption(wageType, WageType);

	}

	private void selectPaysheetMonth(String PaysheetMonth) {

		selectDropdownOption(paysheetMonth, PaysheetMonth);
	}
	private void selectPaysheetYear(String PaysheetYear) {

		selectDropdownOption(paysheetYear, PaysheetYear);

	}
	private void setEmployeeNumber(String EmpNum) {

		empNum.sendKeys(EmpNum);
	}

	private void clickPaysheetSubmitButton() {

		btnSubmit.click();

	}


	public void uploadPayrollDetails(String file) {

		ChrmsHomePage ch=new ChrmsHomePage();

		ch.clickDataManagement();
		ch.clickEmployeeData();
		ch.clickPayrollDetailsUpdate();
		chooseUploadFile(file);
		clickUploadButton();

	}

	public void initiateCTC(String Month, String Year,String file) throws InterruptedException {

		ChrmsHomePage ch=new ChrmsHomePage();

		ch.clickBillingManagement();

		ch.clickEmployeeFixedCTC();

		ch.clickCTCInitiation();
		
		Thread.sleep(1000);

		selectMonth(Month);

		selectYear(Year);

		chooseUploadFile(file);

		clickUploadButton1();

	}

	public void upadteCTC(String WageType,String Month,String Year,String file) throws InterruptedException {

		ChrmsHomePage ch=new ChrmsHomePage();

//		ch.clickCTCRunHistory();
//
//		String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
//
//		if(text.equalsIgnoreCase("InProgress")) {
//
//			Thread.sleep(20000);
//
//			String text1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
//
//
//			if(text1.equalsIgnoreCase("InProgress")) {
//
//				Thread.sleep(10000);
//
//			}
//		}

		ch.clickBillingManagement();
		ch.clickEmployeeFixedCTC();
		ch.clickCTCUpdate();
		selectWageType(WageType);
		selectCTCUploadMonth(Month);
		selectCTCUploadYear(Year);
		chooseUploadFile(file);
		clickUploadButton();

	}


	public void uploadAttendanceInput(String ProcessingStage,String Month ,String Year,String file) {

		ChrmsHomePage ch=new ChrmsHomePage();

		ch.clickBillingManagement();

		ch.clickPayrollManagement();

		ch.clickpayroll();

		ch.clickAttendanceInputUpload();

		selectProcessingStage(ProcessingStage);

		selectMonth(Month);

		selectYear(Year);	

		chooseUploadFile(file);

		clickUploadButton();

	}


	public void uploadVariableInput(String WageType,String ProcessingStage, String Month,String Year,String file ) {

		ChrmsHomePage ch=new ChrmsHomePage();

		ch.clickBillingManagement();

		ch.clickPayrollManagement();

		ch.clickpayroll();

		ch.clickVariableInputUpload();

		selectWageType(WageType);

		selectProcessingStage(ProcessingStage);

		selectMonth(Month);

		selectYear(Year);

		chooseUploadFile(file);

		clickUploadButton();


	}

	public void initiatePayrollRun(String ProcessingStage,String Month,String Year,String file) {

		ChrmsHomePage ch=new ChrmsHomePage();

		ch.clickBillingManagement();

		ch.clickPayrollManagement();

		ch.clickpayroll();

		ch.clickPayrollRun();
		
		selectProcessingStage(ProcessingStage);
		
		selectMonth(Month);
		
		selectYear(Year);
		
		chooseUploadFile(file);
		
		clickUploadButton1();
		
	}

	public void downloadPaysheetReport(String WageType,String PaysheetMonth,String PaysheetYear ,String EmpNum) throws InterruptedException {

		ChrmsHomePage ch=new ChrmsHomePage();
		
		ch.clickBillingManagement();
		
		ch.clickPayrollManagement();

		ch.clickPayrollReports();

		ch.clickPaysheetReport();

		selectWageType(WageType);

		selectPaysheetMonth(PaysheetMonth);

		selectPaysheetYear(PaysheetYear);

		setEmployeeNumber(EmpNum);

		clickPaysheetSubmitButton();

		Thread.sleep(35000);

		driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/a[contains(text(),'Download')]")).click();

	}







}
