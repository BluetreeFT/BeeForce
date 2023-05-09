package test.beeforce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import com.github.javafaker.Faker;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.STLEmployeeViewAndEditpage;
import test.beeforce.cems.pageObjects.TitanEmployeeViewAndEditPage;
import test.beeforce.eattendance.pageobjects.EattendanceHomePage;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.OnboardingHomePage;
import test.beeforce.onboarding.pageobjects.STLBudgectingAndSourcing;
import test.beeforce.onboarding.pageobjects.STLEmployeeSubmissionPage;
import test.beeforce.onboarding.pageobjects.STLModulesPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class EmployeeCreationThroughBudgetingAndSourcingSTL extends BaseClass {


	@Test(priority=1)
	public void LoginAsBudgetCreater() throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

		STLModulesPage mp=new STLModulesPage();

		LaunchUrl(Url);

		lp.loginToApplication(STLAdminUserName, STLAdminPassword);

		Thread.sleep(1000);

		mp.selectModule("onboarding");

	}

	@Test(dataProvider ="StlBudget", dataProviderClass= DataProviders.class,priority=2)
	public void createAndApproveBudget(String BU,String OU,String Location,String Month,String CostCenter,String AssociateType,String Name,
			String Comments,String HeadCount,String BudgetAmount) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		STLBudgectingAndSourcing sbs=new STLBudgectingAndSourcing();

		ohp.clickBudgetingDropdown();

		ohp.clickBudgets();

		sbs.CreateBudget(BU, OU, Location, Month, CostCenter, AssociateType, Name, Comments, HeadCount, BudgetAmount);

	}

	@Test(priority=3)
	public void ApproveBudget() {

		STLBudgectingAndSourcing sbs=new STLBudgectingAndSourcing();
		ExcelUtils ex=new ExcelUtils();

		OnboardingHomePage ohp=new OnboardingHomePage();

		ohp.clickBudgetingDropdown();

		ohp.clickBudgets();

		WebElement budgetId = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/child::a"));

		String budgetID = budgetId.getText();

		System.out.println(budgetID);

		budgetId.click();

		ex.setCellData("BTID", "BUDGETID", 2, budgetID);

		//javaScriptExecutorClick(element);

		sbs.clickApproveBudgetButton();

		sbs.clickOKButton();

	}
	@Test(dataProvider ="StlSourcing", dataProviderClass= DataProviders.class,priority=4)
	private void createSourcingrequest(String BU,String OU,String Month,String Location,String CostCenter,String AssociateType,String skill,
			String Vendor,String Name,String HeadCount) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		STLBudgectingAndSourcing sbs=new STLBudgectingAndSourcing();

		ohp.clickSourcingDropdown();

		ohp.clickSourcingRequest();

		sbs.createSourcingRequest(BU, OU, Month, Location, CostCenter, AssociateType, skill, Vendor, CurrentDate(), Name, HeadCount);


	}

	@Test(priority=5)
	private void logoutAsAdminAndLoginAsContractor() throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

		//		LanchUrl(Url);

		lp.clicklogoutOnboarding();

//		lp.clicklogoutCEMS();

		lp.loginToApplication(STLContractorUserName, STLContractorPassword);

	}

	@Test(priority=6,dataProvider ="STLBSCanidateUpload", dataProviderClass= DataProviders.class)
	public void uploadcandidatedetails(String BU,String OU, String Month,String NTH) throws InterruptedException {

		STLModulesPage mp=new STLModulesPage();

		OnboardingHomePage ohp=new OnboardingHomePage();

		STLBudgectingAndSourcing sbs= new STLBudgectingAndSourcing();

		ExcelUtils ex=new ExcelUtils();

		mp.selectModule("onboarding");

		ohp.clickSourcingDropdown();

		ohp.clickSourcingRequest();

		sbs.searchRequest(BU, OU, Month);

		WebElement lastpage = driver.findElement(By.xpath("//a[text()='»»']"));

		javaScriptExecutorClick(lastpage);

		int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();

		for (int r=rows; r>1; r--) {

			WebElement souecingId = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[2]/a"));

			javaScriptExecutorClick(souecingId);

			break;
		}

		String path1 = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-STL.xls";

		ExcelUtils2 ex1 =new ExcelUtils2(path1);

		Faker faker = new Faker();

		String firstName = faker.name().firstName();

		String lastName = faker.name().lastName();

		long Id = generateRandomNumber(12);
		long mob=generateRandomNumber(10);

		String s=String.valueOf(Id);

		String s1=String.valueOf(mob);

		ex1.setCellData("Employees", "Aadhar Number*", 2, s);
		ex1.setCellData("Employees", "First Name*", 2, firstName);
		ex1.setCellData("Employees", "Last Name*", 2, lastName);
		ex1.setCellData("Employees", "Mobile Number*", 2, s1);

		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-STL.xls";

		sbs.uploadCandiadteDetails(path, NTH);


	}

	@Test(dataProvider ="STLBasicDetails", dataProviderClass= DataProviders.class,priority=7)
	public void fillEmployeeDetailsSterlite(String vacc,String vaccStatus,String vaccDate,String vaccComm,String EmergencyContactName,String EmergencyContactRelation,String EmergencyContactNumberone,String PermanentAddress ,
			String PermanentVillage ,String PermanentTaluk,String PermanentDistrict,String PermanentState,String Country,String PermanentPincode,String Qualification,String PanNumber,String AssociateAgencyNumber,String Designation,String ShiftProfile ,
			String HRBPName,String HRBPEmail,String DOJ,String ContractStartDate,String ContractToDate,String BusinessMail,String Cou,String Nationality,String BankName,String BankAccountNo,String IFSCCode,
			String MonthlyorDailyGross,String Frequency, String Currency) throws InterruptedException {

		OnboardingHomePage ohp=new OnboardingHomePage();

		STLEmployeeSubmissionPage oes=new STLEmployeeSubmissionPage();

		//		STLModulesPage mp=new STLModulesPage();
		//		
		//		mp.selectModule("onboarding");

		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-STL.xls";

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
		
		Faker faker = new Faker();
		
		String emailAddress = faker.internet().emailAddress();
	
		ex1.setCellData("BasicDetailsSTL", "Business Email Id", 2, emailAddress);
		
		System.out.println(emailAddress);
		
		Thread.sleep(2000);
		
		oes.setEmployeeDetails(vacc, vaccStatus, vaccDate, vaccComm, EmergencyContactName, EmergencyContactRelation, 
				EmergencyContactNumberone, PermanentAddress, PermanentVillage, PermanentTaluk, PermanentDistrict, PermanentState, 
				Country, PermanentPincode, Qualification, PanNumber, AssociateAgencyNumber, Designation, ShiftProfile, HRBPName, 
				HRBPEmail, DOJ, ContractStartDate, ContractToDate, BusinessMail, Cou, Nationality, BankName, BankAccountNo, IFSCCode, 
				MonthlyorDailyGross, Frequency, Currency);

		Thread.sleep(1500);

		String btid = oes.getBTID();

		ex1.setCellData("BTID", "BTID", 2, btid);

	}
	@Test(priority=8)
	public void logoutAsContractorAndLoginAsAdmin() throws InterruptedException, IOException, TesseractException {

		LoginPage lp=new LoginPage();

		//		LaunchUrl(Url);

		lp.clicklogoutOnboarding();

//		lp.clicklogoutCEMS();

		lp.loginToApplication(STLAdminUserName, STLAdminPassword);

	}
	//
	@Test(dataProvider ="STLChrmsDetails", dataProviderClass= DataProviders.class,priority=9)
	public void fillDetailsinCems(String email,String PrincipalContactName,String AssociateType,String Position,String  EPosition,String sso) throws InterruptedException {

		ExcelUtils ex=new ExcelUtils();

		STLModulesPage mp=new STLModulesPage();

		TitanEmployeeViewAndEditPage evp=new TitanEmployeeViewAndEditPage();

		STLEmployeeViewAndEditpage sep=new STLEmployeeViewAndEditpage();

		String empNumber = ex.getCellData("BTID", "BTID", 2);

		mp.selectModule("chrms");

		Thread.sleep(1000);

		sep.OpenAssociateViewAndEditPage();

		evp.setEmployeeNumber(empNumber);

		evp.clickSearchButton(); 

		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+empNumber+"']")).click();

		sep.setEmployeeDetails(email, PrincipalContactName, AssociateType, Position, EPosition, sso);

	}

	@Test(priority=9)
	@Parameters("status")
	public void onboardedEmployeeStatus(String status) throws InterruptedException {

		TitanEmployeeViewAndEditPage evp=new TitanEmployeeViewAndEditPage();

		STLEmployeeViewAndEditpage  sep=new STLEmployeeViewAndEditpage();

		sep.clickAssociateDetailsTab();

		if(status.equalsIgnoreCase("Approved")) {

			evp.SelectEmployeeStatus(status);

			evp.clickSubmit();

			acceptAlert();

			Thread.sleep(5000);

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

		lp.loginToApplication(STLAdminUserName, STLAdminPassword);

		STLModulesPage mp=new STLModulesPage();

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
