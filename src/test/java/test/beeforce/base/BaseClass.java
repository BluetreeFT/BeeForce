package test.beeforce.base;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import test.beeforce.utilities.ReadConfig;


public class BaseClass {
	public static WebDriver driver;

	ReadConfig readconfig = new ReadConfig();

	public String Url =readconfig.getAppUrl();  

	public String TitanContractorUserName=readconfig.getTitanContractorUserName();

	public String TitanContractorPassword=readconfig.getTitanPassword();

	public String TitanAdminUserName=readconfig.getTitanAdminUserName();
	
	public String JkcContractorUserName=readconfig.getJkcContractorUserName();

	public String JkcPassword=readconfig.getJkcPassword();
	
	public String JkcAdminPassword=readconfig.getJkcAdminPassword();

	public String JkcAdminUserName=readconfig.getJkcAdminUserName();


	public static Logger log;


	@Parameters("browser")

	@BeforeClass
	public void browserSetup(String br) {

		if (br.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if(br.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver=new ChromeDriver();

		}

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

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

			if (option.getText().equalsIgnoreCase(text)) {

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

	public static String getTextFromAlert() {

		Alert alert=driver.switchTo().alert();

		String Alretmessage = alert.getText();
		
		alert.accept();
		
		return Alretmessage;
	}

	public void javaScriptExecutorClick(WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click();", element);
	}

	public void javaScriptExecutorSendKeys(String text,WebElement element) {

		JavascriptExecutor js= (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='"+text+"';", element);
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

	public boolean isAlertPresent() { 

		try { 

			driver.switchTo().alert(); 

			return true; 

		}    catch (NoAlertPresentException Ex)  { 


			return false; 
		}  
	}

	public boolean isElementPresent(String id) {

		try {

			List<WebElement> element = driver.findElements(By.xpath("//*[@id='"+id+"']"));

			if(element.size()==0) {

				return false;
			}

			return true;

		}catch (Exception e) {

			return true;
		} 
	}


	public void waitUntilAlertPresent() {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String randomName() {

		Random rnd = new Random();

		String firstname = "1";

		String lastname = "Flow";

		String result;

		result = Character.toString(firstname.charAt(0)); // First char

		if (lastname.length() > 5)

			result += lastname.substring(0, 5);

		else

			result += lastname;

		return result += Integer.toString(rnd.nextInt(9999));
	}

	public static String OutlookMailReader(String mailFolderName,String emailSubjectContent, String emailContent, int lengthOfOTP) {
		/*
		 * mailFolderName(Eg-"INBOX")
		 * emailSubjectContent(Eg- Mail for OTP)
		 * emailContent(Eg- OTP is 111111)
		 * OTP length(Eg- 6) 
		 */
		String hostName = "smtp-mail.outlook.com";//change it according to your mail

		String username = "sankararjun07@outlook.com";//username 

		String password = "S18121994h@";

		int messageCount;

		int unreadMsgCount;

		String emailSubject;

		Message emailMessage;

		String searchText=null ;

		Properties sysProps = System.getProperties();

		sysProps.setProperty("mail.store.protocol", "imaps");

		try {

			Session session = Session.getInstance(sysProps, null);

			Store store = session.getStore();

			store.connect(hostName, username, password);

			Folder emailBox = store.getFolder(mailFolderName);

			emailBox.open(Folder.READ_WRITE);

			messageCount = emailBox.getMessageCount();

			System.out.println("Total Message Count: " + messageCount);

			unreadMsgCount = emailBox.getNewMessageCount();

			System.out.println("Unread Emails count:" + unreadMsgCount);

			for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)

			{
				emailMessage = emailBox.getMessage(i);

				emailSubject = emailMessage.getSubject();

				if(emailSubject.contains(emailSubjectContent))

				{
					System.out.println("OTP mail found");

					String line;

					StringBuffer buffer = new StringBuffer();

					BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

					while ((line = reader.readLine()) != null) {

						buffer.append(line);
					}
					String messageContent=emailContent;

					String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

					System.out.println(result);

					searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);

					System.out.println("Text found : "+ searchText);

					emailMessage.setFlag(Flags.Flag.SEEN, true);

					break;
				}
				emailMessage.setFlag(Flags.Flag.SEEN, true);
			}

			emailBox.close(true);

			store.close();


		} catch (Exception mex) {

			mex.printStackTrace();

			System.out.println("OTP Not found ");

		}

		return searchText;

	}

	public static long generateRandomNumber(int length) {

		Random random = new Random();

		char[] digits = new char[length];

		digits[0] = (char) (random.nextInt(9) + '1');

		for (int i = 1; i < length; i++) {

 			digits[i] = (char) (random.nextInt(10) + '0');

		}

		return Long.parseLong(new String(digits));
	}

	public String CurrentDate() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		
		LocalDateTime now = LocalDateTime.now();  
		
		String CDate = dtf.format(now).toString();

		return CDate;

	} 
	public static void handelCapcha(String capchaxpath ,String textxpath ) throws IOException, InterruptedException, TesseractException {
		
		WebElement capcha = driver.findElement(By.id(capchaxpath)); 	   
		File src = capcha.getScreenshotAs(OutputType.FILE);
		String path="E:\\Sathish A\\Automation\\BeeForce\\capcha.png";
		org.openqa.selenium.io.FileHandler.copy(src, new File(path));
		Thread.sleep(1000);
		ITesseract image=new Tesseract();
		image.setDatapath("E:\\Sathish A\\AutoTools\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String text = image.doOCR(new File(path));
		System.out.println(text);
		driver.findElement(By.name(textxpath)).sendKeys(text); 
	}



}
