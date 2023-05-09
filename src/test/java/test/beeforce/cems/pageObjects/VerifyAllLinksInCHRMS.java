package test.beeforce.cems.pageObjects;

import java.io.IOException;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.base.BaseClass;
import test.beeforce.onboarding.pageobjects.LoginPage;
import test.beeforce.onboarding.pageobjects.ModulesPage;

public class VerifyAllLinksInCHRMS extends BaseClass {



	@Test
	public void loginAsAdmin(String org) throws IOException, InterruptedException, TesseractException {

		LoginPage lp=new LoginPage();

		if(org.equalsIgnoreCase("Titan")){

			lp.loginToApplication(TitanContractorUserName, TitanContractorPassword);

		}else if(org.equalsIgnoreCase("jkc")) {

			lp.loginToApplication(JkcContractorUserName, JkcPassword);
			
		}
	}
	
	@Test
	public void VerifyAllLinks() {
		
		ModulesPage mp=new ModulesPage();
		
		mp.selectModule("CHRMS");
		
		
		
		
	}

}
