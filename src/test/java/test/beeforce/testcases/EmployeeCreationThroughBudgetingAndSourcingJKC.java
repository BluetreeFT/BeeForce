package test.beeforce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import net.sourceforge.tess4j.TesseractException;
import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.JKCEmployeeViewAndEditPage;
import test.beeforce.cems.pageObjects.TitanEmployeeViewAndEditPage;
import test.beeforce.eattendance.pageobjects.EattendanceHomePage;
import test.beeforce.onboarding.pageobjects.JKCBudgetingAndSourcing;
import test.beeforce.onboarding.pageobjects.JKCEmployeeSubmissionPage;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.OnboardingHomePage;
import test.beeforce.onboarding.pageobjects.TitanEmployeeSubmissionPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class EmployeeCreationThroughBudgetingAndSourcingJKC extends BaseClass {


		@Test(priority=1)
		public void LoginAsBudgetCreater() throws IOException, InterruptedException, TesseractException {
	
			LoginPage lp=new LoginPage();
	
			ModulesPage mp=new ModulesPage();
	
			LaunchUrl(Url);
	
			lp.loginToApplication(JKCBudgetCreaterUserName, JkcAdminPassword);
	
			Thread.sleep(1500);
	
			mp.selectModule("onboarding");
	
		}
	
		@Test(dataProvider ="JKCBudget", dataProviderClass= DataProviders.class,priority=2)
		public void createAndApproveBudget(String Company,String Division,String SubDivision,String Month,String BusinessUnit,String Function,String Department,
				String Name,String Comments,String HeadCount,String BudgetAmount) throws InterruptedException {
	
			OnboardingHomePage ohp=new OnboardingHomePage();
	
			JKCBudgetingAndSourcing sbs=new JKCBudgetingAndSourcing();
	
			ohp.clickBudgetingDropdown();
	
			ohp.clickBudgets();
	
			sbs.CreateBudget(Company, Division, SubDivision, Month, BusinessUnit, Function, Department, Name, Comments, HeadCount, BudgetAmount);
	
		}
	
	
		@Test(priority=3)
		public void logoutAsBudgetcreaterAndLoginAsBudgetReviewer() throws IOException, InterruptedException, TesseractException {
	
			LoginPage lp=new LoginPage();
	
			ModulesPage mp=new ModulesPage();
	
			lp.clicklogoutOnboarding();
	
			lp.loginToApplication(JKCBudgetReviewerUserName , JkcAdminPassword);
	
			mp.selectModule("onboarding");
	
		}
	
		@Test(priority=4)
		public void ReviewAndApproveBudget() throws IOException, InterruptedException, TesseractException {
	
			JKCBudgetingAndSourcing sbs=new JKCBudgetingAndSourcing();
	
			LoginPage lp=new LoginPage();
	
			ModulesPage mp=new ModulesPage();
	
			OnboardingHomePage ohp=new OnboardingHomePage();
	
			ohp.clickBudgetingDropdown();
	
			ohp.clickBudgets();
	
			driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/child::a")).click();
	
			sbs.clickApproveBudgetButton();
	
			sbs.clickOKButton();
	
			lp.clicklogoutOnboarding();
	
			lp.loginToApplication(JkcAdminUserName, JkcAdminPassword);
	
			mp.selectModule("onboarding");
	
			ohp.clickBudgetingDropdown();
	
			ohp.clickBudgets();
	
			driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/child::a")).click();
	
			sbs.clickApproveBudgetButton();
	
			sbs.clickOKButton();
	
	
	
		}
		@Test(dataProvider ="JKCSourcing", dataProviderClass= DataProviders.class,priority=5)
		private void createSourcingrequest(String Company,String Division,String Month,String Section,String Location,String Vendor,String AssociateType,String skill,
				String Category ,String Name,String HeadCount) throws InterruptedException {
	
			OnboardingHomePage ohp=new OnboardingHomePage();
	
			JKCBudgetingAndSourcing sbs=new JKCBudgetingAndSourcing();
	
			ohp.clickSourcingDropdown();
	
			ohp.clickSourcingRequest();
	
			sbs.createSourcingRequest(Company, Division, Month, Section, Location, Vendor, AssociateType, skill,
					Category, Name, CurrentDate(), HeadCount);
	
		}

		@Test(priority=6)
		private void logoutAsAdminAndLoginAsContractor() throws IOException, InterruptedException, TesseractException {
	
			LoginPage lp=new LoginPage();
	
//					LaunchUrl(Url);
	
			lp.clicklogoutOnboarding();
	
			//		lp.clicklogoutCEMS();
	
			lp.loginToApplication(JkcContractorUserName, JkcAdminPassword);
			
	
		}
	
		@Test(priority=7,dataProvider ="JKCBSCanidateUpload", dataProviderClass= DataProviders.class)
		public void uploadcandidatedetails(String Company,String Division, String Month,String NTH) throws InterruptedException {
	
			ModulesPage mp=new ModulesPage();
	
			OnboardingHomePage ohp=new OnboardingHomePage();
	
			JKCBudgetingAndSourcing sbs= new JKCBudgetingAndSourcing();
	
			ExcelUtils ex=new ExcelUtils();
	
			mp.selectModule("onboarding");
	
			ohp.clickSourcingDropdown();
	
			ohp.clickSourcingRequest();
	
			sbs.searchRequest(Company, Division, Month);
	
			WebElement lastpage = driver.findElement(By.xpath("//a[text()='»»']"));
	
			javaScriptExecutorClick(lastpage);
	
			int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();
	
			for (int r=rows; r>1; r--) {
	
				WebElement souecingId = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[2]/a"));
	
				javaScriptExecutorClick(souecingId);
	
				break;
			}
	
			String path1 = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-JKC.xls";
	
			ExcelUtils2 ex1 =new ExcelUtils2(path1);
	
			Faker faker = new Faker();
	
			String firstName = faker.name().firstName();
	
			String lastName = faker.name().lastName();
	
			long Id = generateRandomNumber(12);
			long mob=generateRandomNumber(10);
	
			String s=String.valueOf(Id);
	
			String s1=String.valueOf(mob);
	
			ex1.setCellData("Employees", "Aadhar Number*", 2, s);
			ex1.setCellData("Employees", "Employee Name*", 2, firstName);
			ex1.setCellData("Employees", "Mobile Number*", 2, s1);
	
			String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-JKC.xls";
	
			sbs.uploadCandiadteDetails(path, NTH);
	
		}
	
		@Test(dataProvider ="jkc", dataProviderClass= DataProviders.class,priority=8)
		public void fillEmployeeDetailsJKC(String Company,String Division,String SubDivision,String BusinessUnit,String Function,
				String Department,String Section,String Location,String Contractor,String ReportingManager,String AssociateAgencyNumber,String Qualification ,String  Designation,String ShiftProfile ,String Category ,String EmployeeBiometricNumber
				,String BankName,String BankAccountNo,String IFSCCode,String MonthlyorDailyGross,String Frequency, String Currency,String EmergencyContactName,String EmergencyContactNumberone,
				String PermanentAddress ,String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode) throws InterruptedException {
	
			OnboardingHomePage ohp=new OnboardingHomePage();
			
			TitanEmployeeSubmissionPage oe=new TitanEmployeeSubmissionPage();
	
			JKCEmployeeSubmissionPage oes=new JKCEmployeeSubmissionPage();
	
			//		STLModulesPage mp=new STLModulesPage();
			//		
			//		mp.selectModule("onboarding");
	
			String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-JKC.xls";
	
			ExcelUtils2 ex =new ExcelUtils2(path);
	
			ohp.clickOnboardingDropdown();
	
			ohp.clickDashboard();
	
			ohp.clickTotalEmployees();
	
			String aadhar = ex.getCellData("Employees", "Aadhar Number*", 2);
	
			ohp.searchEmployee(aadhar);
	
			List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
			if (ele.size()!=0) {
	
				WebElement aadharNUM = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]"));
				aadharNUM.click();
	
			} else {
	
				Thread.sleep(10000);
	
				ohp.searchEmployee(aadhar);
	
				List<WebElement> ele1 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
				if (ele1.size()!=0) {
	
					WebElement aadharNUM = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]"));
					aadharNUM.click();
	
				} else {
	
					Thread.sleep(20000);
	
					ohp.searchEmployee(aadhar);
	
					List<WebElement> ele2 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
					if (ele2.size()!=0) {
	
						WebElement aadharNUM = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]"));
						aadharNUM.click();
	
					} else {
	
						Thread.sleep(30000);
	
						ohp.searchEmployee(aadhar);
	
						List<WebElement> ele3 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
						if (ele3.size()!=0) {
	
							WebElement aadharNUM = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]"));
							aadharNUM.click();
	
						} else {
							Thread.sleep(40000);
	
							ohp.searchEmployee(aadhar);
	
							List<WebElement> ele4 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
							if (ele4.size()!=0) {
	
								WebElement aadharNUM = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+aadhar+"')]"));
								aadharNUM.click();
							} 
						}
					}
				}
			}
	
			String path1= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\EmployeeDetails.xlsx";
	
			ExcelUtils ex1=new ExcelUtils(path1);
	
			oes.setEmployeeDetails(Company, Division, SubDivision, BusinessUnit, Function, Department, Section, Location, Contractor, 
					ReportingManager, AssociateAgencyNumber, Qualification, Designation, ShiftProfile, Category, EmployeeBiometricNumber, 
					BankName, BankAccountNo, IFSCCode, MonthlyorDailyGross, Frequency, Currency, EmergencyContactName, 
					EmergencyContactNumberone, PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, 
					PermanentState, Country, PermanentPincode);
	
			Thread.sleep(1500);
	
			String btid = oe.getBTID();
	
			ex1.setCellData("BTID", "BTID", 2, btid);
	
		}
		
	@Test(priority=8)
	public void logoutAsContractorAndLoginAsAdmin() throws InterruptedException, IOException, TesseractException {

		LoginPage lp=new LoginPage();

		ModulesPage mp=new ModulesPage();

//		LaunchUrl(Url);


				lp.clicklogoutOnboarding();

		//		lp.clicklogoutCEMS();

		lp.loginToApplication(JkcAdminUserName, JkcAdminPassword);
		
		mp.selectModule("CHRMS");

	}
	//

	@Test(priority=8)
	@Parameters({"status","org"})
	public void onboardedEmployeeStatus(String status,String org) throws InterruptedException {

		ExcelUtils ex=new ExcelUtils();

		TitanEmployeeViewAndEditPage evp=new TitanEmployeeViewAndEditPage();

		ChrmsHomePage ch=new ChrmsHomePage();

		String empNumber = ex.getCellData("BTID", "BTID", 2);

		ch.openEmployeeViewAndEditPage();

		evp.setEmployeeNumber(empNumber);

		evp.clickSearchButton(); 

		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+empNumber+"']")).click();

		Thread.sleep(3500);

		if(status.equalsIgnoreCase("Approved")) {

			evp.SelectEmployeeStatus(status);

			if (org.equalsIgnoreCase("jkc")) {

				JKCEmployeeViewAndEditPage jp=new JKCEmployeeViewAndEditPage();

				jp.setEmployeeBiometricRefNumber(empNumber);

			} 

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

	@Test(priority=11)
	@Parameters("status")
	public void verifyDetailsInEattendance(String status) throws InterruptedException, IOException, TesseractException {

		LoginPage lp=new LoginPage();

		ExcelUtils ex=new ExcelUtils();

		lp.clickProfilelogoutCEMSSTL();

		lp.loginToApplication(JkcAdminUserName, JkcAdminPassword);

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
}
