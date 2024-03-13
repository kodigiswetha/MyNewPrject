package workinwithPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Reg_001 extends Base_class {
@Test
public void register() throws InterruptedException {
	/*RegisterPage register=new RegisterPage(driver);
	register.getRegisterlink().click();
	register.getFemaileradiobutton().click();
	register.getFirstnametext().sendKeys("Raju");
	register.getLastnametext().sendKeys("bnda");
	register.getEmaildtext().sendKeys("raj12@gmail.com");
	register.getPassword().sendKeys("Reaju12@");
	register.getConfirmpaswordtext().sendKeys("Raju12@");
	register.getRegisterbutton().click();
	Reporter.log("User is sucessfully register on DemoWEbpage",true);*/
	Basepage base=new Basepage(driver);
	Actions ac=new Actions(driver);
	ac.clickAndHold(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).build().perform();

	//base.getNotebooklink().click();
	Thread.sleep(3000);
	Reporter.log("User is able to click on Accesorieslink",true);
	  Point orderbutton = base.getOrders().getLocation();
	ac.scrollByAmount(orderbutton.getX(), orderbutton.getY()).build().perform();
	base.getOrders().click();
	Reporter.log("User is successfully click on orders lnk",true);
}
}
