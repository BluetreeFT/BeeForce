package test.attest360.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
     PageFactory.initElements(driver, this);
	} 
	 @FindBy(id="j_username")
	 WebElement txtuser;
	 @FindBy(id="loginPassword")
	 WebElement txtpass;
	 @FindBy (xpath="//button[text()='Login']")
	 WebElement btnlogin;
	 @FindBy (xpath="//li/a[text()=' Logout']")
	 WebElement btnlogout;
	
	 
	 public void setUserName(String username) 
	 {
		txtuser.clear();
		txtuser.sendKeys(username);
	 }
	 public void setPassword(String pass) 
	 {
		txtpass.clear();
		txtpass.sendKeys(pass);
	 }
	 public void clickLogin()
	 {
		btnlogin.click();
	 }
	 public void clickLogout()
	 {
		 btnlogout.click();
	 }
	 
	 

}
