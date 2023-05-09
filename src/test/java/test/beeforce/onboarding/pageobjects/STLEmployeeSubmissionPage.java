package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class STLEmployeeSubmissionPage extends BaseClass {

	public STLEmployeeSubmissionPage() {

		PageFactory.initElements(driver, this);

	}


	//Basic Details
	//
	//	@FindBy(id="bloodGroup") //bloodgroup
	//	WebElement bloodGroup;
	//
	//	@FindBy(id="contractorType") //contractorType
	//	WebElement contractorType;
	//
	//	@FindBy(id="mobilNo")          //mobileNumber
	//	WebElement mobileNumber;
	//
	//	@FindBy(id="maritalStatus") // marital status
	//	WebElement maritalStatus;

	// Basic Details-org hierarchy

	//	@FindBy(id="level1")   // Business Unit  
	//	WebElement businessUnit ;
	//
	//	@FindBy(id="level2") // Organization Unit
	//	WebElement organizationUnit;
	//
	//	@FindBy(id="level3") // Location  
	//	WebElement location;
	//
	//	@FindBy(id="level4") //Cost Centre 
	//	WebElement costCentre ;
	//
	//	@FindBy(id="level5") //Project
	//	WebElement project;
	//
	//	@FindBy(id="level6") //Department  
	//	WebElement department;

	//Vaccination Details

	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Vaccination For')]/following-sibling::select") // Store 
	WebElement vaccinationFor;

	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Vaccination Status')]/following-sibling::select") // Store 
	WebElement vaccinationStatus;

	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Vaccination Date')]/following-sibling::div/div/input") // Store 
	WebElement vaccinationDate;

	@FindBy(xpath="//legend[contains(text(),'Vaccination Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Vaccination Comments')]/following-sibling::div/child::input") // Store 
	WebElement vaccinationComments;

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

	@FindBy(xpath="//div[@class='alert alert-success']/child::strong[contains(text(),'SUBMITTED')]")
	WebElement successmessage;

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

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'HRBP Name')]/following-sibling::div/child::div/input") // Store 
	WebElement hrbpName;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'HRBP Email ID')]/following-sibling::div/input") // Store 
	WebElement hrbpEmail;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Date of Joining')]/following-sibling::div/child::div/input") // Store 
	WebElement dateOfJoining;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Contract From Date')]/following-sibling::div/child::div/input") // Store 
	WebElement contractStartDate;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Contract To Date')]/following-sibling::div/child::div/input") // Store 
	WebElement contractToDate;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Business Email Id')]/following-sibling::div/input") // Store 
	WebElement businessemail;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Country')]/following-sibling::div/select") // Store 
	WebElement country;

	@FindBy(xpath="//legend[contains(text(),'Professional Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Nationality')]/following-sibling::div/select") // Store 
	WebElement nationality;


	//Personal Details

	//Bankdetails

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Bank Name')]/following-sibling::div/child::div/input") // Store 
	WebElement bankName;

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div[contains(text(),'Bank Account No')]/following-sibling::div/child::div/input") // Store 
	WebElement bankAccountNo;

	@FindBy(xpath="//legend[contains(text(),'Bank Details')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'IFSC Code')]/following-sibling::div/input") // Store 
	WebElement iFSCCode;

	//Compensation Benefits

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div[contains(text(),'Monthly or Daily Gross')]/following-sibling::div/child::div/input") // Store 
	WebElement monthlyorDailyGross;

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div[contains(text(),'Frequency')]/following-sibling::select") // Store 
	WebElement frequency;

	@FindBy(xpath="//legend[contains(text(),'Compensation Benefits')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Currency')]/following-sibling:: div/select") // Store 
	WebElement currency;


	@FindBy(id="saveFullFormId")
	WebElement btnSubmit;

	private void selectVaccinationFor(String vacc){

		selectDropdownOption(vaccinationFor, vacc);

	}

	private void SelectVaccinationStatus(String vaccStatus) {

		selectDropdownOption(vaccinationStatus, vaccStatus);

	}

	private void setVaccinationDate(String vaccDate) {

		vaccinationDate.sendKeys(vaccDate);
	}

	private void setVaccinationComments(String vaccComm) {

		vaccinationComments.sendKeys(vaccComm);
	}

	private void selectAssociateQualification(String Qualification) {

		selectDropdownOption(qualification, Qualification);

	}

	private void SetPanNumber(String PanNumber) {

		panNumber.clear();
		panNumber.sendKeys(PanNumber);

	}

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

	private void setHRBPName(String HRBPName) {

		hrbpName.clear();
		hrbpName.sendKeys(HRBPName);
	}


	private void setHRBPEmailID(String HRBPEmail) {

		hrbpEmail.clear();
		hrbpEmail.sendKeys(HRBPEmail);

	}

	private void setDateOfJoining(String DOJ) {

		dateOfJoining.sendKeys(DOJ,Keys.ENTER);

	}

	private void setContractFromDate(String ContractStartDate) {

		contractStartDate.sendKeys(ContractStartDate,Keys.ENTER);

	}

	private void setContractToDate(String ContractToDate) {

		contractToDate.sendKeys(ContractToDate,Keys.ENTER);
	}

	private void setBusinessEmailId(String BusinessMail) {
		
		javaScriptExecutorSendKeys(BusinessMail, businessemail);


	}

	private void selectCountry(String Cou) {

		selectDropdownOption(country, Cou);

	}

	private void selectNationality(String Nationality) {

		selectDropdownOption(nationality, Nationality);

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

	private void setEmergencyNumberOne(String EmergencyContactNumberone ) {

		emergencyContactNumberone.clear();
		emergencyContactNumberone.sendKeys(EmergencyContactNumberone);

	}

	private void setEmergencyContactRelation(String EmergencyContactRelation ) {

		emergencyContactRelation.clear();
		emergencyContactRelation.sendKeys(EmergencyContactRelation);

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

	public void clickSubmit() {

		javaScriptExecutorClick(btnSubmit);

	}
	public String getBTID() {
 
		String SuccessMessage = successmessage.getText();

		String BTID = SuccessMessage.split("Number")[1].replaceAll("[^0-9]","");

		return BTID;

	}


	private void setVaccinationDetails(String vacc,String vaccStatus,String vaccDate,String vaccComm) {

		selectVaccinationFor(vacc);
		SelectVaccinationStatus(vaccStatus);
		setVaccinationDate(vaccDate);
		setVaccinationComments(vaccComm);

	}

	private void setEmergencyDetails(String EmergencyContactName,String EmergencyContactRelation,String EmergencyContactNumberone  ) {

		setEmergencyEmergencyContactName(EmergencyContactName);
		setEmergencyContactRelation(EmergencyContactRelation);
		setEmergencyNumberOne(EmergencyContactNumberone);

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

	private void setProfessionalDetails(String Qualification,String PanNumber,String AssociateAgencyNumber,String Designation,String ShiftProfile ,
			String HRBPName,String HRBPEmail,String DOJ,String ContractStartDate,String ContractToDate,String BusinessMail,String Cou,String Nationality  ) {

		selectAssociateQualification(Qualification);
		SetPanNumber(PanNumber);
		setAssociateAgencyNumber(AssociateAgencyNumber);
		selectDesignation(Designation);
		selectShiftProfile(ShiftProfile);
		setHRBPName(HRBPName);
		setHRBPEmailID(HRBPEmail);
		setDateOfJoining(DOJ);
		setContractFromDate(ContractStartDate);
		setContractToDate(ContractToDate);
		setBusinessEmailId(BusinessMail);
		selectCountry(Cou);
		selectNationality(Nationality);
		

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





	public void setEmployeeDetails(String vacc,String vaccStatus,String vaccDate,String vaccComm,String EmergencyContactName,String EmergencyContactRelation,String EmergencyContactNumberone,String PermanentAddress ,
			String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode,String Qualification,String PanNumber,String AssociateAgencyNumber,String Designation,String ShiftProfile ,
			String HRBPName,String HRBPEmail,String DOJ,String ContractStartDate,String ContractToDate,String BusinessMail,String Cou,String Nationality,String BankName,String BankAccountNo,String IFSCCode,
			String MonthlyorDailyGross,String Frequency, String Currency) {

		setVaccinationDetails(vacc, vaccStatus, vaccDate, vaccComm);
		setEmergencyDetails(EmergencyContactName, EmergencyContactRelation, EmergencyContactNumberone);
		setPermanentAddressDetails(PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, PermanentState, Country, PermanentPincode);
		setProfessionalDetails(Qualification, PanNumber, AssociateAgencyNumber, Designation, ShiftProfile, HRBPName, HRBPEmail, DOJ, ContractStartDate, ContractToDate, BusinessMail, Cou, Nationality);
		setBankDetails(BankName, BankAccountNo, IFSCCode);
		setCompensationBenefits(MonthlyorDailyGross, Frequency, Currency);
		
		clickSubmit();
		
	}





}
