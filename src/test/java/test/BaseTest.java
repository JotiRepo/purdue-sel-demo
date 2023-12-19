package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	/*@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
*/
}
