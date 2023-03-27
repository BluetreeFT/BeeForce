package test.beeforce.eattendance.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class FlipkartEAttendanceLoginPage extends BaseClass {
	
public FlipkartEAttendanceLoginPage() {
	
	PageFactory.initElements(driver, this);
	
}

@FindBy(name="username")
WebElement userName;

@FindBy(name="password")
WebElement passWord;

@FindBy(xpath="//button[text()='Login']")
WebElement btnlogin;

@FindBy(id="userSilhouette")
WebElement profile;

@FindBy(id="logout-form")
WebElement logout;



public void setUserName(String username) {

	userName.clear();

	userName.sendKeys(username);	
}

public void setPassword(String password) {

	passWord.clear();

	passWord.sendKeys(password);

} 

public void clickLoginButton() {

	btnlogin.click();

}

public void clicklogoutButton() {

	profile.click();

	logout.click();
}

 
}
