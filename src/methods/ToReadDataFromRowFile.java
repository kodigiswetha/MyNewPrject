package methods;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromRowFile {
@Test
public void launchBrowser() throws IOException {
	WebDriver driver=new ChromeDriver();
	ReadTheDataExtenalFile um=new ReadTheDataExtenalFile();
	 driver.get(um.readingTheDataFromPropFile("./testData/Data.Properties", "loginurl"));
	 driver.manage().window().maximize();
	String[] logindata = um.readingRowDataExcelSingleValue("./testData/testData.xlsx", "loginData1", 0);
	 driver.findElement(By.id("Email")).sendKeys(logindata[0]);
	 driver.findElement(By.id("Password")).sendKeys(logindata[1]);
}	
}