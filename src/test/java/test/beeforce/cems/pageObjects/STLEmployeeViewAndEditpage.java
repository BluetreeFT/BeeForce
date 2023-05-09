package test.beeforce.cems.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.gherkin.model.ScenarioOutline;

import test.beeforce.base.BaseClass;

public class STLEmployeeViewAndEditpage extends BaseClass {

	public STLEmployeeViewAndEditpage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//span[text()='Data Management ']")
	WebElement dataManagement;

	@FindBy(xpath="//span[contains(text(),'Associate') and contains(text(),'Data')]")
	WebElement associateData;

	@FindBy(xpath="//a[contains(text(),'Associate') and contains(text(),'View/Edit')]")
	WebElement associateViewAndEdit;


	@FindBy(id="editBtn")
	WebElement btnEdit;

	@FindBy(id="personalEmailId")
	WebElement personalEmailId;

	@FindBy(id="genieCategoryId")
	WebElement principalContactName;

	@FindBy(id="employeeType")
	WebElement associatesType;

	@FindBy(id="psotion")
	WebElement position;

	@FindBy(id="eposotion")
	WebElement attendancePosition;

	@FindBy(id="ssoligin")
	WebElement SSO;

	//tabs 
	@FindBy(xpath="//span[text()='WorkOrder Details']")
	WebElement workOrderDetailstab;

	@FindBy(xpath="//span[text()='Associate Details']")
	WebElement associateDetailsTab;

	@FindBy(xpath="//span[text()='User Details']")
	WebElement userDetailsTab;


	private void clickDataManagement() {

		dataManagement.click();

	}

	private void clickAssociateData() {

		associateData.click();

	}

	private void clickAssociateViewAndEdit() {

		associateViewAndEdit.click();

	}

	public void clickEditButton() {

		btnEdit.click();

	}

	private void setPersonalEmail(String email) throws InterruptedException {
		//		Thread.sleep(500);
		scrollToElement(personalEmailId);
		//		Thread.sleep(500);
		personalEmailId.sendKeys(email);

	}

	private void selectPrincipalContactName(String PrincipalContactName){

		scrollToElement(principalContactName);

		selectDropdownOption(principalContactName, PrincipalContactName);

	}

	private void clickWorkorderDetailsTab() throws InterruptedException {

		javaScriptExecutorClick(workOrderDetailstab);

	}

	public void clickAssociateDetailsTab() {

		javaScriptExecutorClick(associateDetailsTab);

	}

	private void selectAssociateType(String AssociateType) {

		selectDropdownOption(associatesType, AssociateType);

	}

	private void clickUserDetailsTab() {

		javaScriptExecutorClick(userDetailsTab);

	}

	private void selectPosition(String Position) {

		selectDropdownOption(position, Position);

	}

	private void selectEAttendancePosition(String EPosition) {

		selectDropdownOption(attendancePosition, EPosition);

	}

	private void selectSSO(String sso) {

		selectDropdownOption(SSO, sso);

	}


	private void setAssociateCDetails(String email,String PrincipalContactName ) throws InterruptedException {

		setPersonalEmail(email);
		Thread.sleep(500);
		selectPrincipalContactName(PrincipalContactName);
	}

	private void setWorkorderDetails(String AssociateType) throws InterruptedException {

		clickWorkorderDetailsTab();

		selectAssociateType(AssociateType);

	}

	private void setUserDetails(String Position,String EPosition,String sso) {

		clickUserDetailsTab();
		selectPosition(Position);
		selectEAttendancePosition(EPosition);
		selectSSO(sso);
	}
	//
	public void setEmployeeDetails(String email,String PrincipalContactName,String AssociateType,String Position,String  EPosition,String sso ) throws InterruptedException {
		clickEditButton();
		setAssociateCDetails(email, PrincipalContactName);
		setWorkorderDetails(AssociateType);
		setUserDetails(Position, EPosition, sso);
	}


	public void OpenAssociateViewAndEditPage() {

		clickDataManagement();
		clickAssociateData();
		clickAssociateViewAndEdit();
	}








}
