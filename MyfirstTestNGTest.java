package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyfirstTestNGTest {
	WebDriver driver;
  @Test
  public void loginToNicheThyselfWebsite() {
	  System.out.println("The loginThyselfWebsite test");
	  driver.get("http://selenium-examples.nichethyself.com/");
		driver.findElement(By.id("loginname")).sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		String expectedpage="My account";
		String actualpage=driver.getTitle();
		Assert.assertEquals(actualpage, expectedpage);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test method");
	  System.setProperty("webdriver.chrome.driver", "Test//Resources//chromedriver.exe");
		 driver= new ChromeDriver(); //opens a web browser.
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test method");
	  driver.quit();
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Test Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Test Class");
  }
}
