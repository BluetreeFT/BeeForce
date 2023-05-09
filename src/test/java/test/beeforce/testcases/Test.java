package test.beeforce.testcases;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.base.BaseClass;

import test.beeforce.cems.pageObjects.ChrmsHomePage;
import test.beeforce.cems.pageObjects.EmployeeFieldStatusPage;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;

public class Test extends BaseClass {


	public void downloadtest() {
		
		browserSetup("chrome");
		
		
	}
	
//	public void setup() throws InterruptedException, IOException, TesseractException{
//
//		browserSetup("chrome");
//
//		LanchUrl("https://test-cems-saas.labour.tech/CEMS/login");
//
//		LoginPage lp=new LoginPage();
//
//		lp.loginToApplication(TitanAdminUserName, TitanContractorPassword);
//
//		ModulesPage mp=new ModulesPage();
//
//		mp.selectModule("CHRMS");
//
//		ChrmsHomePage cp=new ChrmsHomePage();
//		Thread.sleep(1000);
////		cp.clickDataManagement();
//		Thread.sleep(1000);
//
//		cp.clickEmployeeFieldUpdateDropDown();
//
//		cp.clickEmployeeFieldStatus();
//
//		EmployeeFieldStatusPage ep=new EmployeeFieldStatusPage();
//
//		//		ep.selectContractor("Manpower");
//
//		ep.clickSubmitButton();
//
//		Thread.sleep(1000);
//
//		String text = driver.findElement(By.xpath("//div[@class='justify-content-center']")).getText();
//
//		System.out.println(text);
//
//		String page = text.split("of ")[1];
//
//		int w =Integer.parseInt(page);
//
//		w=w/10 +1;
//
//		WebElement aa = null;
//
//
//		for (int p = w; p >=1; p--) {
//
//			String pageno=Integer.toString(p);
//
//			WebElement pagen = driver.findElement(By.xpath("//nav/ul/li/a[text()='"+pageno+"']"));
//
//			scrollToElement(pagen);
//
//			Thread.sleep(1000);
//
//			pagen.click();
//
//			Thread.sleep(1500);
//
//			int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();
//
//			System.out.println(rows);
//
//			for (int r=rows; r>1; r--) {
//
//				WebElement AssociateNumber = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[1]"));
//
//				String Associate = AssociateNumber.getText();
//				WebElement FiledName = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[2]"));
//
//				String Filed = FiledName.getText();
//
//				System.out.println(Filed);
//
//
//				System.out.println(Associate);
//
//				if(Associate.equals("BT3001000002")) {
//					if(Filed.equals("COMMUNITY")) {
//
//						aa = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[7]/input"));
//
//						javaScriptExecutorClick(aa);
//						break;
//					}
//
//				}
//			}
//
//			if(aa.isSelected()){
//
//				break;
//			}	
//		}
//
//	}
	
	
//	public void Add(int a,int b) {
//		
//		int c =a+b;
//		
//		System.out.println(c);
//	}
//	
	

//	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
//
//		Test t=new Test();
//
////		t.setup();add
//t.Add(10, 20);
//
//	}

	




}
