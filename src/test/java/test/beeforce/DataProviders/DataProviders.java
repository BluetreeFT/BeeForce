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
		System.out.println(rows);
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
	@DataProvider(name ="StlBudget")
	public Object[][] STLBUdget() {
		//Totals rows count
		int rows=obj.getRowCount("STLBudget") ;
		//Total Columns
		int column=obj.getColumnCount ("STLBudget") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("STLBudget", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="StlSourcing")
	public Object[][] STLSourcing() {
		//Totals rows count
		int rows=obj.getRowCount("STLSourcing") ;
		//Total Columns
		int column=obj.getColumnCount ("STLSourcing") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("STLSourcing", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="STLBSCanidateUpload")
	public Object[][] STLBScanidateUpload() {
		//Totals rows count
		int rows=obj.getRowCount("STLBSCanidateUpload") ;
		//Total Columns
		int column=obj.getColumnCount ("STLBSCanidateUpload") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("STLBSCanidateUpload", j, i+2);
			}
		}
		return data;
	}
	@DataProvider(name ="STLBasicDetails")
	public Object[][] STLBasicDetails() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsSTL") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsSTL") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsSTL", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="STLChrmsDetails")
	public Object[][] STLChrmsDeatils() {
		//Totals rows count
		int rows=obj.getRowCount("STLChrmsDetails") ;
		//Total Columns
		int column=obj.getColumnCount ("STLChrmsDetails") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("STLChrmsDetails", j, i+2);
			}
		}
		return data;
	}
	
	
	@DataProvider(name ="AutoLiv")
	public Object[][] AutoLivBasicDeatils() {
		//Totals rows count
		int rows=obj.getRowCount("BasicDetailsAutoLiv") ;
		//Total Columns
		int column=obj.getColumnCount ("BasicDetailsAutoLiv") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("BasicDetailsAutoLiv", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="JKCBudget")
	public Object[][] JKCBudgets() {
		//Totals rows count
		int rows=obj.getRowCount("JKCBudget") ;
		//Total Columns
		int column=obj.getColumnCount ("JKCBudget") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("JKCBudget", j, i+2);
			}
		}
		return data;
	}
	
	
	@DataProvider(name ="JKCSourcing")
	public Object[][] JKCSourcing() {
		//Totals rows count
		int rows=obj.getRowCount("JKCSourcing") ;
		//Total Columns
		int column=obj.getColumnCount ("JKCSourcing") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("JKCSourcing", j, i+2);
			}
		}
		return data;
	}
	
//	
	
	
	@DataProvider(name ="JKCBSCanidateUpload")
	public Object[][] JKCBSCanidateUpload() {
		//Totals rows count
		int rows=obj.getRowCount("JKCBSCanidateUpload") ;
		//Total Columns
		int column=obj.getColumnCount ("JKCBSCanidateUpload") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("JKCBSCanidateUpload", j, i+2);
			}
		}
		return data;
	}
}

