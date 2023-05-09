package test.beeforce.cems.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.beeforce.base.BaseClass;

public class EmployeeFieldUpdatePage extends BaseClass {

	public EmployeeFieldUpdatePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="employeeNumber")
	WebElement employeeNumber;

	@FindBy(id="sassFiledType-selectized")
	WebElement fieldType;

	@FindBy(id="submitId")
	WebElement btnSubmit;

	@FindBy(xpath="//input[@placeholder='field Value']")
	WebElement fieldVlaue;

	@FindBy(id="submitform2Id")
	WebElement btnSave;

	@FindBy(id="submitapprove")
	WebElement btnApprove;

	@FindBy(id="submitreject")
	WebElement btnReject;

	@FindBy(xpath="//a[@class='page-link' and text()='»»']")
	WebElement btnLastPage;

	@FindBy(xpath="//span[text()='«']")
	WebElement btnNext;




	public void setEmployeeNumber(String empNumber) {

		employeeNumber.clear();
		employeeNumber.sendKeys(empNumber);

	}

	public void selectFiedType(String fieldtype) {
		
		fieldType.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='option']"));
		
		for (WebElement option : options) {

			System.out.println( option.getText());
			
			if (option.getText().equalsIgnoreCase(fieldtype)) {
				
				option.click();
				
				break;
			}
			
		}

	}

	public void clickSubmitButton() {

		btnSubmit.click();
	}

	public void setToValue(String toValue) {

		fieldVlaue.clear();
		fieldVlaue.sendKeys(toValue);

	}

	public void clickSaveButton() {

		btnSave.click();
	}

	public void clickApproveButton() {

		javaScriptExecutorClick(btnApprove);
		
	}

	public void clickRejectButton() {

		btnReject.click();
	}

	public void clickLastpageButton() {
		
		scrollToElement(btnLastPage);
		
		javaScriptExecutorClick(btnLastPage);
	}

	public void clickNextButton() {

		btnNext.click();
	}

	public String getNextButtonClass() {

		String nextbuttonclass = btnNext.getAttribute("class");

		return nextbuttonclass;

	}





}
