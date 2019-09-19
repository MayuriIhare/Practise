package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class FirstTestNGTest {
	WebDriver webDriver;

	@Test
	public void nTLoginTest() {
		webDriver.get("http://selenium-examples.nichethyself.com/");

		webDriver.findElement(By.id("loginname")).sendKeys("stc123");
		webDriver.findElement(By.id("loginpassword")).sendKeys("12345");
		webDriver.findElement(By.id("loginbutton")).click();

		String expectedTitleAfterLogin="My account1";
		String actualTitleAfterLogin=webDriver.getTitle();

		/*if(actualTitleAfterLogin.equals(expectedTitleAfterLogin))
			System.out.println("Login Test Passed");
		else
			System.out.println("Login Test Passed");*/

		//Assert.assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
		//assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "Page title did not match");		
	}

	@Test
	public void testGoogleSearch() throws InterruptedException{

		webDriver.get("https://www.google.com/");
		webDriver.findElement(By.name("q")).sendKeys("Jobs in Selenium");
		Thread.sleep(5000);
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		webDriver=new FirefoxDriver();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Inside After Method");
	}

	@AfterClass
	public void afterClass() {
		webDriver.quit();
	}
}
