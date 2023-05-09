package test.beeforce.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.base.BaseClass;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.utilities.ExcelUtils;

public class MultipleLoginTest  extends BaseClass {
	
	@Test(priority=1)
	@Parameters("org")
	public void loginAsContractor(String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp= new LoginPage();

		LaunchUrl(Url);

		if(org.equalsIgnoreCase("Titan")){ 	

			lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcContractorUserName, JkcPassword);

		}else if(org.equalsIgnoreCase("Stl")){

			lp.loginToApplication("", "");

		}

	}
	
	@Test(priority=2)
	@Parameters("org")
	public void loginAsContractor1(String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp= new LoginPage();

		LaunchUrl(Url);

		if(org.equalsIgnoreCase("Titan")){

			lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcContractorUserName, JkcPassword);

		}else if(org.equalsIgnoreCase("Stl")){

			lp.loginToApplication("", "");

		}

	}

	@Test(priority=2)
	@Parameters("org")
	public void loginAsContractor2(String org) throws InterruptedException, IOException, TesseractException {

		LoginPage lp= new LoginPage();

		LaunchUrl(Url);

		if(org.equalsIgnoreCase("Titan")){

			lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcContractorUserName, JkcPassword);

		}else if(org.equalsIgnoreCase("Stl")){

			lp.loginToApplication("", "");

		}

	}

}
