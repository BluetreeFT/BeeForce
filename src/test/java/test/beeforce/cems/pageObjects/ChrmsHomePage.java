package test.beeforce.cems.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class ChrmsHomePage extends BaseClass {
	
 public ChrmsHomePage() {
	 
	 PageFactory.initElements(driver, this);
	 
}
 
 @FindBy(xpath="//span[text()='Data Management ']")
 WebElement dataManagement;
 
 @FindBy(xpath="//span[text()='Employee Data']")
 WebElement employeeData;
 
 @FindBy(xpath="//a[text()='Employee View/Edit']")
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
 
 
 
 public void clickDataManagement() {
	 
	 dataManagement.click();
	 
 }
 
 public void clickEmployeeData() {
	 
	 employeeData.click();
	 
 }
 
 public void clickEmployeeViewAndEdit() {
	 
	 employeeViewAndEdit.click();
	 
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





}
