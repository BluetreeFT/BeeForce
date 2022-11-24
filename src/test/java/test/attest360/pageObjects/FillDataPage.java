package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class FillDataPage extends BaseClass {
	public FillDataPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="basicDetails0")
	WebElement educationlink;
	@FindBy(id="verificationTypeName1")
	WebElement employement;
	@FindBy(id="verificationTypeName2")
	WebElement addresslink;
	@FindBy(id="verificationTypeName3")
	WebElement criminallink;
	@FindBy(id="verificationTypeName4")
	WebElement identifylink;
	@FindBy(id="authorizationId")
	WebElement authlink;



	//******basicDetails***********	

	@FindBy(id="gender")
	WebElement se;
	@FindBy(id="uploadPhotoId")
	WebElement photo;
	@FindBy(id="nextIdBasic")
	WebElement btnnext;




	//********Education************
	@FindBy(id="registers0fieldValue1")
	WebElement collageName;
	@FindBy(id="registers0fieldValue2")
	WebElement university;
	@FindBy(id="registers0fieldValue3")
	WebElement educity;
	@FindBy(id="registers0fieldValue11")
	WebElement postCode;
	@FindBy (id="registers0fieldValue5")
	WebElement qualification;
	@FindBy (id="registers0fieldValue9")
	WebElement pasYear;
	@FindBy(id="registers0fieldValue6")
	WebElement rollNumber;
	@FindBy(id="tempFileregisters[0].fieldValue7")
	WebElement markSheetUpload;
	@FindBy(id="tempFileregisters[0].fieldValue8")
	WebElement certificateUpload;
	@FindBy(id="saveDraftIdregisters0")
	WebElement eduSave;
	//***********Employment************************
	@FindBy(id="registers1fieldValue1")
	WebElement fresher;
	@FindBy(id="saveDraftIdregisters1")
	WebElement empSave;
	//*********AddressIdentification*****************
	@FindBy(xpath="//input[@id='registers2fieldValue2']")
	WebElement addrees;
	@FindBy(id="registers2fieldValue4")
	WebElement addcity;
	@FindBy(id="registers2fieldValue5")
	WebElement addstate;
	@FindBy(id="registers2fieldValue6")
	WebElement stay;
	@FindBy(id="registers2fieldValue7")
	WebElement addcountry;
	@FindBy(id="registers2fieldValue8")
	WebElement addpostalcode;
	@FindBy(id="registers2fieldValue9")
	WebElement addtype;
	@FindBy(id="tempFileregisters[2].fieldValue10")
	WebElement addupload;
	@FindBy(id="saveDraftIdregisters2")
	WebElement addsave;
	//*******Criminal*************
	@FindBy(id="registers3fieldValue2")
	WebElement criaddtype;
	@FindBy(id="registers3fieldValue3")
	WebElement criname;
	@FindBy(id="registers3fieldValue4")
	WebElement criadd;
	@FindBy(id="registers3fieldValue6")
	WebElement cridistric;
	@FindBy(id="registers3fieldValue7")
	WebElement cricity;
	@FindBy(id="registers3fieldValue8")
	WebElement cristate;
	@FindBy(id="registers3fieldValue9")
	WebElement cricountry;
	@FindBy(id="registers3fieldValue10")
	WebElement cripincode;
	@FindBy(id="tempFileregisters[3].fieldValue13")
	WebElement criupload;
	@FindBy(id="saveDraftIdregisters3")
	WebElement crisave;
	//******Identification Check****************
	@FindBy(id="registers4fieldValue1")
	WebElement idctype;
	@FindBy(id="registers4fieldValue2")
	WebElement idcname;
	@FindBy(id="registers4fieldValue5")
	WebElement idcnumber;
	@FindBy(id="tempFileregisters[4].fieldValue7")
	WebElement idcupload;
	@FindBy(id="saveDraftIdregisters4")
	WebElement idc1save;
	@FindBy(id="registers5fieldValue1")
	WebElement idcnum;
	@FindBy(id="tempFileregisters[5].fieldValue2")
	WebElement idcaupload;
	@FindBy(id="saveDraftIdregisters5")
	WebElement idcsave;
	//*************Authorization***************
	@FindBy(id="authenticationForm")
	WebElement authupload;
	@FindBy(id="digital")
	WebElement btnupload;
	@FindBy(id="saveFullFormId")
	WebElement fullsave;

	//**********finalSubmit*************
	@FindBy(id="finalSubmitIdregisters0")
	WebElement edufinal;
	@FindBy(id="finalSubmitIdregisters1")
	WebElement empfinal;
	@FindBy(id="finalSubmitIdregisters2")
	WebElement addfinal;
	@FindBy(id="finalSubmitIdregisters3")
	WebElement crifinal;
	@FindBy(id="finalSubmitIdregisters4")
	WebElement idcfinal;
	@FindBy(id="finalSubmitIdregisters5")
	WebElement aadfinal;
	
	
	
	public void enterBasicDetails(String firstname,String lastname,String Dob,String FatherName,String mobileNumber,
			String Email,String State,String City,String location,String jobRole,String Recruiter,String employeecode){
		HomePage hp=new HomePage();
		CaseRegistrationPage crp=new CaseRegistrationPage();
		hp.clickCreateNew();
		crp.setFirstName(firstname);
		crp.setLastName(lastname);
		crp.setDOB(Dob);
		crp.setFatherName(FatherName);
		crp.setMobileNumber(mobileNumber);
		crp.setEmail(Email);
		crp.setState(State);
		crp.setCity(City);
		crp.SelectJoiningLocation(location);
		crp.SelectJobRole(jobRole);
		crp.SelectRecruiters(Recruiter);
		crp.setEmployeeCode(employeecode);
		String name = crp.getFirstname();
		String emp = crp.getEmployeeCode();
//		crp.clickCancel();
		crp.clickSave(); 
		String crtNumber = crp.getCrtNumber(name, emp);
		ExcelUtils ex=new ExcelUtils();
		ex.setCellData("CrtNumber", "Generated Crt Number", 2, crtNumber);
		hp.cclickFillData();
		hp.selectCrtNumber(crtNumber);
	}
	
	public void setBasicDetails(String gender,String path) throws InterruptedException {
		uploadFile(photo, path);
		Thread.sleep(1000);
		selectDropdownOption(se, gender);
	}
	public void setEducationDetails(String clgName,String univName, String eduCity,String eduQualifi,String passYear,String rollNum,String marksheetpath,String certificatepath ) throws InterruptedException {
		educationlink.click();
		collageName.clear();
		collageName.sendKeys(clgName);
		university.clear();
		university.sendKeys(univName);
		educity.clear();
		educity.sendKeys(eduCity);
		qualification.clear();
		qualification.sendKeys(eduQualifi);
		pasYear.clear();
		pasYear.sendKeys(passYear);
		rollNumber.clear();
		rollNumber.sendKeys(rollNum);
		uploadFile(markSheetUpload, marksheetpath);
		uploadFile(certificateUpload, certificatepath);
		Thread.sleep(5000);
//		eduSave.click();	

		try {
			edufinal.click();
			acceptAlert();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setEmployementDetails() {
		javaScriptExecutorClick(employement);
		javaScriptExecutorClick(fresher);
		scrollToElement(empSave);
//		empSave.click();
		try {
			empfinal.click();
			acceptAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void setAddressDetails(String addres,String city,String state,String Stay,String country,String postcode ,
			String Addtype,String path) throws InterruptedException {
		scrollToElement(addresslink);
		javaScriptExecutorClick(addresslink);
		addrees.clear();
		addrees.sendKeys(addres);
		addcity.clear();
		addcity.sendKeys(city);
		addstate.clear();
		addstate.sendKeys(state);
		stay.clear();
		stay.sendKeys(Stay);
		addcountry.clear();
		addcountry.sendKeys(country);
		addpostalcode.clear();
		addpostalcode.sendKeys(postcode);
		selectDropdownOption(addtype, Addtype);
		uploadFile(addupload, path);
		Thread.sleep(2000);
//	addsave.click();
		try {
			addfinal.click();
			acceptAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public void setCriminalVerificationDetails(String Addtype,String name,String cadd,String district,String city,String state,
			String country,String pincode,String path) throws InterruptedException {
		scrollToElement(criminallink);
		javaScriptExecutorClick(criminallink);
		selectDropdownOption(criaddtype, Addtype);
		criname.clear();
		criname.sendKeys(name);
		criadd.clear();
		criadd.sendKeys(cadd);
		cridistric.clear();
		cridistric.sendKeys(district);
		cricity.clear();
		cricity.sendKeys(city);
		cristate.sendKeys(state);
		cricountry.clear();
		cricountry.sendKeys(country);
		cripincode.clear();
		cripincode.sendKeys(pincode);
		uploadFile(criupload, path);
		Thread.sleep(2000);
//	   crisave.click();
		try {
			crifinal.click();
			acceptAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setIdentificationDetails(String type,String name,String id,String path) throws InterruptedException {
		identifylink.click();
		selectDropdownOption(idctype, type);
		idcname.clear();
		idcname.sendKeys(name);
		idcnumber.clear();
		idcnumber.sendKeys(id);
		uploadFile(idcaupload, path);
		Thread.sleep(2000);
//	    idc1save.click();
		try {
			idcfinal.click();
			acceptAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		idcnum.clear();
		idcnum.sendKeys(id);
		uploadFile(idcaupload, path);
		Thread.sleep(2000);
//	    idcsave.click();
		try {
			aadfinal.click();
			acceptAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		authlink.click();
		try {
			javaScriptExecutorClick(fullsave);
			acceptAlert();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void setAuthorization(String path) throws InterruptedException {
		authlink.click();
		scrollToElement(authupload);
		authupload.sendKeys(path);
		javaScriptExecutorClick(btnupload);
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}

