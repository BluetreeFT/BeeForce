package test.attest360.pageObjects;


import java.util.Set;

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
	@FindBy(xpath="//a[text()='All']")
	WebElement alllink;
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	//********approval page***************
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Education')]")
	WebElement eduPage;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Employment')]")
	WebElement Emppage;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Address Verification')]")
	WebElement addressverfi;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Criminal Verification')]")
	WebElement criverfi;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Identification')]")
	WebElement identiverfi;
	@FindBy(id="reports")
	WebElement reports;
	//Reports button
	@FindBy(id="generateInterimId")
	WebElement intrimReport;
	@FindBy(id="interimReportButton")
	WebElement generateIntrim;
	@FindBy(id="generateFinalId")
	WebElement finalReport;
	@FindBy(id="finalReportButton")
	WebElement generateFinal;
	@FindBy(id="reportTemplate")
	WebElement template;

	//approve buttons
	@FindBy(id="approveButton0")
	WebElement eduApprove;
	@FindBy(id="approveButton1")
	WebElement empApprove;
	@FindBy(id="approveButton2")
	WebElement addApprove;
	@FindBy(id="approveButton3")
	WebElement criApprove;
	@FindBy(id="approveButton4")
	WebElement idApprove;
	@FindBy(id="approveButton5")
	WebElement aadApprove;
	//comparison form element
	@FindBy(xpath="//button[@id='submitComparisonForm']")
	WebElement compSubmit; 


	public void runAutoDeligate(String customername) throws InterruptedException {
		dropdownVerification.click();
		autodelicatelink.click();
		selectDropdownOption(customerDropdown,customername);
		btnRun.click();
		Thread.sleep(2000);
	}
	public void clickFinalApproval(String crtNum) {
		dropdownVerification.click();
		finalApprovallink.click();
		alllink.click();
		search.sendKeys(crtNum);
		driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
	}

	public void qaDecissionEducation() throws InterruptedException {
		eduPage.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(eduApprove);
	}
	public void qaDecissionEmployement() throws InterruptedException {
		Thread.sleep(1000);
		Emppage.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(empApprove);
	}
	public void qaDecissionAddress() throws InterruptedException {
		Thread.sleep(1000);
		addressverfi.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(addApprove);
	}
	public void qaDecissionCriminal() throws InterruptedException {
		Thread.sleep(1000);
		criverfi.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(criApprove);
		try {
			Set<String> childWindows1 = driver.getWindowHandles();
			int size1 = childWindows1.size();
			if (size1>1) {
				String parentWindow = driver.getWindowHandle();
				for (String window : childWindows1) {
					if (!parentWindow.equals(window)) {
						driver.switchTo().window(window);
						compSubmit.click();
						driver.switchTo().window(parentWindow);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void qaDecissionIdentification() throws InterruptedException {
		Thread.sleep(1000);
		identiverfi.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(idApprove);
		Thread.sleep(1000);
		try {
			Set<String> childWindows = driver.getWindowHandles();
			int size1 = childWindows.size();
			if (size1>1) {
				String parentWindow = driver.getWindowHandle();
				for (String window : childWindows) {
					if (!parentWindow.equals(window)) {
						driver.switchTo().window(window);
						compSubmit.click();
						driver.switchTo().window(parentWindow);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		javaScriptExecutorClick(aadApprove);
		try {
			Set<String> childWindows1 = driver.getWindowHandles();
			int size1 = childWindows1.size();
			if (size1>1) {
				String parentWindow = driver.getWindowHandle();
				for (String window : childWindows1) {
					if (!parentWindow.equals(window)) {
						driver.switchTo().window(window);
						compSubmit.click();
						driver.switchTo().window(parentWindow);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void generateIntrimReport() throws InterruptedException {
		refresh();
		reports.click();
		Thread.sleep(1000);
		intrimReport.click();
		Thread.sleep(1000);
		generateIntrim.click();
	}
	public void generateFinalReport() throws InterruptedException {
		refresh();
		try {
			reports.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		finalReport.click();
		Thread.sleep(1000);
		generateFinal.click();
	}


}
