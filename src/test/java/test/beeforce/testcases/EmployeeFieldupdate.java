package test.beeforce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.beeforce.DataProviders.DataProviders;
import test.beeforce.base.BaseClass;
import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.EmployeeFieldStatusPage;
import test.beeforce.cems.pageObjects.EmployeeFieldUpdatePage;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class EmployeeFieldupdate extends BaseClass {

	@Test(priority=1)
	public void loginAsContractor() {

		LoginPage lp=new LoginPage();

		lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

	}

	@Test(priority=2)
	
	@Parameters("Module")
	
	public void navigateToemployeefieldUpdatePage(String Module) {

		ModulesPage mp=new ModulesPage();

		ChrmsHomePage chp=new ChrmsHomePage();

		mp.selectModule(Module);

//		chp.clickDataManagement();

		chp.clickEmployeeFieldUpdateDropDown();

		chp.clickEmployeeFieldUpdate();

	}

	@Test(dataProvider="EmployeeFieldUpdate", dataProviderClass= DataProviders.class,priority=3)
	public void setupdatedFieldValue(String empNumber,String fieldtype, String toValue) {

		EmployeeFieldUpdatePage efp=new EmployeeFieldUpdatePage();

		efp.setEmployeeNumber(empNumber);

		efp.selectFiedType(fieldtype);

		efp.clickSubmitButton();

		efp.setToValue(toValue);

		efp.clickSaveButton();

	}

	@Test(priority=4)
	public void logoutAsContractor() throws InterruptedException {

		LoginPage lp=new LoginPage();

		lp.clicklogoutCEMS();

	}

	@Test(priority=5)
	public void loginAsAdmin() {

		LoginPage lp=new LoginPage();
		
		LanchUrl(Url);

		lp.loginToApplication(TitanAdminUserName, TitanContractorPassword);

	}

	@Test(priority=6)

	@Parameters("Module")
	public void navigateToEmployeeFieldUpdateApprovePage(String Module) {

		ModulesPage mp=new ModulesPage();

		ChrmsHomePage chp=new ChrmsHomePage();

		mp.selectModule(Module);

//		chp.clickDataManagement();

		chp.clickEmployeeFieldUpdateDropDown();

		chp.clickEmployeeFieldStatus();

	}

	@Test(priority=7)
	public void approveEmployeeFieldUpdate() throws InterruptedException {

		EmployeeFieldStatusPage efp=new EmployeeFieldStatusPage();

		EmployeeFieldUpdatePage efu=new EmployeeFieldUpdatePage();
		
		WebElement checkbox = null;
		String fieldname = null;
		String Filed = null;

		ExcelUtils2 ex=new ExcelUtils2();

		ExcelUtils ex1=new ExcelUtils();

		String contractor = ex.getCellData("Sheet1", "CUSTOMER NAME*", 2);

		//		efp.selectContractor(contractor);

		efp.clickSubmitButton();
		
		Thread.sleep(1000);

		efu.clickLastpageButton();

		do {

			int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();

			for (int r=rows; r>1; r--) {

				WebElement AssociateNumber = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[1]"));

				String Associate = AssociateNumber.getText();

				WebElement FiledName = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[2]"));

				 Filed = FiledName.getText();

				String EmployeeNumber = ex1.getCellData("EmployeeFieldUpdate", "Employee Number", 2);

				fieldname = ex1.getCellData("EmployeeFieldUpdate", "Field Name", 2);

				if(Associate.equals(EmployeeNumber)) {

					if(Filed.equals(fieldname)) {

						checkbox = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[7]/input"));

						javaScriptExecutorClick(checkbox);
						
						break;
					}

				}


			}
			if(Filed.equals(fieldname)) {

				break;
			}else {

			efu.clickNextButton();
			}
		} while(!efu.getNextButtonClass().contains("disabled"));


		efu.clickApproveButton();

		if (isAlertPresent()) {

			acceptAlert();

		}
		
		Thread.sleep(1000);
	}	



}		









