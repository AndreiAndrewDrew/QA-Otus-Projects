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
//    driver.get("http://google.com");
//    driver.manage().window().maximize();

    /* Method findElement()
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("table tennis Ma Long");
    searchBox.submit();
*/

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

/* Actions with elements click and submit
    driver.navigate().to("https://www.facebook.com/");
//    WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
//    loginButton.submit();

    WebElement createAccButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    createAccButton.click();
*/

/* sendKeys an clear
    driver.navigate().to("file:///D:/1.Andrew%20Work/1.QA%20Tester%20Projects/seleniumcourse/example.html");
    WebElement inputField = driver.findElement(By.xpath("//input[@id='myText']"));
    inputField.clear();
    inputField.sendKeys("Text Exemple");
*/
/* sendKeys()--> upload files "example.html"
    driver.navigate().to("https://www.file.io/");
    WebElement inputField = driver.findElement(By.xpath("//input[@id='upload-button']"));
    inputField.sendKeys("d:\\1.Andrew Work\\1.QA Tester Projects\\seleniumcourse\\example.html");
*/

//    driver.quit();

  }
}
