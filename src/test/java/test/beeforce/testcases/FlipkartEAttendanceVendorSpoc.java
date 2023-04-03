package test.beeforce.testcases;
import org.testng.annotations.Test;

import test.beeforce.base.BaseClass;
import test.beeforce.eattendance.pageobjects.FlipkartEAttendanceLoginPage;

public class FlipkartEAttendanceVendorSpoc extends BaseClass{

	@Test
	public void loginAsFTC() {
		// TODO Auto-generated method stub
FlipkartEAttendanceLoginPage Lgpg = new FlipkartEAttendanceLoginPage();
LanchUrl(FlipkartEURL);
Lgpg.setUserName(FlipkartVendorusername);
Lgpg.setPassword(FlipkartVendorpassword);
Lgpg.clickLoginButton();

	}
}
