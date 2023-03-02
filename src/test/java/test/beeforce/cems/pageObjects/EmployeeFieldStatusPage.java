package test.beeforce.cems.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.beeforce.base.BaseClass;

public class EmployeeFieldStatusPage extends BaseClass {

	public EmployeeFieldStatusPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="contractorIdS")
	WebElement contractorName;

	@FindBy(id="submitId")
	WebElement btnsubmit;

	//	@FindBy(xpath="")



	public void selectContractor(String contractor) {

		Select sel= new Select(contractorName);

		List<WebElement> alloption = sel.getOptions();

		for (WebElement option : alloption) {

			if (option.getText().equalsIgnoreCase(contractor)) {

				String val = option.getAttribute("value");
				
				sel.selectByValue(val);

				break;
			}
		}

	}

	public void clickSubmitButton() {

		btnsubmit.click();

	}
}
