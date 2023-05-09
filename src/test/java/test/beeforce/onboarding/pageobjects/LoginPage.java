package test.beeforce.onboarding.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sourceforge.tess4j.TesseractException;
import test.beeforce.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//label[text()='Username']/following-sibling::input")
	WebElement txtuserName;

	@FindBy(xpath="//label[text()='Password']/following-sibling::div/input")
	WebElement txtpassword;

	@FindBy(xpath="//button[text()='Login']")
	WebElement btnlogin;

	@FindBy(id="userSilhouette")
	WebElement profile;

	@FindBy(xpath="//a[@href='/onboarding/logout' and @class='dropdown-item notify-item']")
	WebElement btnlogoutonboarding;

	@FindBy(xpath="//img[@alt='user-image']")
	WebElement profile1;

	@FindBy(xpath="//a/child::span[text()='Logout']")
	WebElement btnlogout;

	@FindBy(xpath="//button[@class='dropdown-item notify-item']/span[text()='Logout']")
	WebElement btnlogoutstl;

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

	public void loginToApplication(String username,String password ) throws IOException, InterruptedException, TesseractException {

		setUserName(username);

		setPassword(password);

		//		handelCapcha("captchaImage", "jcaptcha");

		clickLoginButton();

	}


	public void clicklogoutOnboarding() {

		profile.click();

		btnlogoutonboarding.click();

	}

	public void clicklogoutCEMS() throws InterruptedException {

		profile1.click();
		
		Thread.sleep(1000);
		
		btnlogout.click();

	}

	public void clickProfilelogoutCEMS() {

		profile.click();

		btnlogout.click();

	}
	
	public void clickProfilelogoutCEMSSTL() {

		profile.click();

		btnlogoutstl.click();

	}


}
