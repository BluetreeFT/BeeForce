package test.attest360.testCases;

import org.testng.annotations.Test;

import test.attest360.pageObjects.FillDataPage;
import test.attest360.pageObjects.HomePage;
import test.attest360.pageObjects.LoginPage;
import test.attest360.pageObjects.QaHomePage;
import test.attest360.testData.DataProviders;

public class DataEntry extends BaseClass {


	@Test(priority =-1)
	public void critirionDataEntryLogin() {
		LoginPage lp=new LoginPage();
		LanchUrl(Url);
		lp.setUserName(dataEntry);
		lp.setPassword(Password);
		lp.clickLogin();
	}
	@Test(dataProvider ="customerName", dataProviderClass= DataProviders.class,priority=0)
	public void select_customer(String customerName){
		HomePage hp=new HomePage();
		hp.clickCustomerSetting();
		hp.clickCustomerDetails();
		hp.setCustomer(customerName);
	}
	@Test(dataProvider ="basicDetails", dataProviderClass= DataProviders.class,priority=1)
	public void enterBasicDetails(String firstname,String lastname,String Dob,String FatherName,String mobileNumber,
			String Email,String State,String City,String location,String jobRole,String Recruiter,String employeecode){
		FillDataPage fdp= new FillDataPage();
		fdp.enterBasicDetails(firstname, lastname, Dob, FatherName, mobileNumber, Email, 
				State, City, location, jobRole, Recruiter, employeecode);	
	}
	@Test(dataProvider= "Authorization",dataProviderClass= DataProviders.class,priority=2)
	public void fillDataAuthorization(String path) throws InterruptedException {
		FillDataPage fdp= new FillDataPage();
		fdp.setAuthorization(path);
	}
	
	@Test(dataProvider= "FilldataBasic",dataProviderClass= DataProviders.class,priority=3)
	public void fillDataSetBasic(String gender,String path) throws InterruptedException {
		FillDataPage fdp=new FillDataPage();
		fdp.setBasicDetails(gender, path);
	}
	@Test(dataProvider= "FilldataEducation",dataProviderClass= DataProviders.class,priority=4)
	public void fillDataSetEducation(String clgName,String univName, String eduCity,
			String eduQualifi,String passYear,String rollNum,String marksheetpath,String certificatepath) throws InterruptedException {
		FillDataPage fdp=new FillDataPage();
		Thread.sleep(2000);
		fdp.setEducationDetails(clgName, univName, eduCity, eduQualifi, passYear, rollNum, marksheetpath, certificatepath);
	}
	@Test(priority=5)
	public void fillDataSetEmploymet() {
		FillDataPage fdp=new FillDataPage();
		fdp.setEmployementDetails();
	}
	@Test(dataProvider= "FillDataAddress",dataProviderClass= DataProviders.class,priority=6)
	public void fillDataSetAddress(String addres,String city,String state,String Stay,String country,String postcode ,
			String Addtype,String path) throws InterruptedException {
		FillDataPage fdp=new FillDataPage();
		fdp.setAddressDetails(addres, city, state, Stay, country, postcode, Addtype, path);
	}

	@Test(dataProvider= "FillCriminalData",dataProviderClass= DataProviders.class,priority=7)
	public void fillDataSetCriminalVerification(String Addtype,String name,String cadd,String district,String city,String state,
			String country,String pincode,String path) throws InterruptedException {
		FillDataPage fdp= new FillDataPage();
		fdp.setCriminalVerificationDetails(Addtype, name, cadd, district, city, state, country, pincode, path);
	}
	@Test(dataProvider= "FillDataIdentification",dataProviderClass= DataProviders.class,priority=8)
	public void fillDataIdentificationVerification(String type,String name,String id,String path) throws InterruptedException {
		FillDataPage fdp= new FillDataPage();
		fdp.setIdentificationDetails(type, name, id, path);
	}
	
	@Test(priority=9)
	public void logoutAsDataEntry() {
		LoginPage lp=new LoginPage();
		lp.clickLogout();
	}
	@Test(priority=10)
	public void critirionQaLogin() {
		LoginPage lp=new LoginPage();
		lp.setUserName(QA);
		lp.setPassword(Password);
		lp.clickLogin();
	}
	@Test(dataProvider ="customerName", dataProviderClass= DataProviders.class,priority=11)
	public void runAutoDeligate(String customername) throws InterruptedException {
		QaHomePage qp=new QaHomePage();
		qp.runAutoDeligate(customername);
	}




}
