package test.beeforce.onboarding.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.beeforce.base.BaseClass;

public class JKCBudgetingAndSourcing extends BaseClass {
	
	public JKCBudgetingAndSourcing() {

		PageFactory.initElements(driver, this);
	
	}
	
	
	// budgets 
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement btnCreate;
	
	@FindBy(xpath="//label[contains(text(),'Company')]/following-sibling::div/select")
	WebElement company;
	
	@FindBy(xpath="//label[contains(text(),'Division')]/following-sibling::div/select")
	WebElement division;
	
	@FindBy(xpath="//label[contains(text(),'Sub Division')]/following-sibling::div/select")
	WebElement subDivision;
	
	@FindBy(xpath="//label[contains(text(),'Month')]/following-sibling::div/select")
	WebElement month;
	
	@FindBy(xpath="//label[contains(text(),'Business Unit')]/following-sibling::div/select")
	WebElement businessUnit;
	
	@FindBy(xpath="//label[contains(text(),'Function')]/following-sibling::div/select")
	WebElement function;
	
	@FindBy(xpath="//label[contains(text(),'Department')]/following-sibling::div/select")
	WebElement department;
	
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
	
	@FindBy(xpath="//button[@title='Create Budget']")//Create buget Plan  
	WebElement btnBudgetSubmit; 

	@FindBy(xpath="//button[text()='Ok']")
	WebElement btnOK;
	
	
	//Sourcing
	
	@FindBy(xpath="//label[contains(text(),'Section')]/following-sibling::div/select")
	WebElement section;
	
	@FindBy(xpath="//label[contains(text(),'Location')]/following-sibling::div/select")
	WebElement location;
	
	@FindBy(id="vendors")
	WebElement vendors;
	
	@FindBy(xpath="//label[contains(text(),'Associate Types')]/following-sibling::div/select")
	WebElement associateTypes;
	
	@FindBy(id="skills")
	WebElement skills;
	
	@FindBy(xpath="//label[contains(text(),'Category')]/following-sibling::div/select")
	WebElement category;

	@FindBy(id="expectedDOJ")
	WebElement expectedDOJ;

	@FindBy(xpath="//button[@title='Create Sourcing Request']")
	WebElement btnSourcingRequestSubmit; 
	
	@FindBy(xpath="//button[text()=' Search' or @id='searchBtn']")
	WebElement btnsearch;
	
	@FindBy(id="approveBtn")
	WebElement btnApprove;
	
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
	
	private void clickCreateButton() {

		btnCreate.click();

	}
	
	private void clickSearchButton() {

		btnsearch.click();

	}

	private void selectCompany(String Company) {

		selectDropdownOption(company, Company);

	}
	
	private void selectDivision(String Division) {

		selectDropdownOption(division, Division);

	}
	
	private void selectSubDivision(String SubDivision) {

		selectDropdownOption(subDivision, SubDivision);

	}

	private void selectBusinessUnit(String BusinessUnit) {

		selectDropdownOption(businessUnit, BusinessUnit);

	}

	private void selectMonth(String Month) {

		selectDropdownOption(month, Month);

	}
	
	private void selectFunction(String Function) {

		selectDropdownOption(function, Function);

	}
	
	private void selectDepartment(String Department) {

		selectDropdownOption(department, Department);

	}
	
	private void selectSection(String Section) {

		selectDropdownOption(section, Section);

	}

	private void selectLocation(String Location) {

		selectDropdownOption(location, Location);

	}
	private void selectCategory(String Category) {

		selectDropdownOption(category, Category);

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

	
	private void selectAssociatetype(String AssociateType) {

		selectDropdownOption(associateTypes, AssociateType);

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
		
		javaScriptExecutorClick(btnView);

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
	Thread.sleep(1500);
	clickOKButton();
	
}

	public void CreateBudget(String Company,String Division,String SubDivision,String Month,String BusinessUnit,String Function,String Department,
			String Name,String Comments,String HeadCount,String BudgetAmount) throws InterruptedException {

		clickCreateButton();
		Thread.sleep(1500);
		selectCompany(Company);
		selectDivision(Division);
		selectSubDivision(SubDivision);
		selectMonth(Month);
		selectBusinessUnit(BusinessUnit);
		selectFunction(Function);
		selectDepartment(Department);
		setName(Name);
		setComments(Comments);
		clickGenerateButton();
		SetHeadCount(HeadCount);
		setBudgetAmount(BudgetAmount);
		clickCreateBudget();
		clickOKButton();
		
	}


	public void createSourcingRequest(String Company,String Division,String Month,String Section,String Location,String Vendor,String AssociateType,String skill,
			String Category ,String Name, String DOJ,String HeadCount ) throws InterruptedException {
		
		Thread.sleep(2000);
		selectCompany(Company);
		selectDivision(Division);
		selectMonth(Month);
		clickCreateButton();
		selectSection(Section);
		selectLocation(Location);
		selectVendor(Vendor);
		selectAssociatetype(AssociateType);
		selectSkills(skill);
		selectCategory(Category);
		setName(Name);
		setExpectedDOJ(DOJ);
		clickGenerateButton();
		SetHeadCount(HeadCount);
		submitSourcingRequest();
		clickOKButton();
		
	}
	
	public void searchRequest(String Company,String Division,String Month) throws InterruptedException {
		
		Thread.sleep(1000);
		selectCompany(Company);
		selectDivision(Division);
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
