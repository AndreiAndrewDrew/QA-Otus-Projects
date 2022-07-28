package tests;

import listeners.TestListener;
import listeners.WebDriverListener;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

  public WebDriver driver;
  public WebDriverWait wait;
  int timeout = 30;

  @BeforeClass
  public void beforeTest() {
    BasicConfigurator.configure();

    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");
//    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.setHeadless(true);
    driver = new ChromeDriver(/*chromeOptions*/);

    EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
    eventFiringWebDriver.register(new WebDriverListener());

    driver = eventFiringWebDriver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

  }

  @AfterClass
  public void afterClass() {
    driver.quit();
  }
}
