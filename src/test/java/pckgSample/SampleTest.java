package pckgSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SampleTest {
	
	@Test
	public void helloWorld() {
		System.out.println("Hello world!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void launchURL() {
		System.setProperty("webdriver.chrome.driver",
	            "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"));
		
		driver.close();
	}
	


}
