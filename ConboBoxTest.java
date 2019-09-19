package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ConboBoxTest {
	WebDriver webDriver;

/*	@Test
	public void nTLoginTest() {
		webDriver.get("http://selenium-examples.nichethyself.com/");

		webDriver.findElement(By.id("loginname")).sendKeys("stc123");
		webDriver.findElement(By.id("loginpassword")).sendKeys("12345");
		webDriver.findElement(By.id("loginbutton")).click();

		String expectedTitleAfterLogin="My account1";
		String actualTitleAfterLogin=webDriver.getTitle();

		if(actualTitleAfterLogin.equals(expectedTitleAfterLogin))
			System.out.println("Login Test Passed");
		else
			System.out.println("Login Test Passed");

		//Assert.assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
		//assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin);
		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "Page title did not match");		
	}*/

	@Test
	public void testGoogleSearch() throws InterruptedException{

		webDriver.get("https://cookbook.seleniumacademy.com/Config.html");
		List<WebElement> comboList=webDriver.findElements(By.name("make"));
		System.out.println("No. of elements : "+comboList.size());
		Thread.sleep(5000);
	}

	@BeforeClass
	public void beforeClass() {
		/*System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		webDriver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		webDriver=new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		webDriver.quit();
	}
}
