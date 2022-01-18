package demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Login_Test {
	
	WebDriver driver;
  @Test
  public void search() {
	  
	  driver.findElement(By.name("q")).sendKeys("gkg");
	  System.out.println(driver.getTitle());
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Gireesh\\IBM work\\Selenium Training_IBM\\Soft ware\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
