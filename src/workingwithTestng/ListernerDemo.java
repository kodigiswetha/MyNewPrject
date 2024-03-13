package workingwithTestng;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerDemo implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"Test excution is start");
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +"Test excution is ompleted");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() +"Test case is fail");
		TakesScreenshot ts=(TakesScreenshot)Listener.driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./errorShot/webpage.png");
try {
	FileHandler.copy(src,dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
		
		
	}

	

}
