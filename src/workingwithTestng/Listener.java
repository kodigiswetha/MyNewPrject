package workingwithTestng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ListernerDemo.class)
public class Listener {
	public static WebDriver driver;
	@Test
public void demologin() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	SoftAssert soft=new SoftAssert();
	String exptecturl = "https://demowebshop.tricentis.co/login";
	 String actualurl = driver.getCurrentUrl();
	 soft.assertEquals(actualurl, exptecturl,"It is not a logi url");
	 driver.quit();
	 soft.assertAll();
}
}
