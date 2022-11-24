package test.attest360.pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class VerifierPage extends BaseClass {
	public VerifierPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()=' Click Here']")
	WebElement clickHere;
	@FindBy(id="searchName")
	WebElement txtsearch;
	@FindBy(id="button-addon2")
	WebElement btnsearch;
	//Components
	@FindBy(id="basicDetails0")
	WebElement eduPage;
	@FindBy(id="basicDetails1")
	WebElement empPage;
	@FindBy(id="basicDetails2")
	WebElement AddPage;
	@FindBy(id="basicDetails3")
	WebElement criPage;
	@FindBy(id="basicDetails4")
	WebElement idPage;

	//*********FirstAccept**************
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails0']/following::*[@class='span10']//*[@id='accordion1']//*[text()='Accept']")
	WebElement eduAccept;
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails1']/following::*[@class='span10']//*[@id='accordion2']//*[text()='Accept']")
	WebElement empAccept;
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails2']/following::*[@class='span10']//*[@id='accordion3']//*[text()='Accept']")
	WebElement addAccept;
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails3']/following::*[@class='span10']//*[@id='accordion4']//*[text()='Accept']")
	WebElement criminalAccept;
	@FindBy(xpath="(//*[@class='span2.5']//*[@id='basicDetails4']/following::*[@class='span10']//*[@id='accordion5']//*[text()='Accept'])[1]")
	WebElement idAccept;
	@FindBy(xpath="(//*[@class='span2.5']//*[@id='basicDetails4']/following::*[@class='span10']//*[@id='accordion5']//*[text()='Accept'])[2]")
	WebElement aadAccept;
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails5']/following::*[@class='span10']//*[@id='accordion6']//*[text()='Accept']")
	WebElement dtabaseAccept;
	@FindBy(xpath="//*[@class='span2.5']//*[@id='basicDetails6']/following::*[@class='span10']//*[@id='accordion7']//*[text()='Accept']")
	WebElement policVeriAccept;
	//*********Evidence Upload*****************
	@FindBy(id="uploadEvidenceId0")
	WebElement eduEvidence;
	@FindBy(id="uploadEvidenceId1")
	WebElement EmpEvidence;
	@FindBy(id="uploadEvidenceId2")
	WebElement addEvidence;
	@FindBy(id="uploadEvidenceId3")
	WebElement criEvidence;
	@FindBy(id="uploadEvidenceId4")
	WebElement idEvidence;
	@FindBy(id="uploadEvidenceId5")
	WebElement aadEvidence;
	//**********Approve*******
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
	//******************************	
	@FindBy(id="internal")
	WebElement clickinternal;
	@FindBy(id="external")
	WebElement clickExternal;
	@FindBy(id="digitalVerification")
	WebElement clickDigitalVerfication;

	@FindBy(id="submitModal001")
	WebElement internsubmit;
	@FindBy(id="submitModal13")
	WebElement totalsubmit;

	//comparison form element
	@FindBy(xpath="//button[@id='submitComparisonForm']")
	WebElement compSubmit; 

	public void searchEmployee(String crtNum) throws InterruptedException{

		javaScriptExecutorClick(clickHere);
		txtsearch.sendKeys(crtNum);
		btnsearch.click();
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNum+"']")).click();
	}
	public void EductionVerification(String path) throws InterruptedException {
		eduPage.click();
		try {
			if(eduAccept.isDisplayed()) {
				javaScriptExecutorClick(eduAccept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		eduEvidence.sendKeys(path);
		Thread.sleep(3000);
		javaScriptExecutorClick(clickinternal);
		Thread.sleep(3000);
		javaScriptExecutorClick(internsubmit);
		Thread.sleep(2000);
		javaScriptExecutorClick(eduApprove);
		Thread.sleep(1000);
		javaScriptExecutorClick(totalsubmit);
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					Thread.sleep(2000);
					compSubmit.click();
				}
			}
		}
		Thread.sleep(2000);

	}

	public void AddressVerification(String path) throws InterruptedException {

		AddPage.click();
		try {
			if(addAccept.isDisplayed()) {
				javaScriptExecutorClick(addAccept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		addEvidence.sendKeys(path);
		Thread.sleep(1000);
		javaScriptExecutorClick(clickinternal);
		Thread.sleep(2000);
		javaScriptExecutorClick(internsubmit);
		Thread.sleep(2000);
		javaScriptExecutorClick(addApprove);
		Thread.sleep(1000);
		javaScriptExecutorClick(totalsubmit);
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();

				}
			}
		}
	}

	public void IdentificationVerification(String path) throws InterruptedException {

		idPage.click();
		try {
			if(idAccept.isDisplayed()) {
				System.out.println("displayed");
				javaScriptExecutorClick(idAccept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		idEvidence.sendKeys(path);
		Thread.sleep(1000);
		javaScriptExecutorClick(clickinternal);
		javaScriptExecutorClick(internsubmit);
		Thread.sleep(2000);
		javaScriptExecutorClick(idApprove);
		javaScriptExecutorClick(totalsubmit);
		Thread.sleep(1000);
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					Thread.sleep(2000);

				}
			}
		}
		aadEvidence.sendKeys(path);
		Thread.sleep(2000);
		javaScriptExecutorClick(aadApprove);
		try {
			javaScriptExecutorClick(totalsubmit);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		Set<String> childWindows1 = driver.getWindowHandles();
		int size1 = childWindows1.size();
		if (size1>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows1) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();

				}
			}
		}

	}

	public void CriminalVerification(String path) throws InterruptedException {

		criPage.click();
		try {
			if(criminalAccept.isDisplayed()) {
				javaScriptExecutorClick(criminalAccept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		criEvidence.sendKeys(path);
		Thread.sleep(1000);
		javaScriptExecutorClick(clickinternal);
		Thread.sleep(2000);
		javaScriptExecutorClick(internsubmit);
		Thread.sleep(2000);
		javaScriptExecutorClick(criApprove);
		Thread.sleep(1000);
		javaScriptExecutorClick(totalsubmit);
		Thread.sleep(2000);
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();

				}
			}
		}
	}
	
	
	


}



