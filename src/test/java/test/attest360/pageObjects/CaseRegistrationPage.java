package test.attest360.pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class CaseRegistrationPage extends BaseClass {
	public CaseRegistrationPage() {
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nameId") //first name 
	WebElement txtfirstname;
	@FindBy(id="lastNameId") // last name
	WebElement txtlsatName;
	@FindBy(id="dob") //dob
	WebElement dob;
	@FindBy(id="fatherNameId") //father name
	WebElement fathername;
	@FindBy(id="mobileNoID") //mobile number
	WebElement mobile;
	@FindBy(id="emailId") //email
	WebElement email;
	@FindBy(id="stateId") //permanent resident state
	WebElement state;
	@FindBy(id="districtId") //permanent resident city
	WebElement city;
	@FindBy(id="locationId") // joining location dropdown
	WebElement joinloca;
	@FindBy(id="jobRoleId") // jobRole dropdown
	WebElement jobrole;
	@FindBy(id="recruiterUsernameId") // Recruiters dropdown
	WebElement recruiter;
	@FindBy(id="candidateReferenceId") // Reference ID/ Employee Code
	WebElement empcode;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnsave;
	@FindBy(xpath="//div/a[text()='Cancel']")
	WebElement btncancel;
	@FindBy(xpath="//strong[contains(text(),'Well done!')]")
	WebElement successmsg;
	@FindBy(id="searchName")
	WebElement searchytxt;
	@FindBy(xpath="//input[@type='submit']")
	WebElement search;
	
	//table/tbody/tr/td[contains(text(),'121')]/preceding-sibling::td[2]

public void setFirstName(String firstname)
{
	txtfirstname.clear();
	txtfirstname.sendKeys(firstname);
}
public String getFirstname()
{
	String name = txtfirstname.getAttribute("value");
	return name;
}
public void setLastName(String lastname)
{
	txtlsatName.clear();
	txtlsatName.sendKeys(lastname);
}
public void setDOB(String Dob)
{
	dob.clear();
	dob.sendKeys(Dob);
}	
public void setMobileNumber(String mobileNumber)
{
	mobile.clear();
	mobile.sendKeys(mobileNumber);
}		
public void setFatherName(String FatherName)
{
	fathername.clear();
	fathername.sendKeys(FatherName);
}		
public void setEmail(String Email)
{
	email.clear();
	email.sendKeys(Email);
}		
public void setState(String State)
{
	state.clear();
	state.sendKeys(State);
}		
public void setCity(String City)
{
	city.clear();
	city.sendKeys(City);
}
public void SelectJoiningLocation(String location)
{
	selectDropdownOption(joinloca, location);
}
public void SelectJobRole(String jobRole)
{
	selectDropdownOption(jobrole, jobRole);
}
public void SelectRecruiters(String Recruiter)
{
	selectDropdownOption(recruiter, Recruiter);
}
public void setEmployeeCode(String employeecode)
{
	empcode.clear();
	empcode.sendKeys(employeecode);
}
public String getEmployeeCode()
{
	String emp = empcode.getAttribute("value");
	return emp;
	
}
public void clickSave()
{
	btnsave.click();
}
public void clickCancel()
{
	btncancel.click();
}
public void verifySuccessMessage() 
{
	String SuccessMsg = successmsg.getText();
	assertEquals("Well done! you have successfully saved/updated an case data", SuccessMsg);
}
public String getCrtNumber(String name,String emp)
{
	searchytxt.sendKeys(name);
	search.click();
	WebElement crtNumber = driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),'"+emp+"')]/preceding-sibling::td[2]"));
	String CrtNumber = crtNumber.getText();
	System.out.println(CrtNumber);
	return CrtNumber;
}
}
