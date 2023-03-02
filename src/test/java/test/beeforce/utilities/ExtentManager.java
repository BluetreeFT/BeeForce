package test.beeforce.utilities;

import java.io.File;
import java.util.Date;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentReports extent;

	public  static ExtentReports createInstance() {
		String fileName =getReportName();
		String directory=System.getProperty("user.dir")+"/Reports/";
		new File(directory).mkdirs();
		String path=directory+fileName;
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(path);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Beeforce_Test sReport");
		htmlReporter.config().setReportName("Functional_Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("os","windows_10");
		extent.setSystemInfo("browser","chrome");
		extent.setSystemInfo("Tester_Name", "Sathish_A");
		return extent;

	}
	public static String getReportName() {
		Date d=new Date();
		String fileName= "AutomationReport_"+d.toString().replace(":", "_").replace(" ", "_")+".html";
		return fileName;

	}

}
