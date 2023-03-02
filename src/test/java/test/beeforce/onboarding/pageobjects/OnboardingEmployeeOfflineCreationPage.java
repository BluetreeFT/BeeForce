package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class OnboardingEmployeeOfflineCreationPage extends BaseClass {

	public OnboardingEmployeeOfflineCreationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//legend[text()='Excel Upload']/parent::fieldset/child::form/child::div/child::div/input[@id='fileUploaded']")  //basic details file upload
	WebElement basicDetailsUpload;

	@FindBy(xpath="//legend[text()='Excel Upload']/parent::fieldset/child::form/child::div/child::button[@type='submit']") // basic details upload button
	WebElement btnBasicDetailsUpload;

	@FindBy(xpath="//legend[text()='Basic Document Upload']/parent::fieldset/child::div/child::div/input[@id='multipleDocUpload']")
	WebElement basicDocumentsUpload;

	@FindBy(xpath="//legend[text()='Basic Document Upload']/parent::fieldset/child::div/child::div/input[@id='multipleDocUpload']")
	WebElement btnBasicDocumentsUpload;

	@FindBy(xpath="//legend[text()='Component Document Upload']/parent::fieldset/child::div/child::div/input[@id='multipleDocUploadGeneric']")
	WebElement ComponentDocumentUpload;

	@FindBy(xpath="//legend[text()='Component Document Upload']/parent::fieldset/child::div/child::button[@id='multipleFileSubmitVaccCert']")
	WebElement btnComponentDocumentUpload;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	WebElement uploadInfo;
	//Success Count:1


	public void uploadBasicDetails(String path) {

		basicDetailsUpload.sendKeys(path);

	} 

	public void clickBasicDetailsUploadButton() {
		
		btnBasicDetailsUpload.click();
		
	}

	public void uploadComponenetDocuments(String path ) {

		ComponentDocumentUpload.sendKeys(path);

	} 
	public void clickComponenetDocumentsUploadButton() {

		btnComponentDocumentUpload.click();

	} 
	
	public String getUploadCount() {
		
		scrollToElement(uploadInfo);
		
		String text = uploadInfo.getAttribute("textContent");
		
		String SuccessCount = text.split("Count:")[2].substring(0, 1);
		
		return SuccessCount;
	}


}
