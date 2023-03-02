/**
 * 
 */
package test.attest360.testData;

import org.testng.annotations.DataProvider;
import test.attest360.utilities.ExcelUtils;

/**
 * @author Sathish A
 *
 */
public class DataProviders  {
	ExcelUtils obj=new ExcelUtils();

	@DataProvider(name ="customerName")
	public Object[][] set_Customer() {
		//Totals rows count
		int rows=obj.getRowCount("CustomerName") ;
		//Total Columns
		int column=obj.getColumnCount ("CustomerName") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("CustomerName", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="basicDetails")
	public Object[][] set_BasicDetails() {
		//Totals rows count
		int rows=obj.getRowCount("Basic Details") ;
		//Total Columns
		int column=obj.getColumnCount ("Basic Details") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Basic Details", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FilldataBasic")
	public Object[][] setFilldataBasicDetails() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-BasicDetails") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-BasicDetails") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-BasicDetails", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FilldataEducation")
	public Object[][] setFilldataEducationDetails() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Education") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Education") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Education", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillDataAddress")
	public Object[][] setFilldataAddress() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-AddressVerification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-AddressVerification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-AddressVerification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillCriminalData")
	public Object[][] setFilldataCriminalVerification() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Criminal Verification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Criminal Verification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Criminal Verification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillDataIdentification")
	public Object[][] setFillIdentificationVerification() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Identification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Identification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Identification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="Authorization")
	public Object[][] setFillDataAuthorization() {
		//Totals rows count
		int rows=obj.getRowCount("Authorization") ;
		//Total Columns
		int column=obj.getColumnCount ("Authorization") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Authorization", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="crtNum")
	public Object[][] searchCaseNum() {
		//Totals rows count
		int rows=obj.getRowCount("CrtNumber") ;
		//Total Columns
		int column=obj.getColumnCount ("CrtNumber") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("CrtNumber", j, i+2);
			}
		}
		return data;			
	 
	}
	
}
