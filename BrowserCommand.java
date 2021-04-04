package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class BrowserCommand {
	WebDriver driver;
  @Test
  public void DropdownMethods() throws InterruptedException {
	  System.out.println("Testing Done for all Browser Commands");
	  driver.get("http://selenium-examples.nichethyself.com/customised.html");
	 driver.manage().window().fullscreen(); // shows the full screen view.
	 
	 
	 WebElement myDropDown = driver.findElement(By.id("days"));
	 Select myMakeDropDown = new Select(myDropDown);
	 myMakeDropDown.selectByVisibleText("3-star Hotel");
	 Thread.sleep(3000);
	 myMakeDropDown.deselectByIndex(2);
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test method");
	  System.setProperty("webdriver.chrome.driver", "Test//Resources//chromedriver.exe");
	 driver= new ChromeDriver(); //opens a web browser
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test method");
	 // driver.quit();
  }

}
