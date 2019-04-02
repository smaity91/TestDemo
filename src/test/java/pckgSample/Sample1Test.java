package pckgSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Sample1Test {
	
	@Test
	public void helloWorld() {
		System.out.println("Hello world again!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void launchURL() {
		System.setProperty("webdriver.chrome.driver",
	            "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");

		Assert.assertFalse(driver.getTitle().equalsIgnoreCase("My Store"));
		
		driver.close();
	}
	


}
