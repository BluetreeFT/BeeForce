package test.beeforce.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.base.BaseClass;
import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.PayRollValidation;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;
import test.beeforce.utilities.ExcelUtils;
import test.beeforce.utilities.ExcelUtils2;

public class PaySheetValidation extends BaseClass {



	@Test(priority=1)
	public void login() throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

		LaunchUrl(Url);

		lp.loginToApplication(JKCPayrollAdmin, JkcPassword);

	}

	@Test(priority=2)
	public void updatePayrollDetails() {

		ModulesPage mp=new ModulesPage();

		PayRollValidation prv=new PayRollValidation();

		mp.selectModule("CHRMS");

		String file = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\FieldUpdate.xls";

		prv.uploadPayrollDetails(file);

	}


	@Test(priority=3)
	public void updateCTC() throws InterruptedException {

		PayRollValidation prv=new PayRollValidation();

		ExcelUtils ex=new ExcelUtils();

		String WageType = ex.getCellData("PayRoll", "WageType", 2);

		String Month = ex.getCellData("PayRoll", "Month", 2);

		String Year = ex.getCellData("PayRoll", "Year", 2);

		String ctcinitiate = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\InitiationUploadTemplate.xls";

		String ctcUpload = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\InitiationUploadTemplate.xls";

		prv.initiateCTC(Month, Year, ctcinitiate);
		
		Thread.sleep(1000);
		
		prv.upadteCTC(WageType, Month, Year, ctcUpload);

	}	

	@Test(priority=4)
	public void uploadAttendanceAndVariableInputs() {

		PayRollValidation prv=new PayRollValidation();

		ExcelUtils ex=new ExcelUtils();

		String WageType = ex.getCellData("PayRoll", "WageType", 2);

		String Month = ex.getCellData("PayRoll", "Month", 2);

		String Year = ex.getCellData("PayRoll", "Year", 2);

		String ProcessingStage = ex.getCellData("PayRoll", "ProcessingStage", 2);

		String attendanceinput = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\attendnaceMusterSummaryStagging.xls";

		String variableinput = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\PaysheetStagingImport.xls";

		prv.uploadAttendanceInput(ProcessingStage, Month, Year, attendanceinput);

		prv.uploadVariableInput(WageType, ProcessingStage, Month, Year, variableinput);

	}

	@Test(priority=5)
	public void initiatePayrollRun() {

		PayRollValidation prv=new PayRollValidation();
		
		ExcelUtils ex=new ExcelUtils();
		
		String WageType = ex.getCellData("PayRoll", "WageType", 2);

		String Month = ex.getCellData("PayRoll", "Month", 2);

		String Year = ex.getCellData("PayRoll", "Year", 2);

		String ProcessingStage = ex.getCellData("PayRoll", "ProcessingStage", 2);

		String payrollinitiate = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\InitiationUploadTemplate.xls";

		prv.initiatePayrollRun(ProcessingStage, Month, Year, payrollinitiate);

	}

	@Test(priority=6)
	public void downloadAndValidatePaysheet() throws InterruptedException {

		PayRollValidation prv=new PayRollValidation();

		String payrollinitiate = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\InitiationUploadTemplate.xls";

		ExcelUtils2 ex1=new ExcelUtils2(payrollinitiate);

		String EmpNum = ex1.getCellData("Sheet1", "EMPLOYEE_NUMBER", 2);

		ExcelUtils ex=new ExcelUtils();

		String WageType = ex.getCellData("PayRoll", "WageType", 2);

		String PaysheetMonth = ex.getCellData("PayRoll", "Month", 2);

		String PaysheetYear = ex.getCellData("PayRoll", "Year", 2);

		prv.downloadPaysheetReport(WageType, PaysheetMonth, PaysheetYear, EmpNum);

	}



}
