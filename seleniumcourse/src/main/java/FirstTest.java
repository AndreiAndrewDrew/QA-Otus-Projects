import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    /*WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("table tennis Ma Long");
    searchBox.submit();*/

    driver.quit();

  }
}
