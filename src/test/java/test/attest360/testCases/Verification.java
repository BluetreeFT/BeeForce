package test.attest360.testCases;

import org.testng.annotations.Test;

import test.attest360.pageObjects.LoginPage;
import test.attest360.pageObjects.VerifierPage;
import test.attest360.testData.DataProviders;

public class Verification extends BaseClass {
	
	@Test(priority=12)
	public void loginAsVerifier() {
		LanchUrl(Url);
		LoginPage lp=new LoginPage();
		lp.setUserName(Verifier);
		lp.setPassword(Password);
		lp.clickLogin();
	}
	
	@Test(dataProvider= "crtNum",dataProviderClass= DataProviders.class,priority=13)
	public void caseSearch(String crtNum) throws InterruptedException {
		
		VerifierPage vhp=new VerifierPage();
		vhp.searchEmployee(crtNum);
		
	}
	@Test(dataProvider= "Authorization",dataProviderClass= DataProviders.class,priority=14)
	public void verifierapproval(String path) throws InterruptedException {
		VerifierPage vp=new VerifierPage();
		vp.EductionVerification(path);
		vp.AddressVerification(path);
		vp.CriminalVerification(path);
		vp.IdentificationVerification(path);

}
}