package testngProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Demo_002 extends BaseClass {
@Test
public void Poll() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
	Reporter.log("User is able to click on ratio button",true);
driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
Thread.sleep(3000);
Reporter.log("USer is successfully vote is community poll",true);

}
}
