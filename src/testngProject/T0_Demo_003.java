package testngProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class T0_Demo_003 extends BaseClass {
@Test
public void subscribe()
{
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Reporter.log("User is able to send the data into the serach field",true);
	
}
}
