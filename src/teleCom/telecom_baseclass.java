package teleCom;

import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class telecom_baseclass {
WebDriver driver;
	
@BeforeSuite
public void DatabaseStart()
{
	Reporter.log("Data base connection is stared",true);
	Reporter.log("Extends report formation started",true);
}
@AfterSuite 
public void Databaseend()
{
	Reporter.log("Data base connection is end",true);
	Reporter.log("Extends report formation stopped",true);
}
@BeforeMethod
public void browsersetup() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
	driver.get("https://app.telecrm.in/auth?redirect=%2Fdefaulteid%2Fdashboard");
	
	Reporter.log("User is able to open the Telecom page",true);
	Thread.sleep(3000);
}
@AfterMethod
public void closebrowser() {
	driver.quit();
	Reporter.log("User is able to qutie the telegrampage");
}

}
