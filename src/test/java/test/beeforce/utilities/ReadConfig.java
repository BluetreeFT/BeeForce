/**
 * 
 */
package test.beeforce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Sathish
 * @category Read values from configuration file
 */
public class ReadConfig {
	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("./configuration/config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Exception Msg is :"+ e.getMessage());
		}
	}
	
	public String getAppUrl() {
		
		String url=pro.getProperty("Url");
		
		
		return url;
	}
	
	public String getTitanContractorUserName() {
		
		String username=pro.getProperty("TitanContractorUserName");
		
		return username;
	}
	
public String getTitanPassword() {
		
		String password=pro.getProperty("TitanPassWord");
		
		return password;
	}

public String getTitanAdminUserName() {
	
	String username=pro.getProperty("TitanAdminUserName");
	
	return username;
}

public String getJkcContractorUserName() {
	
	String username=pro.getProperty("JkcContractorUserName");
	
	return username;
}

public String getJkcPassword() {
	
	String password=pro.getProperty("JkcPassWord");
	
	return password;
}

public String getJkcAdminUserName() {

String username=pro.getProperty("JkcAdminUserName");

return username;

}

public String getJkcAdminPassword() {
	
	String password=pro.getProperty("JkcAdminPassWord");
	
	return password;
}
public String getFlipkartEattendanceUrl() {
	
	String url=pro.getProperty("FlipkartEattendanceURL");
	
	return url;
}
public String getFlipkartFTC() {
	
	String username=pro.getProperty("FlipkartFTC");
	
	return username;
}
public String getFlipkartFTCpassword() {
	
	String password=pro.getProperty("FTCPassword");
	
	return password;
}
public String getFlipkartFTEUsername() {
	
	String username=pro.getProperty("TestFTE");
	
	return username;
	
}
public String getFTEPassword() {
	
	String password=pro.getProperty("TestFTE");
	
	return password;
}
public String getFlipkartVendorUsername() {
	
	String username=pro.getProperty("FlipkartVendorSpoc");
	
	return username;
}
public String getVendorPassword() {
	String password=pro.getProperty("FlipkartVendorSpocPassword");
	return password;
}

public String getSTLContractorPassword() {
	String password=pro.getProperty("STLContractorPassword");
	return password;
}

public String getSTLAdminPassword() {
	String password=pro.getProperty("STLAdminPassWord");
	return password;
}
public String getAdminUsername() {
	
	String username=pro.getProperty("STLAdminUsername");
	
	return username;
}
public String getContractorUsername() {
	
	String username=pro.getProperty("STLContractorUserName");
	
	return username;
}

}

