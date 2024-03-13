package testngProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_001 extends BaseClass {
@Test
public void ValidateThatUSerIsAbleToClickOnShoopingCartalink() throws InterruptedException
{
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	checkbox.remove(checkbox.size()-1);
	for (WebElement web : checkbox) {
		web.click();
		Thread.sleep(2000);
		//input[@value='Continue shopping']
		
	}
	driver.findElement(By.xpath("//input[@value='Continue shopping']")).click();

	
	Reporter.log("User is able to click on shoppingCart link",true);
	Reporter.log("User is able to click on continue shoping sucessfully",true);
}
}
