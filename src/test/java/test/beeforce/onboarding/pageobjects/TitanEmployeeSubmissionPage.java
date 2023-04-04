package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class TitanEmployeeSubmissionPage extends BaseClass {

	public TitanEmployeeSubmissionPage() {
		PageFactory.initElements(driver, this);
	}

	//Upadate information page

	//Basic Details

	@FindBy(id="bloodGroup") //bloodgroup
	WebElement bloodGroup;

	@FindBy(id="contractorType") //contractorType
	WebElement contractorType;

	@FindBy(id="mobilNo")          //mobileNumber
	WebElement mobileNumber;

	@FindBy(id="maritalStatus") // marital status
	WebElement maritalStatus;

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

	@FindBy(id="level6") //Contractor 
	WebElement contractor;

	@FindBy(id="level7") //Designation 
	WebElement designation;

	@FindBy(id="level8") //ReportingManager
	WebElement reportingManager;

	@FindBy(id="level9") // Store 
	WebElement store;

	//professional Details

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Work skill')]/following-sibling::select") // Store 
	WebElement workskill;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Qualification')]/following-sibling::div/child::div/input") // Store 
	WebElement qualification;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Employee No of Years Experienc')]/following-sibling::div/child::div/input") // Store 
	WebElement employeeYearsExperience;

	//Emergency Details

	@FindBy(xpath="//legend[contains(text(),'Emergency Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Emergency Contact Number')]/following-sibling::div/child::div/input") // Store 
	WebElement emergencyContactNumber;

	//Personal Details

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Community')]/following-sibling::div/child::div/input		") // Store 
	WebElement community;

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/div[contains(text(),'Religion')]/following-sibling::div/input") // Store 
	WebElement religion;

	@FindBy(xpath="//legend[contains(text(),'Personal Details')]/following-sibling::div/child::div/child::div/following-sibling::div/child::div[contains(text(),'Physically Challenged')]/following-sibling::select") // Store 
	WebElement physicallyChallenged;



	// Compliance Details

	@FindBy(xpath="//legend[contains(text(),'Compliance Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'UAN Number')]/following-sibling::div/child::div/input") // Store 
	WebElement UANNumber;

	// Payroll Details

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_BASIC')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedBasic;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_DA')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedDa;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_HRA')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedHra;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_CONVEYANCE')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedConveyance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_SUPPLEMENTARY_ALLOWANCE')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedSupplementaryAllowances;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'FIXED_MEDICAL_ALLOWANCE')]/following-sibling::div/child::div/input") // Store 
	WebElement fixedMedicalAllowance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'FIXED_SPECIAL_ALLOWANCE')]/following-sibling::div/input") // Store 
	WebElement fixedSpecialAllowance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'FIXED_WASHING_ALLOWANCE')]/following-sibling::div/input") // Store 
	WebElement fixedWashingAllowance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'FIXED_ATTENDANCE_INCENTIVE')]/following-sibling::div/input") // Store 
	WebElement fixedAttendanceAllowance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'FIXED_CC_ALLOWANCE')]/following-sibling::div/input") // Store 
	WebElement fixedCCAllowance;

	@FindBy(xpath="//legend[contains(text(),'Payroll Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'FIXED_OTHER_ALLOWANCE')]/following-sibling::div/input") // Store 
	WebElement fixedOtherAllowance;

	// Permanent Address Details

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/following-sibling::div/child::div/child::div/child::div[contains(text(),'Permanent Address')]/child::input") // Store 
	WebElement permanentAddress;


	@FindBy(id="saveFullFormId")
	WebElement btnSubmit; 

	@FindBy(xpath="//div[@class='alert alert-success']/child::strong[contains(text(),'SUBMITTED')]")
	WebElement successmessage; 



	public void selectBloodGroup( String bloodgroup) {

		selectDropdownOption(bloodGroup, bloodgroup);

	}

	public void selectContractorType(String contractortype) {

		selectDropdownOption(contractorType, contractortype);

	}

	public void setMobileNumber(String mob) {

		mobileNumber.clear();
		mobileNumber.sendKeys(mob);

	}

	public void selectMaritalStatus(String marital) {

		selectDropdownOption(maritalStatus, marital);

	}

	public void selectCategory(String Category) throws InterruptedException {

		selectDropdownOption(category, Category);

		Thread.sleep(1000);


	}

	public void selectDivision(String Division) throws InterruptedException {

		selectDropdownOption(division, Division);

		Thread.sleep(1500);
	}

	public void selectLocation(String Location) throws InterruptedException {

		selectDropdownOption(location, Location);

		Thread.sleep(1500);

	}

	public void selectCostCenter(String CostCenter) throws InterruptedException {

		selectDropdownOption(costCenter, CostCenter);

		Thread.sleep(1500);

	}
	public void selectDepartment(String Department) throws InterruptedException {

		selectDropdownOption(department, Department);

		Thread.sleep(1500);

	}

	public void selectContractor(String Contractor) throws InterruptedException {

		selectDropdownOption(contractor, Contractor);

		Thread.sleep(1500);

	}

	public void selectDesignation(String Designation) throws InterruptedException {

		selectDropdownOption(designation, Designation);

		Thread.sleep(1500);

	}

	public void selectReportingManager(String ReportingManager) throws InterruptedException {

		selectDropdownOption(reportingManager, ReportingManager);

		Thread.sleep(1500);

	}

	public void selectStore(String Store) throws InterruptedException {

		selectDropdownOption(store, Store);

		Thread.sleep(1000);
	}

	public void selectWorkSkil(String Workskill) {

		selectDropdownOption(workskill, Workskill);

	}

	public void setQualification(String Qualification) {

		qualification.clear();
		qualification.sendKeys(Qualification);

	}
	public void setEmployeeNoofYearsExperience(String yearsofexp) {

		employeeYearsExperience.clear();
		employeeYearsExperience.sendKeys(yearsofexp);

	}

	public void setEmergencyContactNumber(String EmergencyContactNumber) {

		emergencyContactNumber.clear();
		emergencyContactNumber.sendKeys(EmergencyContactNumber);

	}
	public void setCommunity(String Community ) {

		community.clear();
		community.sendKeys(Community);

	}
	public void selectPhysicallyChallenged(String PhysicallyChallenged) {

		selectDropdownOption(physicallyChallenged, PhysicallyChallenged);

	}
	public void setReligion(String Religion ) {

		religion.clear();
		religion.sendKeys(Religion);

	}

	public void setUANNumber(String UAN ) {

		UANNumber.clear();
		UANNumber.sendKeys(UAN);

	}

	public void setFixedBasic(String fixedbasic ) {

		fixedBasic.clear();
		fixedBasic.sendKeys(fixedbasic);

	}

	public void setFixedDA(String fixedda ) {

		fixedDa.clear();
		fixedDa.sendKeys(fixedda);

	}
	public void setFixedHra(String fixedHRA ) {

		fixedHra.clear();
		fixedHra.sendKeys(fixedHRA);

	}

	public void setFixedConveyance(String fixedconveyance ) {

		fixedConveyance.clear();
		fixedConveyance.sendKeys(fixedconveyance);

	}

	public void setFixedSupplimentaryAllowance(String fixedsupplimentary ) {

		fixedSupplementaryAllowances.clear();
		fixedSupplementaryAllowances.sendKeys(fixedsupplimentary);

	}

	public void setFixedMedicalAllowance(String fixedmedical ) {

		fixedMedicalAllowance.clear();
		fixedMedicalAllowance.sendKeys(fixedmedical);

	}
	public void setFixedSpecialAllowance(String fixedSpecial ) {

		fixedSpecialAllowance.clear();
		fixedSpecialAllowance.sendKeys(fixedSpecial);

	}

	public void setFixedWashingAllowance(String fixedWashing ) {

		fixedWashingAllowance.clear();
		fixedWashingAllowance.sendKeys(fixedWashing);

	}
	public void setFixedAttendanceAllowance(String fixedattendance ) {

		fixedAttendanceAllowance.clear();
		fixedAttendanceAllowance.sendKeys(fixedattendance);

	}
	public void setFixedCCAllowance(String fixedCC ) {

		fixedCCAllowance.clear();
		fixedCCAllowance.sendKeys(fixedCC);

	}

	public void setFixedOtherAllowance(String fixedother ) {

		fixedOtherAllowance.clear();
		fixedOtherAllowance.sendKeys(fixedother);

	}

	public void setPermanentAddress(String PermanentAddress ) {

		permanentAddress.clear();
		permanentAddress.sendKeys(PermanentAddress);

	}

	public void clickSubmit() {

		javaScriptExecutorClick(btnSubmit);

	}

	private void setBasicdetails(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store) throws InterruptedException {

		selectBloodGroup(bloodgroup);

		selectContractorType(contractortype);

		selectCategory(Category);

		selectDivision(Division);

		selectLocation(Location);

		selectCostCenter(CostCenter);

		selectDepartment(Department);
		
		selectContractor(Contractor);
		
		selectDesignation(Designation);
		
		selectReportingManager(ReportingManager);

		selectStore(Store);

	}

	private void setProfessionalDetails(String Workskill,String Qualification,String yearsofexp) {

		selectWorkSkil(Workskill);

		setQualification(Qualification);

		setEmployeeNoofYearsExperience(yearsofexp);
	}

	private void setPersonalDetails(String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion) {

		setEmergencyContactNumber(EmergencyContactNumber);

		setCommunity(Community);

		selectPhysicallyChallenged(PhysicallyChallenged);

		setReligion(Religion);

	}

	private void setInductionDetails(String UAN) {

		setUANNumber(UAN);
	}

	private void setPayrollDetails(String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother  ) {

		setFixedBasic(fixedbasic);

		setFixedDA(fixedda);

		setFixedHra(fixedHRA);

		setFixedConveyance(fixedconveyance);

		setFixedSupplimentaryAllowance(fixedsupplimentary);

		setFixedMedicalAllowance(fixedmedical);

		setFixedSpecialAllowance(fixedSpecial);

		setFixedWashingAllowance(fixedWashing);

		setFixedAttendanceAllowance(fixedattendance);

		setFixedCCAllowance(fixedCC);

		setFixedOtherAllowance(fixedother);
	}

	public void setAddressDetails(String permanentAddres) {

		setPermanentAddress(permanentAddres);

	}

	public String getBTID() {

		String SuccessMessage = successmessage.getText();

		String BTID = SuccessMessage.split("Number")[1].replaceAll("[^0-9A-Za-z]","");

		return BTID;

	}

	public void setEmployeeDetails(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		setBasicdetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation, ReportingManager, Store);
		setProfessionalDetails(Workskill, Qualification, yearsofexp);
		setPersonalDetails(EmergencyContactNumber, Community, PhysicallyChallenged, Religion);
		setInductionDetails(UAN);
		setPayrollDetails(fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing, fixedattendance, fixedCC, fixedother);
		setAddressDetails(permanentAddres);
		clickSubmit();
		
		
	}









}
