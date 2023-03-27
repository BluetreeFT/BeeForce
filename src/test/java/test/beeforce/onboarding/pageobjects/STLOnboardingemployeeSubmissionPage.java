package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class STLOnboardingemployeeSubmissionPage extends BaseClass {

	public STLOnboardingemployeeSubmissionPage() {

		PageFactory.initElements(driver, this);

	}

	//basic details 

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

	@FindBy(id="level1")   // Business Unit  
	WebElement businessUnit ;

	@FindBy(id="level2") // Organization Unit
	WebElement organizationUnit;

	@FindBy(id="level3") // Location  
	WebElement location;

	@FindBy(id="level4") //Cost Centre 
	WebElement costCentre ;

	@FindBy(id="level5") //Project
	WebElement project;

	@FindBy(id="level6") //Department  
	WebElement department;

	//Vaccination Details
	
	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Vaccination For')]/following-sibling::select") // Store 
	WebElement vaccinationFor;
	
	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Vaccination Status')]/following-sibling::select") // Store 
	WebElement vaccinationStatus;
	
	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Vaccination Comments')]/following-sibling::div/child::input") // Store 
	WebElement vaccinationComments;
	
	//Professional Details

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Qualification')]/following-sibling::select") // Store 
	WebElement qualification;
	
	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Pan Number')]/following-sibling::div/child::div/input") // Store 
	WebElement panNumber;
	
	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Associate Agency Number')]/following-sibling::div/child::div/input") // Store 
	WebElement associateAgencyNumber;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Designation')]/following-sibling::select") // Store 
	WebElement designation;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Shift Profile')]/following-sibling::select") // Store 
	WebElement shiftProfile;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Category')]/following-sibling::div/child::select") // Store 
	WebElement category;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Employee Biometric Ref Number')]/following-sibling::div/child::input") // Store 
	WebElement employeeBiometricRefNumber;

	//Personal Details

	//Bankdetails

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Bank Name')]/following-sibling::div/child::div/input") // Store 
	WebElement bankName;

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Bank Account No')]/following-sibling::div/child::div/input") // Store 
	WebElement bankAccountNo;

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'IFSC Code')]/following-sibling::div/child::div/input") // Store 
	WebElement iFSCCode;

	//Compensation Benefits

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div[contains(text(),'Monthly or Daily Gross')]/following-sibling::div/child::div/input") // Store 
	WebElement monthlyorDailyGross;

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div[contains(text(),'Frequency')]/following-sibling::select") // Store 
	WebElement frequency;

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Currency')]/following-sibling:: div/select") // Store 
	WebElement currency;

	//Emergency Details

	@FindBy(xpath="//legend[contains(text(),'Emergency Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Emergency Contact Name')]/following-sibling::div/child::div/input") // Store 
	WebElement emergencyContactName;

	@FindBy(xpath="//legend[contains(text(),'Emergency Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Emergency Contact Relation')]/following-sibling::div/child::div/input") // Store 
	WebElement emergencyContactRelation;
	
	@FindBy(xpath="//legend[contains(text(),'Emergency Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Emergency Contact Number')]/following-sibling::div/child::div/input") // Store 
	WebElement emergencyContactNumberone;

	//Permanent Address Details

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Address')]/following-sibling::div/child::div/input") // Store 
	WebElement permanentAddress;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Village')]/following-sibling::div/child::div/input") // Store 
	WebElement permanentVillage;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Taluk')]/following-sibling::div/child::div/input") // Store 
	WebElement permanentTaluk;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent District')]/following-sibling::div/child::div/input") // Store 
	WebElement permanentDistrict;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Permanent State')]/following-sibling::div/input") // Store 
	WebElement permanentState;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Permanent Country')]/following-sibling::div/child::select") // Store 
	WebElement permanentCountry;

	@FindBy(xpath="//legend[contains(text(),'Permanent Address Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Permanent Pincode')]/following-sibling::div/input") // Store 
	WebElement permanentPincode;


//	private void selectCompany(String Company) {
//
//		selectDropdownOption(company, Company);
//
//	}
//
//	private void selectDivision(String Division) {
//
//		selectDropdownOption(division, Division);
//
//
//	}
//	private void selectSubDivision(String SubDivision) {
//
//		selectDropdownOption(subDivision, SubDivision);
//
//	}
//	private void selectBusinessUnit(String BusinessUnit) {
//
//		selectDropdownOption(businessUnit, BusinessUnit);
//	}	
//
//	private void selectFunction(String Function) {
//
//		selectDropdownOption(function, Function);
//	}	
//
//	private void selectDepartment(String Department) {
//
//
//		selectDropdownOption(department, Department);
//	}
//	private void selectSection(String Section) {
//
//		selectDropdownOption(section, Section);
//	}
//	private void selectLocation(String Location) {
//
//		selectDropdownOption(location, Location);
//
//
//	}
//
//	private void selectContractor(String Contractor) {
//
//		selectDropdownOption(contractor,Contractor);
//	}
//
//	private void selectReportingManager(String ReportingManager) {
//
//		selectDropdownOption(reportingManager, ReportingManager);
//	}

	private void setAssociateAgencyNumber(String AssociateAgencyNumber) {

		associateAgencyNumber.clear();
		associateAgencyNumber.sendKeys(AssociateAgencyNumber);

	}

	private void selectDesignation(String Designation) {

		selectDropdownOption(designation,Designation );

	}



	private void selectShiftProfile(String ShiftProfile) {

		selectDropdownOption(shiftProfile,ShiftProfile);
	}

	private void selectCategory(String Category) {


		selectDropdownOption(category, Category);

	}

	private void setEmployeeBiometricRefNumber(String EmployeeBiometricNumber) {

		employeeBiometricRefNumber.clear();
		employeeBiometricRefNumber.sendKeys(EmployeeBiometricNumber);

	}

	private void setBankName(String BankName) {

		bankName.clear();
		bankName.sendKeys(BankName);

	}

	private void setBankAccountNo(String BankAccountNo) {

		bankAccountNo.clear();
		bankAccountNo.sendKeys(BankAccountNo);
	}

	private void setIFSCCode(String IFSCCode) {

		iFSCCode.clear();
		iFSCCode.sendKeys(IFSCCode);

	}

	private void setMonthlyorDailyGross(String MonthlyorDailyGross) {

		monthlyorDailyGross.clear();
		monthlyorDailyGross.sendKeys(MonthlyorDailyGross);

	}

	private void selectFrequency(String Frequency) {

		selectDropdownOption(frequency, Frequency);

	}

	private void selectCurrency(String Currency) {

		selectDropdownOption(currency, Currency);

	}

	private void setEmergencyEmergencyContactName(String EmergencyContactName) {

		emergencyContactName.clear();
		emergencyContactName.sendKeys(EmergencyContactName);

	}

	private void setEmergencyEmergencyNumberOne(String EmergencyContactNumberone ) {

		emergencyContactNumberone.clear();
		emergencyContactNumberone.sendKeys(EmergencyContactNumberone);

	}

	private void setPermanentAddress(String PermanentAddress) {

		permanentAddress.clear();
		permanentAddress.sendKeys(PermanentAddress);

	}

	private void setPermanentVillage(String PermanentVillage) {

		permanentVillage.clear();
		permanentVillage.sendKeys(PermanentVillage);

	}

	private void setPermanentTaluk(String PermanentTaluk) {

		permanentTaluk.clear();
		permanentTaluk.sendKeys(PermanentTaluk);

	}
	private void setPermanentDistrict(String PermanentDistrict) {

		permanentDistrict.clear();
		permanentDistrict.sendKeys(PermanentDistrict);

	}
	private void setPermanentState(String PermanentState) {

		permanentState.clear();
		permanentState.sendKeys(PermanentState);

	}

	private void setPermanentCountry(String Country) {

		selectDropdownOption(permanentCountry, Country);

	}
	private void setPermanentPincode(String PermanentPincode) {

		permanentPincode.clear();
		permanentPincode.sendKeys(PermanentPincode);

	}


//	private void setBasicDetails(String Company,String Division,String SubDivision,String BusinessUnit,String Function,
//			String Department,String Section,String Location,String Contractor,String ReportingManager) {
//
//		selectCompany(Company);
//		selectDivision(Division);
//		selectSubDivision(SubDivision);
//		selectBusinessUnit(BusinessUnit);
//		selectFunction(Function);
//		selectDepartment(Department);
//		selectSection(Section);
//		selectLocation(Location);
//		selectContractor(Contractor);
//		selectReportingManager(ReportingManager);
//
//	}

	private void setProfessionalDetails(String AssociateAgencyNumber,String Qualification ,String  Designation,String ShiftProfile ,String Category ,String EmployeeBiometricNumber  ) {

		TitanOnboardingemployeeSubmissionPage oes= new TitanOnboardingemployeeSubmissionPage();
		setAssociateAgencyNumber(AssociateAgencyNumber);
		oes.setQualification(Qualification);
		selectDesignation(Designation);
		selectShiftProfile(ShiftProfile);
		selectCategory(Category);
		setEmployeeBiometricRefNumber(EmployeeBiometricNumber);

	}

	private void setBankDetails(String BankName,String BankAccountNo,String IFSCCode ) {

		setBankName(BankName);
		setBankAccountNo(BankAccountNo);
		setIFSCCode(IFSCCode);

	}

	private void setCompensationBenefits(String MonthlyorDailyGross,String Frequency, String Currency  ) {

		setMonthlyorDailyGross(MonthlyorDailyGross);
		selectFrequency(Frequency);
		selectCurrency(Currency);
	}

	private void setEmergencyDetails(String EmergencyContactName,String EmergencyContactNumberone  ) {

		setEmergencyEmergencyContactName(EmergencyContactName);
		setEmergencyEmergencyNumberOne(EmergencyContactNumberone);

	}

	private void setPermanentAddressDetails(String PermanentAddress ,String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode) {

		setPermanentAddress(PermanentAddress);
		setPermanentVillage(PermanentVillage);
		setPermanentTaluk(PermanentTaluk);
		setPermanentDistrict(PermanentDistrict);
		setPermanentState(PermanentState);
		setPermanentCountry(Country);
		setPermanentPincode(PermanentPincode);

	}

	public void setEmployeeDetails(String Company,String Division,String SubDivision,String BusinessUnit,String Function,
			String Department,String Section,String Location,String Contractor,String ReportingManager,String AssociateAgencyNumber,String Qualification ,String  Designation,String ShiftProfile ,String Category ,String EmployeeBiometricNumber
			,String BankName,String BankAccountNo,String IFSCCode,String MonthlyorDailyGross,String Frequency, String Currency,String EmergencyContactName,String EmergencyContactNumberone,
			String PermanentAddress ,String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode) {
		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();
//		setBasicDetails(Company, Division, SubDivision, BusinessUnit, Function, Department, Section, Location, Contractor, ReportingManager);
		setProfessionalDetails(AssociateAgencyNumber, Qualification, Designation, ShiftProfile, Category, EmployeeBiometricNumber);
		setBankDetails(BankName, BankAccountNo, IFSCCode);
		setCompensationBenefits(MonthlyorDailyGross, Frequency, Currency);
		setEmergencyDetails(EmergencyContactName, EmergencyContactNumberone);
		setPermanentAddressDetails(PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, PermanentState, Country, PermanentPincode);
		oes.clickSubmit();

	}





}
