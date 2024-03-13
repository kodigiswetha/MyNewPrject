package teleCom;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Telecom_Logout extends telecom_baseclass {
@Test(dataProvider = "logincrds")
public void login (String email,String pwd) {
	Reporter.log("user is able to open the login page",true);
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(pwd);

}
public void logout() {
	driver.findElement(By.name("logout")).click();
}
}
