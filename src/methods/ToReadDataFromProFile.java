package methods;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromProFile {
@Test
public void launchBrowser() throws IOException {
	WebDriver driver=new ChromeDriver();
	UtilityMethod um=new UtilityMethod();
	 String url = um.readingTheDataFromPropFile("./testData/Data.Properties","url");
	 driver.manage().window().maximize();
	driver.get(url);
	
}
public void launchBrowserwithexcel() throws IOException {
	WebDriver driver=new EdgeDriver();
	UtilityMethod um=new UtilityMethod();
	String url = um.readingDataExcelSingleValue("./testData/testData.xlsx", "Data", 0, 1);
	driver.manage().window().maximize();
	driver.get(url);
	
}
public void launchBrowserwithexcelwithrow() throws IOException {
	WebDriver driver=new EdgeDriver();
	UtilityMethod um=new UtilityMethod();
	String url =um.readingRowDataExcelSingleValue("./testData/testData.xlsx", "Sheet1", )
	driver.manage().window().maximize();
	driver.get(url);
	
}

}
