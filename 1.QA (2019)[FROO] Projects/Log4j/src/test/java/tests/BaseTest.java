package tests;

import listeners.TestListener;
import listeners.WebDriverListener;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

  public WebDriver driver;
  public WebDriverWait wait;
  private BrowserMobProxy proxy;
  int timeout = 10;

  @BeforeClass
  public void beforeTest() {
    BasicConfigurator.configure();

    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.setHeadless(true);

    proxy = new BrowserMobProxyServer();
    proxy.start();

    Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

    chromeOptions.setCapability(CapabilityType.PROXY, seleniumProxy);

    proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
    proxy.newHar("browsermob-test");


    driver = new ChromeDriver();

    EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
    eventFiringWebDriver.register(new WebDriverListener());

    driver = eventFiringWebDriver;

    wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

  }

  @AfterClass
  public void afterClass() throws IOException {
    driver.quit();

    Har har = proxy.getHar();
    proxy.stop();

    har.writeTo(new File("new_har_log.har"));
  }


}
