package test.attest360.testCases;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import test.attest360.utilities.ReadConfig;


public class BaseClass {
	public static WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	public String Url =readconfig.getAppUrl();  
	public String dataEntry=readconfig.getDataEntry_UserName();
	public String QA=readconfig.getQA_UserName();
	public String Verifier=readconfig.getVerifier_UserName();
	public String Password=readconfig.getPassword();
	public static Logger log;


	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String br) {
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		} else if(br.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		log = Logger.getLogger("BeeForce");
		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	public static void selectDropdownOption(WebElement ele ,String text) {
		Select sel= new Select(ele);
		List<WebElement> alloption = sel.getOptions();
		for (WebElement option : alloption) {
			if (option.getText().equals(text)) {
				option.click();
				break;
			}
		}
	}
	public static void LanchUrl(String url) {
		driver.get(url);
	}
	public static void sendtext(String locator,String value, String toSend) {
		if (locator.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).sendKeys(toSend);
		}else if(locator.equalsIgnoreCase("classname")) {
			driver.findElement(By.id(value)).sendKeys(toSend);
		}else{
			driver.findElement(By.xpath(value)).sendKeys(toSend);	
		}
	}
	public static void buttonClick(String locator,String value) {
		if (locator.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).click();
		}else if(locator.equalsIgnoreCase("classname")) {
			driver.findElement(By.id(value)).click();
		}else{
			driver.findElement(By.xpath(value)).click();	
		}
	}
	public static void enterText(WebElement ele,String text) {
		ele.sendKeys(text);
	}
	public static void btnClick(WebElement ele) {
		ele.click();

	}

	public static String getScreenshot(WebDriver driver , String screenshotname) throws IOException {

		String datename=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"\\Screenshots\\"+screenshotname+datename+".png";
		File finaldestination=new File(dest);
		FileUtils.copyFile(src, finaldestination);
		return dest;

	}

	public static void uploadFile(WebElement ele,String path) {
		ele.sendKeys(path);
	} 
	public static void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public static void dismissAlert() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public static void sentTextToAlert(String text) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
	}
	public static void getTextFromAlert() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

	public void javaScriptExecutorClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public void javaScriptExecutorSendKeys(String text,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+text+"';", element);
	}

	public void implicitWait(byte time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public String getwindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public void scrollToElement(WebElement Element) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}
	public static void refresh() {
		driver.navigate().refresh();
	}

}
