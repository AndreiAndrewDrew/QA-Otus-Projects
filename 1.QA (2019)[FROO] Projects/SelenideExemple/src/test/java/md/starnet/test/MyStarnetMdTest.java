package md.starnet.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MyStarnetMdTest {

  @Test
  public void gmailComTest() {
    Configuration.browser = "chrome";
    Configuration.timeout = 5000;

    WebDriverManager.chromedriver().setup();

    /* old method
    System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver.exe");
    */

    /* Example with google.com
    open("https://www.google.com/");
    $x("//input[@name='q']").setValue("ma long").pressEnter();
    */

    open("https://my.starnet.md/");

    $x("//input[@name='login']").setValue("63041");
    $x("//input[@name='pass']").setValue("Drewdrewstarnet1").pressEnter();
    $(By.linkText("Internet")).click();
    $(By.linkText("Factura")).click();
    $$(By.linkText("Descarcă")).shouldHave(CollectionCondition.size(7));

  }
}
