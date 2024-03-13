package methods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMutlipleDataFromExcel {
@Test(dataProvider = "data")
public void login(String un, String pw) throws IOException
{
	WebDriver driver=new ChromeDriver();
	ReadTheDataExtenalFile method=new ReadTheDataExtenalFile();
	driver.manage().window().maximize();
	driver.get(method.readingTheDataFromPropFile("./testData/Data.Properties", "loginurl"));
	driver.findElement(By.id("Email")).sendKeys(un);
	 driver.findElement(By.id("Password")).sendKeys(pw);
	 driver.quit();

}
@DataProvider(name="data")
public String[][] dataSupply() throws EncryptedDocumentException, IOException{
return ReadTheDataExtenalFile.readingDataFromMutliplrRowColumn("./testData/testData.xlsx", "Sheet1");
}
}