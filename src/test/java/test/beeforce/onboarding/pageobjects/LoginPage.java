package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="userName")
	WebElement txtuserName;

	@FindBy(id="password")
	WebElement txtpassword;

	@FindBy(xpath="//button[text()='Login']")
	WebElement btnlogin;

	@FindBy(id="userSilhouette")
	WebElement profile;

	@FindBy(xpath="//a[@href='/onboarding/logout']")
	WebElement btnlogoutonboarding;

	@FindBy(xpath="//img[@alt='user-image']")
	WebElement profile1;

	@FindBy(xpath="//a[@href='/CEMS/j_spring_security_logout']")
	WebElement btnlogout;


	public void setUserName(String username) {

		txtuserName.clear();

		txtuserName.sendKeys(username);	
	}

	public void setPassword(String password) {

		txtpassword.clear();

		txtpassword.sendKeys(password);

	} 

	public void clickLoginButton() {

		btnlogin.click();

	}

	public void loginToApplication(String username,String password ) {

		setUserName(username);

		setPassword(password);

		clickLoginButton();

	}


	public void clicklogoutOnboarding() {

		profile.click();

		btnlogoutonboarding.click();

	}

	public void clicklogoutCEMS() {

		profile1.click();

		btnlogout.click();

	}

	public void clickProfilelogoutCEMS() {

		profile.click();

		btnlogout.click();

	}


}
