package test.beeforce.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.OnboardingEmployeeOfflineCreationPage;
import test.beeforce.onboarding.pageobjects.OnboardingHomePage;
import test.beeforce.onboarding.pageobjects.TitanEmployeeSubmissionPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class OnboardingFieldValidation extends BaseClass{



	@Test(priority=1)
	public void loginAsContractor() throws InterruptedException, IOException, TesseractException {

		LoginPage lp= new LoginPage();

		LaunchUrl(Url);

		lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

	}

	@Test(priority=2)

	@Parameters("Module")

	public void selectModule(String module) {

		ModulesPage mp=new ModulesPage();

		//		mp.clickNavigationMenu();

		mp.selectModule(module);

	}

	@Test(priority=3)
	public void offlineEmployeeupload() throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		OnboardingEmployeeOfflineCreationPage eoc=new OnboardingEmployeeOfflineCreationPage();

		Thread.sleep(500);

		ohp.clickOnboardingDropdown();

		Thread.sleep(500);

		ohp.clickEmployeeDetailsDropdown();

		Thread.sleep(500);

		ohp.clickEmployeeofflineCreation();

		Thread.sleep(500);

		eoc.uploadBasicDetails("C:\\Users\\Durga Prasad\\eclipse-workspace\\Beeforce\\src\\test\\resources\\TestData\\offlineEmployeeUpload.xls");

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


	@Test(dependsOnMethods= {"offlineEmployeeupload"},priority=4)
	public void searchEmployee() throws InterruptedException {
		TitanEmployeeSubmissionPage oes=new TitanEmployeeSubmissionPage();
		OnboardingHomePage ohp=new OnboardingHomePage();

		ExcelUtils2 ex =new ExcelUtils2("C:\\Users\\Durga Prasad\\eclipse-workspace\\Beeforce\\src\\test\\resources\\TestData\\offlineEmployeeUpload.xls");

		ohp.clickDashboard();

		ohp.clickTotalEmployees();

		String aadhar = ex.getCellData("Sheet1", "ID NUMBER*", 2);

		ohp.searchEmployee(aadhar);

		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]")).click();
		
		long Id = generateRandomNumber(12);

		String s=String.valueOf(Id);

		ex.setCellData("Sheet1", "ID NUMBER*", 2, s);


	}
	@Test(dataProvider ="FieldValidation", dataProviderClass= DataProviders.class,priority=5 ,dependsOnMethods= {"searchEmployee"})
	public void fillEmployeeDetailsCorporate(String bloodgroup,String contractortype,String Category,String Division,String Location,String CostCenter,
			String Department ,String Contractor,String Designation ,String ReportingManager, String Store,String Workskill,String Qualification,String yearsofexp,
			String EmergencyContactNumber,String Community,String PhysicallyChallenged,String Religion,String UAN,
			String fixedbasic,String fixedda,String fixedHRA,String fixedconveyance,String fixedsupplimentary,String fixedmedical,String fixedSpecial,
			String fixedWashing,String fixedattendance,String fixedCC, String fixedother,String permanentAddres) throws InterruptedException {

		TitanEmployeeSubmissionPage oes=new TitanEmployeeSubmissionPage();

		String alertmessage= null;

		ExcelUtils2 ex =new ExcelUtils2("C:\\Users\\Durga Prasad\\eclipse-workspace\\Beeforce\\src\\test\\resources\\TestData\\offlineEmployeeUpload.xls");

		oes.setEmployeeDetails(bloodgroup, contractortype, Category, Division, Location, CostCenter, Department, Contractor, Designation, ReportingManager, Store, Workskill, Qualification, yearsofexp, EmergencyContactNumber, Community, PhysicallyChallenged, Religion, UAN, fixedbasic, fixedda, fixedHRA, fixedconveyance, fixedsupplimentary, fixedmedical, fixedSpecial, fixedWashing, fixedattendance, fixedCC, fixedother, permanentAddres);

		if(bloodgroup==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				
				refresh();
				
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:bloodGroup"));

		}
		if(contractortype==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				
				refresh();
				
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields"));

		}
		if(Category==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				
				refresh();
				
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(Division==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
				
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(Location==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(CostCenter==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		
		if(Department==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}

		if(Contractor==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(Designation==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(ReportingManager==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(Store==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:Please fill all the organization structure details."));

		}
		if(Workskill==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Professional Details-Work skill"));

		}
		if(Qualification==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Professional Details-Qualification"));

		}
		if(yearsofexp==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Professional Details-Employee No of Years Experience"));

		}
		
		if(EmergencyContactNumber==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Emergency Details-Emergency Contact Number"));

		}
		if(Community==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Personal Details-Community"));

		}
		if(PhysicallyChallenged==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Personal Details-Physically Challenged"));

		}
		if(Religion==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Personal Details-Religion"));

		}
		if(UAN==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Compliance Details-UAN Number"));

		}
		if(fixedbasic==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_BASIC"));

		}
		if(fixedda==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_DA"));

		}
		if(fixedda==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_DA"));

		}
		if(fixedHRA==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_HRA"));

		}
		if(fixedconveyance==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_CONVEYANCE"));

		}
		if(fixedsupplimentary==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_SUPPLEMENTARY_ALLOWANCE"));

		}
		if(fixedmedical==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_MEDICAL_ALLOWANCE"));

		}
		if(fixedSpecial==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_SPECIAL_ALLOWANCE"));

		}
		if(fixedWashing==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_WASHING_ALLOWANCE"));

		}
		if(fixedattendance==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_ATTENDANCE_INCENTIVE"));

		}
		if(fixedCC==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_CC_ALLOWANCE"));

		}
		if(fixedother==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Payroll Details-FIXED_OTHER_ALLOWANCE"));

		}
		if(permanentAddres==""){

			if(isAlertPresent()) {

				alertmessage = getTextFromAlert();
				refresh();
			}else {

				System.out.println("Alert Message Not Disaplayed");
			}
			assertTrue(alertmessage.contains("Missing Fields:C55 Permanent Address Details-Permanent Address"));

		}
		
		  
		
	}
	
	




}

