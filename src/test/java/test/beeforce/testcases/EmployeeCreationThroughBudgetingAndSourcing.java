package test.beeforce.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.onboarding.pageobjects.OnboardingHomePage;
import test.beeforce.onboarding.pageobjects.STLBudgectingAndSourcing;
import test.beeforce.onboarding.pageobjects.STLModulesPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class EmployeeCreationThroughBudgetingAndSourcing extends BaseClass {


	@Test(priority=1)
	public void LoginAsBudgetCreater() throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

		STLModulesPage mp=new STLModulesPage();

		LanchUrl(Url);

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
		
		lp.clicklogoutOnboarding();
		
		lp.clicklogoutCEMS();
		
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
		
//		String budgetid = ex.getCellData("BTID", "BUDGETID", 2);
		
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/a")).click();
		
		String path1 = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-STL.xls";
		
					ExcelUtils2 ex1 =new ExcelUtils2(path1);
		
					long Id = generateRandomNumber(12);
		
					String s=String.valueOf(Id);
		
					ex1.setCellData("Employees", "Aadhar Number*", 2, s);
		
		String path= System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\CandidateUploadTemplate-STL.xls";
		
		sbs.uploadCandiadteDetails(path, NTH);
		

	}
	




}
