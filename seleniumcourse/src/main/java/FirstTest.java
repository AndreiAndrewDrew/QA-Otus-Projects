import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class FirstTest {
  @Test
  public void testSearchGoogle() {

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");
    driver.manage().window().maximize();

/*
    Set<String> oldWindow = driver.getWindowHandles();
    System.out.println("OldWindow->"+oldWindow);

    ((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

    driver.switchTo().window(tabs.get(1));
    driver.get("http://curs.md");

    Set<String> newWindow = driver.getWindowHandles();
    System.out.println("NewWindow->"+ newWindow);

    String window = driver.getWindowHandle();
    System.out.println("Window->"+ window);
*/

/* Method findElement()
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("table tennis Ma Long");
    searchBox.submit();
*/

/* Method getCurrentUrl()
    String currentUrl = driver.getCurrentUrl();
    System.out.println("currentUrl"+currentUrl);
    Assert.assertEquals(currentUrl, "http://google.com");
*/

/* Method getTitle()
    String currentTitle = driver.getTitle();
    System.out.println("currentTitle -> "+currentTitle);
    Assert.assertEquals(currentTitle, "table tennis Ma Long - Căutare Google");
*/

/* Page Actions
    driver.navigate().to("https://curs.md");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().back();
*/

/* Method addCookie
    driver.get("https://github.com/AndreiAndrewDrew");
    Cookie authCookie = new Cookie("user_session",
            "HaKuPQ0vGoNBSKTJdwA_uVQTSojsOGiBTVS0xssB584SXNjP");
    driver.manage().addCookie(authCookie);
    driver.navigate().refresh();
*/

/* Method getCookies()
    driver.get("https://github.com/AndreiAndrewDrew");
    Set<Cookie> cookies = driver.manage().getCookies();
    System.out.println("cookies -> "+ cookies);
*/

/* Method getCookieNamed()
    driver.get("https://github.com/AndreiAndrewDrew");
    Cookie tz = driver.manage().getCookieNamed("tz");
    System.out.println("tz-> " + tz);
*/

/* Method deleteCookieNamed()
    driver.get("https://github.com/AndreiAndrewDrew");
    driver.manage().deleteCookieNamed("tz");
    System.out.println("All Cookies -> " + driver.manage().getCookies());
*/

    driver.quit();

  }
}
