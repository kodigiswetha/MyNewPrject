package workingwithTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TaskSoftassertion {
	WebDriver driver;
	@Parameters ({"browser","url","emailId","pwd"})
	@Test
public  void login(String browser,String url,String emailId,String pwd) throws InterruptedException {

		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else {
			System.out.println("browser is not valid");
		}
	driver.manage().window().maximize();
	Reporter.log("Browser is maximised");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	SoftAssert softassert=new SoftAssert();
	String expectedurl = "https://demowebshop.tricentis.com/login";
	String expectedEmaild = "luky0412@gmail.com";
	 String expectedpwd = "luck0412@";
	 driver.get(url);
		String Actualurl = driver.getCurrentUrl();
		System.out.println(Actualurl);
		softassert.assertEquals(Actualurl, expectedurl,"it is not not login page");
	 WebElement ActuLemailid = driver.findElement(By.id("Email"));
	 ActuLemailid.sendKeys(emailId);
	  ActuLemailid.getAttribute("value");
	 System.out.println( ActuLemailid);
	 softassert.assertEquals(ActuLemailid, expectedEmaild,"email id is not valid email");
	  WebElement actualpd = driver.findElement(By.id("Password"));
	  actualpd.sendKeys(pwd);
	  softassert.assertEquals(actualpd, expectedpwd,"it is not not pwd");
	  System.out.println(pwd);
	  
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(3000);
	 
	  driver.quit();
	  softassert.assertAll();
	 
}
}
