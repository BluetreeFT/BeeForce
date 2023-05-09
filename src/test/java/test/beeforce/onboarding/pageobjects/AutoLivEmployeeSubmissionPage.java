package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class AutoLivEmployeeSubmissionPage  extends BaseClass{

	public AutoLivEmployeeSubmissionPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="bloodGroup") //bloodgroup
	WebElement bloodGroup;

	@FindBy(id="eMail") //Candidate email 
	WebElement candidateEmail ;

	// Employment Details

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Division')]/following-sibling::select") //Division 
	WebElement division;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Contractor EMP ID')]/following-sibling::div/child::div/input") //Contractor EMP ID 
	WebElement contractorEMPID;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Skills')]/following-sibling::select") //Skils 
	WebElement skills;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Designation')]/following-sibling::select") //Designation 
	WebElement designation;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Department')]/following-sibling::select") //Department 
	WebElement department;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Subdepartment')]/following-sibling::select") //Subdepartment 
	WebElement subDepartment;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Category')]/following-sibling::select") //Category 
	WebElement category;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Employee Qualification')]/following-sibling::select") //Employee Qualification 
	WebElement employeeQualification;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Nationality')]/following-sibling::select") //Nationality 
	WebElement nationality;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'PF NO')]/following-sibling::div/child::div/input") //PF NO
	WebElement pfNo;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'ESI NO')]/following-sibling::div/input") //ESI NO
	WebElement esiNo;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'ESIC Local')]/following-sibling::div/input") // ESIC Local 
	WebElement esicLocal;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'ESIC Dispensary')]/following-sibling::div/input") // ESIC Dispensary 
	WebElement esicDispensary;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'UAN NO')]/following-sibling::div/input") // UAN NO
	WebElement uanNo;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Physically Challenged')]/following-sibling::div/child::div/input[@value='Yes']") // Physically Challenged Yes
	WebElement physicallyChallengedYes;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Physically Challenged')]/following-sibling::div/child::div/input[@value='No']") // Physically Challenged No
	WebElement physicallyChallengedNo;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Gross')]/following-sibling::div/input") // Gross
	WebElement gross;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Product')]/following-sibling::div/select") // Product
	WebElement product;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Employee No of Experience')]/following-sibling::div/input") // Employee No of Experience 
	WebElement employeeNoofExperience;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Unit')]/following-sibling::div/select") // Unit
	WebElement unit;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Team')]/following-sibling::div/select") // Team
	WebElement team;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Line')]/following-sibling::div/select") // Line
	WebElement line;

	@FindBy(xpath="//legend[contains(text(),'Employment Details')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Contractor Employee Type')]/following-sibling::div/select") // Contractor Employee Type
	WebElement contractorEmployeeType;

	//Additional Data

	@FindBy(xpath="//legend[contains(text(),'Additional Data')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Region')]/following-sibling::select") // Region
	WebElement region;

	@FindBy(xpath="//legend[contains(text(),'Additional Data')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Entity')]/following-sibling::select") //Entity
	WebElement entity;

	@FindBy(xpath="//legend[contains(text(),'Additional Data')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Shift Profile')]/following-sibling::div/select") // Shift Profile
	WebElement shiftProfile;

	@FindBy(xpath="//legend[contains(text(),'Additional Data')]/following-sibling::div/child::div/child::div/child::div/child::div[contains(text(),'Insurance Number')]/following-sibling::div/input") // Insurance Number
	WebElement insuranceNumber;

	// Contact Information

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Address')]/following-sibling::div/child::div/input") // Permanent Address 
	WebElement permanentAddress;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Village')]/following-sibling::div/child::div/input") // Employee Permanent Village 
	WebElement permanentVillage;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent Taluk')]/following-sibling::div/child::div/input") // Employee Permanent Taluk 
	WebElement permanentTaluk;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Permanent District')]/following-sibling::div/child::div/input") // Employee Permanent District 
	WebElement permanentDistrict;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Permanent State')]/following-sibling::div/child::div/input") // Employee Permanent State 
	WebElement permanentState;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/child::div/child::div[contains(text(),'Permanent Country')]/following-sibling::div/child::div/input") // Employee Permanent Country 
	WebElement permanentCountry;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Temporary Address')]/following-sibling::div/child::div/input") // Temporary Address
	WebElement temporaryAddress;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div[contains(text(),'Temporary Village')]/following-sibling::div/child::div/input") // Employee Temporary Village 
	WebElement temporaryVillage;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Temporary Taluk')]//following-sibling::div/input") // Employee Temporary Taluk 
	WebElement temporaryTaluk;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Temporary District')]//following-sibling::div/input") // Employee Temporary District 
	WebElement temporaryDistrict;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Temporary State')]//following-sibling::div/input") // Employee Temporary State 
	WebElement temporaryState;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Pickup Point')]/following-sibling::div/select") // Pickup Point
	WebElement pickupPoint;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Transportation Route')]/following-sibling::div/select") // Transportation Route
	WebElement transportationRoute;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Emergency Contact Name')]//following-sibling::div/input") // Emergency Contact Name
	WebElement emergencyContactName;

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]/following-sibling::div/child::div/div/child::div/child::div[contains(text(),'Emergency Contact No')]//following-sibling::div/input") // Emergency Contact No
	WebElement emergencyContactNo;

	@FindBy(id="saveFullFormId")
	WebElement btnsubmit;

	private void selectBloodGroup(String BloodGroup ) {

		selectDropdownOption(bloodGroup, BloodGroup);

	}

	private void setCandidateEmail(String CandidateEmail) {

		scrollToElement(candidateEmail);

		candidateEmail.sendKeys(CandidateEmail);
	}

	private void selectDivision(String Division) {

		selectDropdownOption(division, Division);

	}
	private void setContractorEMPID(String EmpId ) {

		contractorEMPID.sendKeys(EmpId);

	}

	private void selectSkills(String Skill) {

		selectDropdownOption(skills, Skill);


	}

	private void selectDesignation(String Designation) {

		selectDropdownOption(designation, Designation);


	}

	private void selectDepartment(String Department) {

		selectDropdownOption(department, Department);


	}

	private void selectSubdepartment(String Subdepartment) {

		selectDropdownOption(subDepartment, Subdepartment);


	}

	private void selectCategory(String Category) {

		selectDropdownOption(category, Category);


	}

	private void selectEmployeQualification(String EmployeQualification) {

		selectDropdownOption(employeeQualification, EmployeQualification);

	}

	private void selectNationality(String Nationality) {

		selectDropdownOption(nationality, Nationality);

	}

	private void setPFNO(String PF) {

		pfNo.sendKeys(PF);

	} 

	private void setESINO(String ESINO) {

		esiNo.sendKeys(ESINO);

	} 
	private void setESICLocal(String ESICLocal) {

		esicLocal.sendKeys(ESICLocal);

	} 

	private void setESICDispensary(String ESICDispensary) {

		esicDispensary.sendKeys(ESICDispensary);

	} 

	private void setUANNO(String UANNO) {

		uanNo.sendKeys(UANNO);

	} 

	private void setPhysicallyChallengedYes() {

		physicallyChallengedYes.click();

	} 

	private void setPhysicallyChallengedNo() {

		physicallyChallengedNo.click();

	} 

	private void setGross(String Gross) {

		gross.sendKeys(Gross);

	} 


	private void selectProduct(String Product) {

		selectDropdownOption(product, Product);

	}

	private void selectUnit(String Unit) {

		selectDropdownOption(unit, Unit);

	}

	private void setEmployeeNoofExperience (String EmployeeNoofExperience ) {

		employeeNoofExperience.sendKeys(EmployeeNoofExperience);

	} 

	private void selectTeam(String Team) {

		selectDropdownOption(team, Team);

	}

	private void selectLine(String Line) {

		selectDropdownOption(line, Line);

	}

	private void selectContractorEmployeeType(String ContractorEmployeeType) {

		selectDropdownOption(contractorEmployeeType, ContractorEmployeeType);

	}	

	private void setInsuranceNumber (String InsuranceNumber ) {

		insuranceNumber.sendKeys(InsuranceNumber);

	} 

	private void selectRegion(String Region) {

		selectDropdownOption(region, Region);
	}

	private void selectEntity(String Entity) {

		selectDropdownOption(entity, Entity);

	}	

	private void selectShiftProfile(String ShiftProfile) {

		selectDropdownOption(shiftProfile, ShiftProfile);

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

		permanentCountry.sendKeys(Country);

	}

	private void setTemporaryAddress(String PermanentAddress) {

		temporaryAddress.clear();
		temporaryAddress.sendKeys(PermanentAddress);

	}

	private void setTemporaryVillage(String PermanentVillage) {

		temporaryVillage.clear();
		temporaryVillage.sendKeys(PermanentVillage);

	}

	private void setTemporaryTaluk(String PermanentTaluk) {

		temporaryTaluk.clear();
		temporaryTaluk.sendKeys(PermanentTaluk);

	}
	private void setTemporaryDistrict(String PermanentDistrict) {

		temporaryDistrict.clear();
		temporaryDistrict.sendKeys(PermanentDistrict);

	}
	private void setTemporaryState(String PermanentState) {

		temporaryState.clear();
		temporaryState.sendKeys(PermanentState);

	}


	private void selectTransportationRoute(String TransportationRoute) {

		selectDropdownOption(transportationRoute, TransportationRoute);

	}	

	private void selectPickupPoint(String PickupPoint) throws InterruptedException {
		
		Thread.sleep(1000);

		selectDropdownOption(pickupPoint, PickupPoint);

	}	

	private void setEmergencyContactName (String EmergencyContactName ) {

		emergencyContactName.clear();
		emergencyContactName.sendKeys(EmergencyContactName);

	}

	private void setEmergencyContactNo (String EmergencyContactNo ) {

		emergencyContactNo.clear();
		emergencyContactNo.sendKeys(EmergencyContactNo);

	}

	private void clickSubmitButton() {

		javaScriptExecutorClick(btnsubmit);

	}


	private void setBasicDetails(String BloodGroup,String CandidateEmail) {

		selectBloodGroup(BloodGroup);
		setCandidateEmail(CandidateEmail);

	}

	private void setEmploymentDetails(String Division,String EmpId,String Skill,String Designation,String Department,String Subdepartment,String Category,String EmployeQualification,String Nationality,String PF
			,String ESINO,String ESICLocal,String ESICDispensary,String UANNO,String Gross,String Product,String Unit,String EmployeeNoofExperience,String Team,String Line,String ContractorEmployeeType) throws InterruptedException {

		selectDivision(Division);
		setContractorEMPID(EmpId);
		selectSkills(Skill);
		selectDesignation(Designation);
		selectDepartment(Department);
		Thread.sleep(1000);
		selectSubdepartment(Subdepartment);
		selectCategory(Category);
		selectEmployeQualification(EmployeQualification);
		selectNationality(Nationality);
		setPFNO(PF);
		setESINO(ESINO);
		setESICLocal(ESICLocal);
		setESICDispensary(ESICDispensary);
		setUANNO(UANNO);
		setPhysicallyChallengedYes();
		setGross(Gross);
		selectProduct(Product);
		selectUnit(Unit);
		setEmployeeNoofExperience(EmployeeNoofExperience);
		selectTeam(Team);
		selectLine(Line);
		selectContractorEmployeeType(ContractorEmployeeType);

	}

	private void setAdditionalData(String Region,String Entity,String InsuranceNumber,String ShiftProfile ) {

		selectRegion(Region);
		selectEntity(Entity);
		setInsuranceNumber(InsuranceNumber);
		selectShiftProfile(ShiftProfile);

	}

	private void setContactInformation(String PermanentAddress,String PermanentVillage,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String TemporaryAddress,String TemporaryVillage
			,String TemporaryTaluk,String TemporaryDistrict,String TemporaryState,String TransportationRoute,String PickupPoint,String EmergencyContactName,String EmergencyContactNo) throws InterruptedException {

		setPermanentAddress(PermanentAddress);
		setPermanentVillage(PermanentVillage);
		setPermanentTaluk(PermanentTaluk);
		setPermanentDistrict(PermanentDistrict);
		setPermanentState(PermanentState);
		setPermanentCountry(Country);
		setTemporaryAddress(TemporaryAddress);
		setTemporaryVillage(TemporaryVillage);
		setTemporaryTaluk(TemporaryTaluk);
		setTemporaryDistrict(TemporaryDistrict);
		setTemporaryState(TemporaryState);
		selectTransportationRoute(TransportationRoute);
		selectPickupPoint(PickupPoint);
		setEmergencyContactName(EmergencyContactName);
		setEmergencyContactNo(EmergencyContactNo);

	}

	public void setEmployeeDetails(String BloodGroup,String CandidateEmail,String Division,String EmpId,String Skill,String Designation,String Department,String Subdepartment,String Category,String EmployeQualification,String Nationality,String PF
			,String ESINO,String ESICLocal,String ESICDispensary,String UANNO,String Gross,String Product,String Unit,String EmployeeNoofExperience,String Team,String Line,String ContractorEmployeeType,String Region,String Entity,String InsuranceNumber,String ShiftProfile
			,String PermanentAddress,String PermanentVillage,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String TemporaryAddress,String TemporaryVillage
			,String TemporaryTaluk,String TemporaryDistrict,String TemporaryState,String TransportationRoute,String PickupPoint,String EmergencyContactName,String EmergencyContactNo) throws InterruptedException {

		setBasicDetails(BloodGroup, CandidateEmail);
		setEmploymentDetails(Division, EmpId, Skill, Designation, Department, Subdepartment, Category, EmployeQualification, Nationality, PF, ESINO, ESICLocal, ESICDispensary, UANNO, Gross, Product, Unit, EmployeeNoofExperience, Team, Line, ContractorEmployeeType);
		setAdditionalData(Region,Entity, InsuranceNumber, ShiftProfile);
		setContactInformation(PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, PermanentState, Country, TemporaryAddress, TemporaryVillage, TemporaryTaluk, TemporaryDistrict, TemporaryState, TransportationRoute, PickupPoint, EmergencyContactName, EmergencyContactNo);
		clickSubmitButton();

	}




}
