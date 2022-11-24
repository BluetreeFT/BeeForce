/**
 * 
 */
package test.attest360.utilities;

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
	
	public String getDataEntry_UserName() 
	{
		String username=pro.getProperty("DataEntryUN");
		return username;
	}
	public String getQA_UserName() 
	{
		String username=pro.getProperty("QaUN");
		return username;
	}
	public String getVerifier_UserName() 
	{
		String username=pro.getProperty("VerifierUN");
		return username;
	}

	public String getPassword() {
		String pass=pro.getProperty("Password");
		return pass;
	}

}
