package Scripts;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrowserCommandAssigment {
	WebDriver driver;
  @Test
  public void browserCommandMethods() throws InterruptedException {
	  driver.get("http://selenium-examples.nichethyself.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.navigate().refresh(); //refresh the page
	  driver.navigate().to("http://www.google.com"); //ditto - driver.get() 
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().forward();
	  Thread.sleep(3000);
	 // driver.navigate().to("http:/www.yahoo.com");
	  String whereAmICurrently = driver.getCurrentUrl();
	  System.out.println(whereAmICurrently);
	  Thread.sleep(3000);
	 // String myPageSourceCode = driver.getPageSource();
	 // System.out.println(myPageSourceCode);
	 // driver.manage().deleteAllCookies();
	  
	 //More Methods for Bowser
	 Dimension dimentions= driver.manage().window().getSize();
	 System.out.println(dimentions);
	 Thread.sleep(3000);
	 driver.manage().window().setSize(new Dimension (700,700));
	 //driver.manage().window().setPosition(new Point(1100,500));
	 System.out.println(" New Setted value :"+driver.manage().window().getSize());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test method");
	  System.setProperty("webdriver.chrome.driver", "Test//Resources//chromedriver.exe");
		 driver= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
