package test.attest360.testCases;

import org.testng.annotations.Test;

import test.attest360.pageObjects.LoginPage;
import test.attest360.pageObjects.QaHomePage;
import test.attest360.testData.DataProviders;

public class QADecision extends BaseClass {

	
	@Test(priority=15)
	public void loginAsVerifier() {
		LanchUrl(Url);
		LoginPage lp=new LoginPage();
		lp.setUserName(QA);
		lp.setPassword(Password);
		lp.clickLogin();
	}
	
	@Test(dataProvider= "crtNum",dataProviderClass= DataProviders.class,priority=16)
	public void DecisionTacking(String crtNum) throws InterruptedException {
	QaHomePage qhp=new QaHomePage();
	qhp.desicisionTaking(crtNum);
	
	
	}

	
	
}
