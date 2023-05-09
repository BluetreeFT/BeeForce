package test.beeforce.cems.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.beeforce.base.BaseClass;

public class TitanEmployeeViewAndEditPage extends BaseClass {

	public TitanEmployeeViewAndEditPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="employeeNumber")
	WebElement EmpNumber;

	@FindBy(id="employeeName")
	WebElement EmpName;

	@FindBy(xpath="//button[@type='submit']")
	WebElement Btnsearch;

	@FindBy(id="activeStatus")
	WebElement employeeStatus;

	@FindBy(id="saveBtn")
	WebElement btnSubmit;

	@FindBy(id="terminatedReason")
	WebElement terminatedReson;

	@FindBy(id="terminatedDate")
	WebElement terminatedDate;

	@FindBy(id="rejectedReason")
	WebElement rejectedReson;

	@FindBy(id="rejectedDate")
	WebElement rejectedDate;

	@FindBy(id="resignedReason")
	WebElement resignedReason;

	@FindBy(id="resignedDate")
	WebElement resignedDate;

	@FindBy(xpath="//strong[contains(text(),'Employee Details Updated Successfully')]")
	WebElement success;


	//tabs 
	@FindBy(xpath="//span[text()='Professional Details']")
	WebElement professionalDetails;

	@FindBy(xpath="//span[text()='Personal Details']")
	WebElement personalDetails;

	@FindBy(xpath="//span[text()='Induction Details']")
	WebElement inductionDetails;

	@FindBy(xpath="//span[text()='Addresss Details']")
	WebElement AddresssDetails;

	//Basic Details

	@FindBy(id="bloodGroupId") //bloodgroup
	WebElement bloodGroup;

	@FindBy(id="contractorTypeId") //contractorType
	WebElement contractorType;

	@FindBy(id="mobileNumberId")         //mobileNumber
	WebElement mobileNumber;

	@FindBy(id="martialStatusId") // marital status
	WebElement maritalStatus;

	@FindBy(id="workSkillId") // marital status
	WebElement workskill;

	// Basic Details-org hierarchy

	@FindBy(id="level1")   // Category  
	WebElement category;

	@FindBy(id="level2") // Division
	WebElement division;

	@FindBy(id="level3") // Location 
	WebElement location;

	@FindBy(id="level4") //CostCenter 
	WebElement costCenter;

	@FindBy(id="level5") //Department 
	WebElement department;

	@FindBy(id="level6") //Designation 
	WebElement designation;
	
	@FindBy(id="level7") //Contractor 
	WebElement contractor;
	
	@FindBy(id="level8") //ReportingManager
	WebElement reportingManager;

	@FindBy(id="level9") // Store 
	WebElement store;

	//Professional Details

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Qualification')]/following-sibling::div/input") // Store 
	WebElement qualification;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Employee No of Years Experience')]/following-sibling::div/input") // Store 
	WebElement employeeYearsExperience;

	//Emergency Details

	@FindBy(xpath="//legend[contains(text(),'Emergency Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Emergency Contact Number')]/following-sibling::div/input") // Store 
	WebElement emergencyContactNumber;

	//Personal Details

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Community')]/following-sibling::div/input") // Store 
	WebElement community;

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Religion')]/following-sibling::div/input") // Store 
	WebElement religion;

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Physically Challenged')]/following-sibling::div/select") // Store 
	WebElement physicallyChallenged;

	// Compliance Details

	@FindBy(xpath="//legend[contains(text(),'Compliance Details')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'UAN Number')]/following-sibling::div/input") // Store 
	WebElement UANNumber;

	// Permanent Address Details

	@FindBy(xpath="//legend[contains(text(),'Permanent Address')]/parent::fieldset/child::div/child::div/child::div/label[contains(text(),'Permanent Address')]/following-sibling::div/input") // Store 
	WebElement permanentAddress;



	public void setEmployeeNumber(String empNumber) {

		EmpNumber.clear();
		EmpNumber.sendKeys(empNumber);

	}

	public void setEmployeeName(String empName) {

		EmpName.clear();
		EmpName.sendKeys(empName);

	}

	public void clickSearchButton() {

		Btnsearch.click();

	}

	public void SelectEmployeeStatus(String status) {

		selectDropdownOption(employeeStatus, status);

	}

	public void selectTerminatedReason(String Reason) {

		selectDropdownOption(terminatedReson, Reason);

	}

	public void selectRejectedReason(String Reason) {

		selectDropdownOption(rejectedReson, Reason);

	}

	public void selectResignedReason(String Reason) {

		selectDropdownOption(resignedReason, Reason);

	}

	public void resignedDate() {

//		resignedDate.clear();
		resignedDate.sendKeys(CurrentDate());
	}

	public void rejectedDate() {

//		rejectedDate.clear();
		rejectedDate.sendKeys(CurrentDate());
	}
	public void terminatedDate() {

//		terminatedDate.clear();
		terminatedDate.sendKeys(CurrentDate());
	}

	public void clickSubmit() {

		btnSubmit.click();
	}

	private void clickProfessionaldetailstab() {

		javaScriptExecutorClick(professionalDetails);

	}

	private void clickPersonaldetailstab() {

		personalDetails.click();

	}

	private void clickInductiondetailstab() {

		inductionDetails.click();

	}

	private void clickAddresssdetailstab() {

		AddresssDetails.click();

	}

	public String getBloodGroup() {

		String bloodgroup = bloodGroup.getAttribute("value");
		return bloodgroup;

	}

	public String getContractorType() {

		String ContractorType = contractorType.getAttribute("value");

		return ContractorType;
	}

	private String getMobileNumber() {


		String MobileNumber = mobileNumber.getAttribute("value");
		return MobileNumber;
	}

	private String getMaritalStatus() {

		String MaritalStatus = maritalStatus.getAttribute("value");
		return MaritalStatus;

	}

	public String getCategory()  {
		Select sel=new Select(category);
		WebElement c = sel.getFirstSelectedOption();
		String Category = c.getText();

		return Category;

	}

	public String getDivision() {
		Select sel=new Select(division);
		WebElement d = sel.getFirstSelectedOption();
		String Division = d.getText();

		return Division;
	}

	public String getLocation() {

		Select sel=new Select(location);
		WebElement l = sel.getFirstSelectedOption();
		String Location = l.getText();

		return Location;

	}

	public String getCostCenter() {

		Select sel=new Select(costCenter);
		WebElement cc = sel.getFirstSelectedOption();
		String CostCenter = cc.getText();

		return CostCenter;


	}
	private String getDepartment()  {

		Select sel=new Select(department);
		
		WebElement   d= sel.getFirstSelectedOption();
		
		String Department = d.getText();

		return Department;

	}

	public String getContractor()  {


		Select sel=new Select(contractor);
		WebElement   c= sel.getFirstSelectedOption();
		String Contractor = c.getText();

		return Contractor;

	}

	public String getDesignation()  {
		Select sel=new Select(designation);
		WebElement   d= sel.getFirstSelectedOption();

		String Designation = d.getText();

		return Designation;

	}

	public String getReportingManager()  {
		Select sel=new Select(reportingManager);
		WebElement   r= sel.getFirstSelectedOption();
		String ReportingManager = r.getText();

		return ReportingManager;

	}

	public String getStore()  {
		Select sel=new Select(store);
		WebElement   s= sel.getFirstSelectedOption();
		String Store = s.getText();

		return Store;
	}

	public String getWorkSkil() {

		String WorkSkil = workskill.getAttribute("value");

		return WorkSkil;
	}

	public String getQualification() {

		clickProfessionaldetailstab();

		String Qualification = qualification.getAttribute("value");

		return Qualification;


	}
	public String getEmployeeNoofYearsExperience() {

		String yearsofexp = employeeYearsExperience.getAttribute("value");

		return yearsofexp;
	}

	public String getEmergencyContactNumber() {

		clickPersonaldetailstab();

		String EmergencyContactNumber = emergencyContactNumber.getAttribute("value");

		return EmergencyContactNumber;


	}
	public String getCommunity () {


		String Community = community.getAttribute("value");

		return Community;

	}
	public String getPhysicallyChallenged() {

		String PhysicallyChallenged = physicallyChallenged.getAttribute("value");

		return PhysicallyChallenged;

	}
	public String getReligion( ) {

		String Religion = religion.getAttribute("value");

		return Religion;
	}

	public String getUANNumber( ) {

		clickInductiondetailstab();

		String UAN = UANNumber.getAttribute("value");

		return UAN;
	}

	public String getPermanentAddress( ) {

		clickAddresssdetailstab();

		String perAddress = permanentAddress.getAttribute("value");

		return perAddress;
	}



	public String getSuccessmessasge() {

		String messageSuccess = success.getText();

		return messageSuccess;

	}




}
