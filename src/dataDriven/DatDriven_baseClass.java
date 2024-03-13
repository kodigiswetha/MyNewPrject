package dataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DatDriven_baseClass {
public static WebDriver driver;
@BeforeSuite
public void DatabaseStar() {
	Reporter.log("Data base connection started",true);
	Reporter.log("Extend report formation started",true);
}
@AfterSuite
public void DatabaseSopped() {
	Reporter.log("Data base connection stopped",true);
	Reporter.log("Extend report formation end",true);
}
@BeforeMethod
public void browserSetup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://timetracker.ctepl.com/actitime/login.jsp");
	Reporter.log("User is able to open the timetracker");	
}
@AfterMethod
public void BrowserClose() {
	driver.quit();
}
}
