/**
 * 
 */
package test.beeforce.DataProviders;

import org.testng.annotations.DataProvider;

import test.beeforce.utilities.ExcelUtils;

/**
 * @author Sathish A
 *
 */
public class DataProviders  {
	
	ExcelUtils obj=new ExcelUtils();
	
	@DataProvider(name ="Corporate")
	public Object[][] setBasicDetailsCorporate() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsCorporate") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsCorporate") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsCorporate", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="jkc")
	public Object[][] setBasicDetailsJKC() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsJKC") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsJKC") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsJKC", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="Plant")
	public Object[][] setBasicDetailsPlant() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsPlant") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsPlant") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsPlant", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="Retail")
	public Object[][] setBasicDetailsRetail() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsRetail") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsRetail") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsRetail", j, i+2);
			}
		}
		return data;
	}

	@DataProvider(name ="EmployeeFieldUpdate")
	public Object[][] set_FieldUpdate() {
		//Totals rows count
		int rows=obj.getRowCount("EmployeeFieldUpdate") ;
		//Total Columns
		int column=obj.getColumnCount ("EmployeeFieldUpdate") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("EmployeeFieldUpdate", j, i+2);
			}
		}
		return data;
	}
	@DataProvider(name ="FieldValidation")
	public Object[][] FieldValidation() {
		//Totals rows count
		int rows=obj.getRowCount("Fieldvalidation") ;
		//Total Columns
		int column=obj.getColumnCount ("Fieldvalidation") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Fieldvalidation", j, i+2);
			}
		}
		return data;
	}
	
}

