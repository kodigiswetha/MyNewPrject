package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Timeracker_Login extends DatDriven_baseClass {
	@Test(dataProvider = "Credts")
	public void testcase(String un,String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("User is able to login successfully to timetracker",true);
	}
	
	
	
	
	
	@DataProvider(name="Credts")
	public Object [][] data() throws IOException {
		File file=new File("./testData/testData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook xsf= new XSSFWorkbook(fis);
		  String Sheetname = xsf.getSheetName(1);
		System.out.println(Sheetname); 
		 XSSFSheet sh = xsf.getSheet("Creds");
		int rowsize= sh.getPhysicalNumberOfRows();
		 int columnsize = sh.getRow(0).getPhysicalNumberOfCells();
		 Object[][] data=new Object[rowsize][columnsize];
		 for(int i=0;i<rowsize;i++) {
			 for(int j=0;j<columnsize;j++) {
				 data[i][j]=sh.getRow(i).getCell(j).toString();
			 }
		 }
		return data;
		 
	}

}
