package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadTheDataFromtheExcelUsingDataProvider {
@DataProvider
public String [][] regsitrationDAta() throws EncryptedDocumentException, IOException{
	File file=new File("./testData/testData.xlsx");
	FileInputStream fis=new FileInputStream(file);
	 Workbook ref = WorkbookFactory.create(fis);
	 int numofRows = ref.getSheet("Registration").getPhysicalNumberOfRows();
	int numofclm = ref.getSheet("Registration").getRow(0).getPhysicalNumberOfCells();
	System.out.println(numofRows);
	System.out.println(numofclm);
	String[][] data=new String[numofRows][numofclm];
	for(int i=0;i<numofRows;i++) {
		for(int j=0;j<numofclm;j++) {
			data[i][j]=ref.getSheet("Registration").getRow(i).getCell(j).toString();
			
		}
	}
	
	return data;
}

@Test(dataProvider = "Regidata")
public void regation(String[] dataToReg)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("")).click();
	if(dataToReg[0].equalsIgnoreCase("female")) {
		driver.findElement(By.id("")).click();
	}
	else {
		driver.findElement(By.id("")).click();
	}
	driver.findElement(By.id("")).sendKeys("apoorva");
	
	
}


}
