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

	@FindBy(xpath="//label[contains(text(),'BU')]/following-sibling::div/select")
	WebElement businessUnit;

	@FindBy(xpath="//label[contains(text(),'OU')]/following-sibling::div/select")
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

	@FindBy(xpath="//button[@title='Create Budget']")
	WebElement btnSubmit; 

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

	@FindBy(id="btnSelect0")
	WebElement selectCandidates;

	@FindBy(id="nth0")
	WebElement nth;

	@FindBy(xpath="//button[text()='Update']")
	WebElement update;

	private void clickCreateButton() {

		btnCreate.click();

	}

	private void selectBU(String BU) {

		selectDropdownOption(businessUnit, BU);

	}

	private void selectOU(String OU) {

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

		btnSubmit.click();

	}

	private void clickOKButton() {

		btnOK.click();

	}



	public void CreateBudget(String BU,String OU,String Location,String Month,String CostCenter,String AssociateType,String Name,
			String Comments,String HeadCount,String BudgetAmount) {

		clickCreateBudget();
		selectBU(BU);
		selectOU(OU);
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
	
	public void ApproveBudget() {
		
		
		

	}




}
