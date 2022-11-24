package test.attest360.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class QaHomePage extends BaseClass {
	
	public QaHomePage() {
PageFactory.initElements(driver,this);
	
	}
//***********delegation**********
	@FindBy(xpath="//li/a[text()='Verification']")
	WebElement dropdownVerification;
	@FindBy(xpath="//li/a[text()='Run Auto Delegation']")
	WebElement autodelicatelink;
	@FindBy(id="delegationCustomerId")
	WebElement customerDropdown;
	@FindBy(id="autoDelegateBtn")	
	WebElement btnRun;
//*****final Approval*************	
	@FindBy(xpath="//li/a[text()='Final Approval']")
	WebElement finalApprovallink;
	@FindBy(xpath="//a[text()='Verification Pending']")
	WebElement verificationpendinglink;
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
//********approval page***************
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Education')]")
	WebElement eduPage;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Employment')]")
	WebElement Emppage;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Address Verification')]")
	WebElement addressverfi;
	@FindBy(id="reports")
	WebElement reports;
	@FindBy(id="generateInterimId")
	WebElement intrimReport;
	@FindBy(id="interimReportButton")
	WebElement generateIntrim;
	
	@FindBy(id="approveButton0")
	WebElement eduApprove;
	@FindBy(id="approveButton1")
	WebElement empApprove;
	@FindBy(id="approveButton2")
	WebElement addApprove;
	
	public void runAutoDeligate(String customername) throws InterruptedException {
		dropdownVerification.click();
		autodelicatelink.click();
		selectDropdownOption(customerDropdown,customername);
		btnRun.click();
	Thread.sleep(2000);
	}
	
	public void desicisionTaking(String crtNum) throws InterruptedException {
		dropdownVerification.click();
		finalApprovallink.click();
		verificationpendinglink.click();
		search.sendKeys(crtNum);
		driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
		eduPage.click();
		javaScriptExecutorClick(eduApprove);
		driver.navigate().refresh();
		reports.click();
		Thread.sleep(1000);
		intrimReport.click();
		Thread.sleep(1000);
		generateIntrim.click();
		
		
}
}
