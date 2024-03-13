package testng_Batch;


	import java.time.Duration;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class To_launch_oneplus {
		@Test(groups = "mob")
		public void launchDemo() {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.oneplus.in/store");
			driver.quit();
		}

	
}
