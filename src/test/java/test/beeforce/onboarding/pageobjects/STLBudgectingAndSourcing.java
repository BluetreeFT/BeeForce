package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class STLBudgectingAndSourcing extends BaseClass  {


	public STLBudgectingAndSourcing() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement btnCreate;

	@FindBy(xpath="//label[contains(text(),'BU') or contains(text(),'Business Unit')]/following-sibling::div/select")
	WebElement businessUnit;

	@FindBy(xpath="//label[contains(text(),'OU') or contains(text(),'Organization Unit')]/following-sibling::div/select")
	WebElement organizationUnit;

	@FindBy(xpath="//label[contains(text(),'Location')]/following-sibling::div/select")
	WebElement location;

	@FindBy(xpath="//label[contains(text(),'Month')]/following-sibling::div/select")
	WebElement month;

	@FindBy(xpath="//label[contains(text(),'Cost Center')]/following-sibling::div/select")
	WebElement costCenter;

	@FindBy(xpath="//label[contains(text(),'Department')]/following-sibling::div/select")
	WebElement department;

	@FindBy(xpath="//label[contains(text(),'Associate Type')]/following-sibling::div/select")
	WebElement associateType;

	@FindBy(id="name")
	WebElement name;

	@FindBy(id="comments")
	WebElement comments;

	@FindBy(xpath="//button[contains(text(),'Generate')]")
	WebElement btnGenerate;

	@FindBy(id="details0headCount")
	WebElement headCount;

	@FindBy(id="details0amount")
	WebElement budgetAmount;

	@FindBy(xpath="//button[@title='Create Budget']")//Create Sourcing Request
	WebElement btnBudgetSubmit; 

	@FindBy(xpath="//button[text()='Ok']")
	WebElement btnOK; 

	@FindBy(id="approveBtn")
	WebElement btnApprove;

	//Sourcing Request 

	@FindBy(id="budgetId")
	WebElement SourcingBudget;

	@FindBy(id="skills")
	WebElement skills;

	@FindBy(id="vendors")
	WebElement vendors;

	@FindBy(id="expectedDOJ")
	WebElement expectedDOJ;

	@FindBy(xpath="//button[@title='Create Sourcing Request']")
	WebElement btnSourcingRequestSubmit; 

	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSearch;

	@FindBy(xpath="//button[text()='View']")
	WebElement btnView;

	@FindBy(id="upload")
	WebElement fileUpload;

	@FindBy(id="uploadEmployeeBtn")
	WebElement BtnUpload;

	@FindBy(id="saveCandidates")
	WebElement saveCandidates;

	@FindBy(xpath="//button[text()='Select']")
	WebElement selectCandidate;

	@FindBy(xpath="//button[text()='Selected']/parent::td/following-sibling::td/input[contains(@id,'nth')]")
	WebElement nth;

	@FindBy(xpath="//button[text()='Update']")
	WebElement update;
	
	@FindBy(xpath="//button[text()=' Search' or @id='searchBtn']")
	WebElement btnsearch;

	private void clickCreateButton() {

		btnCreate.click();

	}
	
	private void clickSearchButton() {

		btnsearch.click();

	}


	private void selectBusinessUnit(String BU) {

		selectDropdownOption(businessUnit, BU);

	}

	private void selectOrganizationUnit(String OU) {

		selectDropdownOption(organizationUnit, OU);

	}

	private void selectMonth(String Month) {

		selectDropdownOption(month, Month);

	}

	private void selectLocation(String Location) {

		selectDropdownOption(location, Location);

	}

	private void selectCostCenter(String CostCenter) {

		selectDropdownOption(costCenter, CostCenter);

	}
	private void selectAssociatetype(String AssociateType) {

		selectDropdownOption(associateType, AssociateType);

	}

	private void setName(String Name) {

		name.clear();
		name.sendKeys(Name);

	}

	private void setComments(String Comments) {

		comments.clear();
		comments.sendKeys(Comments);
	}

	private void clickGenerateButton() {

		btnGenerate.click();

	}

	private void SetHeadCount(String HeadCount) {

		JavascriptExecutor js = (JavascriptExecutor)driver; 

		js.executeScript("arguments[0].scrollIntoView()", headCount);

		headCount.sendKeys(HeadCount);

	}

	private void setBudgetAmount(String BudgetAmount) {

		budgetAmount.sendKeys(BudgetAmount);

	}

	private void clickCreateBudget() {

		javaScriptExecutorClick(btnBudgetSubmit);


	}

	public void clickOKButton() {

		btnOK.click();

	}

	public void clickApproveBudgetButton() {

		btnApprove.click();

	}

	private void selectSkills(String skill ) {

		selectDropdownOption(skills, skill);

	}
	private void selectVendor(String Vendor ) {

		selectDropdownOption(vendors, Vendor);

	}

	private void setExpectedDOJ(String DOJ) {

		expectedDOJ.sendKeys(DOJ);

	}
	private void submitSourcingRequest() {

		
		javaScriptExecutorClick(btnSourcingRequestSubmit);

	}
	
	private void clickViewButton() {
		
		btnView.click();

	}
	
	private void uploadCandaidate(String path) {
		
		uploadFile(fileUpload, path);

	}
	
private void clickUploadCandaidateButton() {
		
	BtnUpload.click();

	}

private void saveUploadedCandaidate() {
	
	javaScriptExecutorClick(saveCandidates);

	}

private void submitUploadedCandaidate(String NTH) throws InterruptedException {
	
	javaScriptExecutorClick(selectCandidate);
	javaScriptExecutorSendKeys(NTH, nth);
	javaScriptExecutorClick(update);
	Thread.sleep(1000);
	clickOKButton();
	
}

	public void CreateBudget(String BU,String OU,String Location,String Month,String CostCenter,String AssociateType,String Name,
			String Comments,String HeadCount,String BudgetAmount) throws InterruptedException {

		clickCreateButton();
		Thread.sleep(1500);
		selectBusinessUnit(BU);
		selectOrganizationUnit(OU);
		selectLocation(Location);
		selectMonth(Month);
		selectCostCenter(CostCenter);
		selectAssociatetype(AssociateType);
		setName(Name);
		setComments(Comments);
		clickGenerateButton();
		SetHeadCount(HeadCount);
		setBudgetAmount(BudgetAmount);
		clickCreateBudget();
		clickOKButton();	

	}


	public void createSourcingRequest(String BU,String OU,String Month,String Location,String CostCenter,String AssociateType,String skill,
			String Vendor,String DOJ,String Name,String HeadCount ) throws InterruptedException {

		
		Thread.sleep(2000);
		
		selectBusinessUnit(BU);
		selectOrganizationUnit(OU);
		selectMonth(Month);
		clickCreateButton();
		selectLocation(Location);
		selectCostCenter(CostCenter);
		selectAssociatetype(AssociateType);
		selectSkills(skill);
		selectVendor(Vendor);
		setExpectedDOJ(DOJ);
		setName(Name);
		clickGenerateButton();
		SetHeadCount(HeadCount);
		submitSourcingRequest();
		clickOKButton();
	}
	
	public void searchRequest(String BU,String OU,String Month) throws InterruptedException {
		
		Thread.sleep(1000);
		selectBusinessUnit(BU);
		selectOrganizationUnit(OU);
		selectMonth(Month);
		clickSearchButton();
	}
	
	public void uploadCandiadteDetails(String path,String NTH) throws InterruptedException {
		
		clickSearchButton();
		
		clickViewButton();
		
		uploadCandaidate(path);
		
		clickUploadCandaidateButton();
		
		saveUploadedCandaidate();
		
		Thread.sleep(2000);	
		
		submitUploadedCandaidate(NTH);
		

	}
	
	
	



}
