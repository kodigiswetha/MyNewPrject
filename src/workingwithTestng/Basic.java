package workingwithTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
@Test
 public void register() {
	Reporter.log("user is able to regsiter",true);
	}
@Test
public void demo() {
	
	Reporter.log("hello testng",true);
}
@Test
public void cart() {
	
	Reporter.log("user is able to add the cart",true);
}
@Test
public void login() {
	
	Reporter.log("User is able to login ",true);
}
}
