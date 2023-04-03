package test.beeforce.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.TitanEmployeeViewAndEditPage;
import test.beeforce.eattendance.pageobjects.EattendanceHomePage;
import test.beeforce.onboarding.pageobjects.JKCEmployeeSubmissionPage;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.OnboardingEmployeeOfflineCreationPage;
import test.beeforce.onboarding.pageobjects.OnboardingHomePage;
import test.beeforce.onboarding.pageobjects.STLModulesPage;
import test.beeforce.onboarding.pageobjects.TitanOnboardingemployeeSubmissionPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class OfflineEmployeeCreation extends BaseClass{


	@Test(priority=1)
	@Parameters("org")
	public void loginAsContractor(String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp= new LoginPage();

		LanchUrl(Url);

		if(org.equalsIgnoreCase("Titan")){

			lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcContractorUserName, JkcPassword);

		}else if(org.equalsIgnoreCase("Stl")){

			lp.loginToApplication("", "");

		}

	}

	@Test(priority=2)
	@Parameters({"Module","org"})
	public void selectModule(String module,String org) {

		
		if(org.equalsIgnoreCase("stl")) {
			
		STLModulesPage mp=new STLModulesPage();
		mp.selectModule(module);
		
		}else {
			
			ModulesPage mp=new ModulesPage();
			mp.selectModule(module);
		}

	}

	@Test(priority=3)
	@Parameters("org")
	public void offlineEmployeeupload(String org) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		OnboardingEmployeeOfflineCreationPage eoc=new OnboardingEmployeeOfflineCreationPage();
//
//				Thread.sleep(500);
//		
//				ohp.clickOnboardingDropdown();
//		
//				Thread.sleep(500);
//		
//				ohp.clickEmployeeDetailsDropdown();
//		
//				Thread.sleep(500);
//		
//				ohp.clickEmployeeofflineCreation();
		
			driver.navigate().to("https://saasuat-onboarding.labour.tech:8443/onboarding/offlineEmployeeCreation/upload");

//driver.navigate().to("https://onboarding.labour.tech/onboarding/offlineEmployeeCreation/upload");

		Thread.sleep(500); 
		if (org.equalsIgnoreCase("titan")) {
			
			String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-Titan.xls";
			
			ExcelUtils2 ex =new ExcelUtils2(path);
			
			long Id = generateRandomNumber(12);

			String s=String.valueOf(Id);

			ex.setCellData("Sheet1", "ID NUMBER*", 2, s);

			eoc.uploadBasicDetails(path);

		}else if(org.equalsIgnoreCase("jkc")) {
			
			String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-JKC.xls";
			
			ExcelUtils2 ex =new ExcelUtils2(path);

			long Id = generateRandomNumber(12);

			String s=String.valueOf(Id);

			ex.setCellData("Sheet1", "ID NUMBER*", 2, s);

			eoc.uploadBasicDetails(path);
		}
		
		eoc.clickBasicDetailsUploadButton();

		String successCount = eoc.getUploadCount();

		int count = Integer.valueOf(successCount);

		if (count>=1) {

			System.out.println(count +" Employee Onboarded Successfully");

		}else {

			System.out.println("Error in Employee upadate");

			assertTrue(false, "Success Count : 0");
		}

	}

	@Test(dataProvider ="jkc", dataProviderClass= DataProviders.class,priority=4 ,dependsOnMethods= {"offlineEmployeeupload"})
	public void fillEmployeeDetailsJKC(String Company,String Division,String SubDivision,String BusinessUnit,String Function,
			String Department,String Section,String Location,String Contractor,String ReportingManager,String AssociateAgencyNumber,String Qualification ,String  Designation,String ShiftProfile ,String Category ,String EmployeeBiometricNumber
			,String BankName,String BankAccountNo,String IFSCCode,String MonthlyorDailyGross,String Frequency, String Currency,String EmergencyContactName,String EmergencyContactNumberone,
			String PermanentAddress ,String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();
		TitanOnboardingemployeeSubmissionPage oe=new TitanOnboardingemployeeSubmissionPage();

		JKCEmployeeSubmissionPage oes=new JKCEmployeeSubmissionPage();
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-JKC.xls";

		ExcelUtils2 ex =new ExcelUtils2(path);

		ohp.clickDashboard();

		ohp.clickTotalEmployees();
	
		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);
		
		ohp.searchEmployee(aadhar);

	driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();
		
		oes.setEmployeeDetails(Company, Division, SubDivision, BusinessUnit, Function, Department, Section, Location, Contractor, 
				ReportingManager, AssociateAgencyNumber, Qualification,  Designation ,ShiftProfile, Category, EmployeeBiometricNumber, BankName, 
				BankAccountNo, IFSCCode, MonthlyorDailyGross, Frequency, Currency, EmergencyContactName, EmergencyContactNumberone, 
				PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, PermanentState, Country, PermanentPincode);

		Thread.sleep(1500);

		String btid = oe.getBTID();
		
		String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";

		ExcelUtils ex1=new ExcelUtils(path1);

		ex1.setCellData("BTID", "BTID", 2, btid);

	}
//
	@Test(dataProvider ="Corporate", dataProviderClass= DataProviders.class,priority=4,dependsOnMethods= {"offlineEmployeeupload"} )
	public void fillEmployeeDetailsCorporate(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,
			String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-Titan.xls";

		ExcelUtils2 ex =new ExcelUtils2(path);

		ohp.clickDashboard();

		ohp.clickTotalEmployees();

		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);

		ohp.searchEmployee(aadhar);

		 driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();

		oes.setEmployeeDetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation,
				ReportingManager, Store, Workskill, Qualification, yearsofexp, EmergencyContactNumber, Community, PhysicallyChallenged, 
				Religion, UAN, fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing,
				fixedattendance, fixedCC, fixedother, permanentAddres);
		
		Thread.sleep(1500);

		String btid = oes.getBTID();
		
		String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";

		ExcelUtils ex1=new ExcelUtils(path1);

		ex1.setCellData("BTID", "BTID", 2, btid);

	}
//
	@Test(dataProvider ="Plant", dataProviderClass= DataProviders.class,priority=4,dependsOnMethods= {"offlineEmployeeupload"})
	public void fillEmployeeDetailsPlant(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,
			String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-Titan.xls";

		ExcelUtils2 ex =new ExcelUtils2(path);

		ohp.clickDashboard();

		ohp.clickTotalEmployees();

		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);

		ohp.searchEmployee(aadhar);

		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();

		oes.setEmployeeDetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation, ReportingManager, Store, Workskill, Qualification, yearsofexp, EmergencyContactNumber, Community, PhysicallyChallenged, Religion, UAN, fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing, fixedattendance, fixedCC, fixedother, permanentAddres);


		Thread.sleep(1500);

		String btid = oes.getBTID();
		
		String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";

		ExcelUtils ex1=new ExcelUtils(path1);

		ex1.setCellData("BTID", "BTID", 2, btid);

	}

	@Test(dataProvider ="Retail", dataProviderClass= DataProviders.class,priority=4,dependsOnMethods= {"offlineEmployeeupload"})
	public void fillEmployeeDetailsRetail(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,
			String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-Titan.xls";

		ExcelUtils2 ex =new ExcelUtils2(path);

		ohp.clickDashboard();

		ohp.clickTotalEmployees();

		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);

		ohp.searchEmployee(aadhar);

		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();

		oes.setEmployeeDetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation, ReportingManager, Store, Workskill, Qualification, yearsofexp, EmergencyContactNumber, Community, PhysicallyChallenged, Religion, UAN, fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing, fixedattendance, fixedCC, fixedother, permanentAddres);

		
		Thread.sleep(1500);

		String btid = oes.getBTID();
		
		String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";

		ExcelUtils ex1=new ExcelUtils(path1);

		ex1.setCellData("BTID", "BTID", 2, btid);

	}
	@Test(dataProvider ="STL", dataProviderClass= DataProviders.class,priority=4,dependsOnMethods= {"offlineEmployeeupload"})
	public void fillEmployeeDetailsSterlite(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,
			String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\offlineEmployeeUpload-Titan.xls";

		ExcelUtils2 ex =new ExcelUtils2(path);

		ohp.clickDashboard();

		ohp.clickTotalEmployees();

		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);

		ohp.searchEmployee(aadhar);

		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();

		oes.setEmployeeDetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation, ReportingManager, Store, Workskill, Qualification, yearsofexp, EmergencyContactNumber, Community, PhysicallyChallenged, Religion, UAN, fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing, fixedattendance, fixedCC, fixedother, permanentAddres);

		
		Thread.sleep(1500);

		String btid = oes.getBTID();
		
		String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";

		ExcelUtils ex1=new ExcelUtils(path1);

		ex1.setCellData("BTID", "BTID", 2, btid);

	}
	@Test(priority=5)
	public void logoutAsContractor() throws InterruptedException {

		LoginPage lp=new LoginPage();

		lp.clicklogoutOnboarding();

		lp.clicklogoutCEMS();

	}


	@Test(priority=6)
	@Parameters("org")
	public void loginAsAdmin(String org) throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

				LanchUrl(Url);
		if(org.equalsIgnoreCase("titan")) {

			lp.loginToApplication(TitanAdminUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcAdminUserName, JkcAdminPassword);

		}
	}

	@Test(priority=7)
	public void openEmployeeViewAndEditPage() {

		ModulesPage mp=new ModulesPage();

		ChrmsHomePage chp=new ChrmsHomePage();

		mp.clickNavigationMenu();

		mp.clickCHRMSModule();

		chp.clickDataManagement();

		chp.clickEmployeeData();

		chp.clickEmployeeViewAndEdit();

	}

	@Test(priority=8)
	@Parameters("status")
	public void onboardedEmployeeStatus(String status) throws InterruptedException {

		ExcelUtils ex=new ExcelUtils();

		TitanEmployeeViewAndEditPage evp=new TitanEmployeeViewAndEditPage();

		String empNumber = ex.getCellData("BTID", "BTID", 2);

		evp.setEmployeeNumber(empNumber);

		evp.clickSearchButton(); 

		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+empNumber+"']")).click();
		Thread.sleep(3500);

		if(status.equalsIgnoreCase("Approved")) {

			evp.SelectEmployeeStatus(status);

			evp.clickSubmit();

			acceptAlert();
			
			Thread.sleep(1000);

		}else if(status.equalsIgnoreCase("Terminated")) {

			evp.SelectEmployeeStatus(status);

			Thread.sleep(1000);

			evp.selectTerminatedReason("Employee Left");

			evp.terminatedDate();
			Thread.sleep(2000);
			evp.clickSubmit();

			acceptAlert();

		}else if(status.equalsIgnoreCase("Rejected")) {

			evp.SelectEmployeeStatus(status);

			Thread.sleep(1000);

			evp.selectRejectedReason("Incorrect Data");

			evp.rejectedDate();

			evp.clickSubmit();

			acceptAlert();

		}else {

			evp.SelectEmployeeStatus("Resigned");

			Thread.sleep(1000);

			evp.selectResignedReason("Employee Left");

			evp.resignedDate();

			evp.clickSubmit();

			acceptAlert();

		}



	}

	@Test(priority=9)
	public void verifyDetailsInCems() {

		TitanEmployeeViewAndEditPage eve=new TitanEmployeeViewAndEditPage();

		ExcelUtils ex=new ExcelUtils();

		String blood = ex.getCellData("BasicDetailsCorporate", "BloodGroup", 2);
		String contractortype = ex.getCellData("BasicDetailsCorporate", "Contractor Employee Type", 2);
		String catogory = ex.getCellData("BasicDetailsCorporate", "Category", 2);
		String div = ex.getCellData("BasicDetailsCorporate", "Division", 2);
		String locat = ex.getCellData("BasicDetailsCorporate", "Location", 2);
		String costcen = ex.getCellData("BasicDetailsCorporate", "CostCenter", 2);
		String contractor = ex.getCellData("BasicDetailsCorporate", "Contractor", 2);
		String Designat = ex.getCellData("BasicDetailsCorporate", "Designation", 2);
		String ReportingManager = ex.getCellData("BasicDetailsCorporate", "ReportingManager", 2);
		String Store = ex.getCellData("BasicDetailsCorporate", "Store", 2);
		String workskill = ex.getCellData("BasicDetailsCorporate", "Workskill", 2);
		String Qualification = ex.getCellData("BasicDetailsCorporate", "Qualification", 2);
		String yearsofexp = ex.getCellData("BasicDetailsCorporate", "yearsofexp", 2);
		String EmergencyContactNumber = ex.getCellData("BasicDetailsCorporate", "EmergencyContactNumber", 2);
		String Community = ex.getCellData("BasicDetailsCorporate", "Community", 2);
		String PhysicallyChallenged = ex.getCellData("BasicDetailsCorporate", "PhysicallyChallenged", 2);
		String Religion = ex.getCellData("BasicDetailsCorporate", "Religion", 2);
		String UAN = ex.getCellData("BasicDetailsCorporate", "UAN", 2);
		String permAddress = ex.getCellData("BasicDetailsCorporate", "permanentAddress", 2);

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(eve.getBloodGroup(),blood );
		softAssert.assertEquals( eve.getContractorType(),contractortype);
		softAssert.assertEquals( eve.getCategory(),catogory);
		softAssert.assertEquals( eve.getDivision(),div);
		softAssert.assertEquals( eve.getLocation(),locat);
		softAssert.assertEquals(eve.getCostCenter(),costcen );
		softAssert.assertEquals(eve.getContractor(),contractor );
		softAssert.assertEquals(eve.getDesignation(),Designat );
		softAssert.assertEquals(eve.getReportingManager(),ReportingManager );
		softAssert.assertEquals(eve.getStore(),Store );
		softAssert.assertEquals( eve.getWorkSkil(),workskill);
		softAssert.assertEquals(eve.getQualification(),Qualification );
		softAssert.assertEquals(eve.getEmployeeNoofYearsExperience(),yearsofexp );
		softAssert.assertEquals( eve.getEmergencyContactNumber(),EmergencyContactNumber);
		softAssert.assertEquals( eve.getCommunity(),Community);
		softAssert.assertEquals(eve.getPhysicallyChallenged(),PhysicallyChallenged );
		softAssert.assertEquals(eve.getReligion(),Religion );
		softAssert.assertEquals( eve.getUANNumber(),UAN);
		softAssert.assertEquals( eve.getPermanentAddress(),permAddress);

		softAssert.assertAll();

	}

	@Test(priority=10)
	@Parameters("status")
	public void verifyEmployeeStatus(String status) throws InterruptedException {

		ChrmsHomePage ch=new ChrmsHomePage();

		TitanEmployeeViewAndEditPage ev=new TitanEmployeeViewAndEditPage();

		Thread.sleep(1000);

		ch.clickDataManagement();

		ch.clickEmployeeData();

		ch.clickEmployeeViewAndEdit();

		ExcelUtils ex=new ExcelUtils();

		String employeeNumber = ex.getCellData("BTID", "BTID", 2);

		ev.setEmployeeNumber(employeeNumber);

		ev.clickSearchButton();

		Thread.sleep(1500);

		WebElement ele = driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+employeeNumber+"']/parent::td/following-sibling::td[5]"));

		assertEquals(ele.getText(), status);
	}
	
	@Test(priority=11)

	@Parameters({"status", "org"})
	public void verifyDetailsInEattendance(String status,String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp=new LoginPage();

		ExcelUtils ex=new ExcelUtils();

		lp.clickProfilelogoutCEMS();

		loginAsAdmin(org);

		ModulesPage mp=new ModulesPage();

		mp.selectModule("eattendance");

		EattendanceHomePage eh=new EattendanceHomePage();

		eh.clickSettingDropdown();

		eh.clickEmployeeDataDropdown();

		eh.clickEmployees();

		String employeeNumber = ex.getCellData("BTID", "BTID", 2);
		Thread.sleep(3000);
		eh.searchEmployee(employeeNumber);

		Thread.sleep(3000);
		List<WebElement> empcount = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));



		if (status.equalsIgnoreCase("Approved")) {

			Thread.sleep(1000);

			String empnum = empcount.get(0).getText();

			assertEquals(empnum,employeeNumber);

		}else{

			String text = driver.findElement(By.xpath("//table/tbody/tr/td")).getText();

			assertEquals(text, "No Record(s) Found!");

		}

	}

	@Test(priority=8)
	@Parameters({"status","org"})
	public void ReOnboardEmployeeStatus(String status,String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp=new LoginPage();

		ModulesPage mp=new ModulesPage();

		OnboardingHomePage ohp=new OnboardingHomePage();

		TitanOnboardingemployeeSubmissionPage oes=new TitanOnboardingemployeeSubmissionPage();

		ExcelUtils ex=new ExcelUtils();

		TitanEmployeeViewAndEditPage evp=new TitanEmployeeViewAndEditPage();

		String empNumber = ex.getCellData("BTID", "BTID", 2);

		evp.setEmployeeNumber(empNumber);

		evp.clickSearchButton();

		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+empNumber+"']")).click();

		evp.SelectEmployeeStatus(status);

		evp.selectRejectedReason("Incorrect Data");

		evp.rejectedDate();

		evp.clickSubmit();

		acceptAlert();

		lp.clicklogoutCEMS();

		lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		mp.selectModule("onboarding");

		ohp.clickTotalEmployees();

		ohp.searchEmployee(empNumber);

		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+empNumber+"')]")).click();

		oes.clickSubmit();

		lp.clicklogoutOnboarding();

		loginAsAdmin(org);

		openEmployeeViewAndEditPage();

		onboardedEmployeeStatus("approve");

	}

}

