package workingwithTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
WebDriver driver;
@Parameters({"browserName","url"})
@Test
public void browser(String browserName,String url) throws InterruptedException {
	if(browserName.equals("Chrome")) {
		driver=new ChromeDriver();
	}
	else if(browserName.equals("Edge")) {
		driver=new EdgeDriver();
	}
	else if(browserName.equals("firefox")) {
		driver=new FirefoxDriver();
	}else {
		System.out.println("browser is not valid");
	}
	driver.manage().window().maximize();
	
	driver.get(url);
	Thread.sleep(3000);
	driver.quit();
}
}
