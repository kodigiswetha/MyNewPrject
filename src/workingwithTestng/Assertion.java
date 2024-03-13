package workingwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
@Test
public void demoweb() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("Browser is open",true);
	String expectedurl = "https://demowebshop.tricentis.com/login";
	String expectedemailid = "aporva@123";
	driver.get("https://demowebshop.tricentis.com/login");
 String actualurl = driver.getCurrentUrl();
 System.out.println(actualurl);
 Assert.assertEquals(actualurl, expectedurl,"USer is not abble to land on login page");
 WebElement emailid = driver.findElement(By.id("Email"));
 emailid.sendKeys("apporva@123");
String actualemaiid = emailid.getAttribute("value");
System.out.println(actualemaiid);
Assert.assertEquals(actualemaiid, expectedemailid,"Email id is not matching");

driver.quit();
}
}
