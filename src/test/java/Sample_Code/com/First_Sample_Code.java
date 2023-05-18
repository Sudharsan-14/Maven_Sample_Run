package Sample_Code.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class First_Sample_Code {
	public WebDriver driver;
	
	@Test
	public void Test_run() throws Throwable {
		
		Thread.sleep(2000);
		// Call the chrome driver
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Automation\\WebPOS\\chromedriver.exe");
		// Open the Chrome window
		driver = new ChromeDriver();
		
		// Wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the Chrome window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Launch the URL
		driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fstart.atlassian.com%2F&application=start");
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}
	
	
	

}
