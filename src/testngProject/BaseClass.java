package testngProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public static  WebDriver driver;
String emial="sunnny123@gmail.com";
String pasword="Sunny123@";

@BeforeSuite
public void dataBaseStart()
{
	Reporter.log("Data base connection started",true);
	Reporter.log("Extends report formation started",true);
}
@AfterSuite
public void dataBAsestoppped() {
	Reporter.log("DataBase connection is stopped",true);
	Reporter.log("Extend report formation end",true);
	
}
@BeforeTest
public void browserSetup() {
	driver=new ChromeDriver();
	Reporter.log("User is able to open empty browser",true);
	driver.manage().window().maximize();
	Reporter.log("User is able to maximaize the browser");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("User is able to open the demowebshop");
	
	
	
}
@AfterTest
public void closedownBrowser()
{
	driver.quit();
	Reporter.log("User is able to close the demowebsop",true);
}
@BeforeMethod
public void login() throws InterruptedException {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(emial);
	driver.findElement(By.id("Password")).sendKeys(pasword);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(3000);
	Reporter.log("User is able to login for webshop",true);
}
@AfterMethod
public void logout() {
	driver.findElement(By.linkText("Log out")).click();
	Reporter.log("User is successfully logout feom demoshop",true);
}
}
