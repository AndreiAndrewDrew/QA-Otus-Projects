import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FirstTest {
  @Test
  public void testSearchGoogle() {

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

/* getAtrtribute from Propreties
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.navigate().to("https://www.netflix.com/md-en/");
    WebElement buttonLogin = wait.until(ExpectedConditions
            .presenceOfElementLocated(By.xpath("//a[@class='authLinks redButton']")));
    String textContentButton = buttonLogin.getAttribute("textContent");
    System.out.println("textContentButton->" + textContentButton);
    Assert.assertEquals("Sign In",textContentButton);
*/

/* Driver-Settings-Logs
    driver.get("http://google.com/222223231");
    driver.manage().window().maximize();
//    WebElement searchBox = driver.findElement(By.name("q"));
//    searchBox.sendKeys("table tennis Ma Long");
//    searchBox.submit();

    Set<String> allLogsType = driver.manage().logs().getAvailableLogTypes();
    System.out.println("allLogsType->" + allLogsType);

    LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
    for (LogEntry entry : logs) {
      System.out.println("logs->" + entry);
    }
*/

    driver.get("http://google.com");
    WebElement conectButton = driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_7d gb_7c']"));
    conectButton.click();

//    driver.quit();

  }
}
