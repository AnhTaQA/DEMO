package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Lession01_PushAndPullCode {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("WebDriver.firefox.driver", "E:\\Software\\Copy of eclipse-java-photon-R-win32-x86_64\\Workspace\\WEBDRIVER_API\\lib\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://github.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void f() {
	  System.out.println("Start test");
	  System.out.println("Start test");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
