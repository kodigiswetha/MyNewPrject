package methods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromCell {
@Test
public void login() throws IOException {
	WebDriver driver=new ChromeDriver();
	ReadTheDataExtenalFile u=new ReadTheDataExtenalFile();
	driver.manage().window().maximize();
driver.get(u.readingTheDataFromPropFile("./testData/Data.Properties", "loginurl"));

String[] loginData = u.readingRowDataFromExcel("./testData/tesData.xlsx", "loginData1", 0);
driver.findElement(By.id("Email")).sendKeys(loginData[0]);
driver.findElement(By.id("Password")).sendKeys(loginData[1]);
driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
