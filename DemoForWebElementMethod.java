package ScriptForWebElementMethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class DemoForWebElementMethod {
	WebDriver driver;
	String today;
	
	//Understand The webElement method We use Orange HRM method Here
	//fill the form and show all the content on console.
	
  @Test
  public void WebElemtMethods() throws InterruptedException{
	  
	  Thread.sleep(3000);
	  driver.get("https://demoqa.com/automation-practice-form/");
	  System.out.println("Form loaded Successful");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("firstName")).sendKeys("Supriya");
	  driver.findElement(By.id("lastName")).sendKeys("Joshi");
	  driver.findElement(By.id("userEmail")).sendKeys("Supriya@gmail.com");
	  
	  WebElement radioBtn1= driver.findElement(By.id("gender-radio-2"));
	 ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn1);
	 Thread.sleep(2000);
	 
	  driver.findElement(By.id("userNumber")).sendKeys("123456789");
     
	  //Date picker is not done
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  
	  //WebElement div=driver.findElement(By.id("subjectsContainer"));
	  //div.click().sendKeys("test"); Not working
	  
	  Actions actions = new Actions(driver);
	  actions.moveToElement(driver.findElement(By.xpath("//*[@class='subjects-auto-complete__control css-yk16xz-control']")));
      actions.click();
      Thread.sleep(3000);
      actions.sendKeys("Hello");
      actions.build().perform();
      
      
      WebElement chkBox = driver.findElement(By.id("hobbies-checkbox-3"));
 	 ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", chkBox);
 	 Thread.sleep(2000);
      
 	 
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test method");
	  System.setProperty("webdriver.chrome.driver", "Test//Resources//chromedriver.exe");
	  driver= new ChromeDriver(); //opens a web browser.

  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("After Test method");
	  Thread.sleep(3000);
	// driver.quit();
  }

}
