package test.attest360.pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//span[text()='Case Data']") //case data dropdown
    WebElement casedataDropdown;
    @FindBy(xpath="//a[text()='Fill Data']") // fill data link
    WebElement fildataLink;
    @FindBy(xpath="//span[text()=' Click Here']") // to view all cases click here button
    WebElement clickherelink;
    @FindBy(id="searchName")   // search box txt field 
    WebElement txtsearch;
    @FindBy(id="button-addon2") // search button
    WebElement btnsearch;
    @FindBy(id="orgSearch")   //org dropdown
    WebElement orgDropdown;
    @FindBy(id="statusSearch") // status dropdown
    WebElement statusDropdown;
    @FindBy(xpath="//span[text()='Customer Settings']") // customer setting dropdown
    WebElement cusSetDropdown;
    @FindBy(xpath="//a[text()='Customer Details']") //customer details link
    WebElement cusDetailLink;
    @FindBy(xpath="//span[text()='Verification']") //verification dropdown
    WebElement verificationDropdown;
    @FindBy(xpath="//a[text()='Case Upload']") // case upload link
    WebElement caseuploadLink;
    
    //******************************
    @FindBy(id="name") //search box text field 
	WebElement txsearch;
	@FindBy(xpath="//button[text()='Search']") //search button
	WebElement btnSearch;
	@FindBy(xpath="//td/a[text()='Select']") //customer select
	WebElement cusSelect;
	@FindBy(xpath="//li/a[text()='Verification']") //verification dropdown
	WebElement verify;
	@FindBy(xpath="//li/a[text()='Case Upload']") // caseupload link
	WebElement caseupload;
	@FindBy(xpath="//div/a[text()='Create New']") //create new case
	WebElement crtNew;
	@FindBy(xpath="//li/a[text()='Case Data']")
    WebElement casedata;
    @FindBy(xpath="//li/a[text()='Fill Data']")
    WebElement filldata;
	
	
	public void setCustomer(String customerNme) 	{
		txsearch.sendKeys(customerNme);
		btnSearch.click();
		cusSelect.click();
	}
	public void clickCreateNew() 	{
		verify.click();
		caseupload.click();
		crtNew.click();
	}
	public void cclickFillData()	{
		casedata.click();
		filldata.click();
	}
	public void selectCrtNumber(String crtNumber)	{
		txsearch.sendKeys(crtNumber,Keys.ENTER);
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNumber+"']")).click();
	}
    
    //*******************************************
	
    public void clickCustomerSetting () 
    {
    	cusSetDropdown.click();
    }
    public void clickCustomerDetails () 
    {
    	cusDetailLink.click();
    }
    public void clickCaseUpload () 
    {
    	verificationDropdown.click();
    	caseuploadLink.click();
    }
    
    public void clickFillData () 
    {
    	casedataDropdown.click();
    	fildataLink.click();
    }
}
