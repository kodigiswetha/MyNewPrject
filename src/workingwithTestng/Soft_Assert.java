package workingwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void demoweb() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser is open",true);
		SoftAssert softassert=new SoftAssert();
		String expectedurl = "https://demowebshop.tricentis.com/login";
		String expectedemailid = "aporva@123";
		driver.get("https://demowebshop.tricentis.com/login");
	 String actualurl = driver.getCurrentUrl();
	 System.out.println(actualurl);
	 softassert.assertEquals(actualurl, expectedurl,"USer is not abble to land on login page");
	 WebElement emailid = driver.findElement(By.id("Email"));
	 emailid.sendKeys("apporva@123");
	String actualemaiid = emailid.getAttribute("value");
	System.out.println(actualemaiid);
	softassert.assertEquals(actualemaiid, expectedemailid,"Email id is not matching");
	softassert.assertAll();

	driver.quit();
	
	}
	}

