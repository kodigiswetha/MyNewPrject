package workingwithTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class DataProviderDemoWebShop {
	public static WebDriver driver;
@Test(dataProvider = "data")
public void acttime(String un,String pwd) throws InterruptedException
{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://timetracker.ctepl.com/actitime/login.do");
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pwd);
driver.findElement(By.id("loginButton")).click();
driver.quit();

	
}
@DataProvider(name="data")
public String[][] dataset(){
String[][]data= {{"Mani","kantan2"},{"Skandha","Chinu12"},{"Chikku","chicha123"}};
return data;
}
}
