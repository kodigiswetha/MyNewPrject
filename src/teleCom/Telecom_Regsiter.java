package teleCom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Telecom_Regsiter extends telecom_baseclass {
@Test(dataProvider="teleReg")
public void regsiter(String email,String pwd,String Cpwd)
{
driver.findElement(By.xpath("//button[text()='Create account']")).click();	
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
driver.findElement(By.id("(//input[@id='userPassword'])[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("(//input[@id='userPassword'])[2]")).sendKeys(Cpwd);
		driver.findElement(By.xpath("//button[text()='Create account ']")).click();
Reporter.log("USer is successfully register to telecom page",true);
}



@DataProvider(name="teleReg")
public String[][] data() throws EncryptedDocumentException, IOException{
	File file=new File("./testData/testData.xlsx");
	FileInputStream fis=new FileInputStream(file);
Workbook ref = WorkbookFactory.create(file);
 int rows = ref.getSheet("TelecomReg").getPhysicalNumberOfRows();
int columns = ref.getSheet("TelecomReg").getRow(0).getPhysicalNumberOfCells();
 System.out.println(rows);
 System.out.println(columns);
 String data[][]=new String[rows][columns];
 for(int i=0;i<rows;i++)
 {
	 for(int j=0;j<columns;j++)
	 {
		data[i][j]=ref.getSheet("TelecomReg").getRow(i).getCell(j).toString();
	 }
 }
 
	
	
	return data;
	
}
}
