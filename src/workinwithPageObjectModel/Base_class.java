package workinwithPageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_class {
 public static WebDriver driver;
@BeforeMethod
public void launchbrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("User is successfully open the browser",true);
	
}
@AfterMethod
public void close() {
	driver.quit();
	Reporter.log("User is successfully quit the browser",true);
}

}
