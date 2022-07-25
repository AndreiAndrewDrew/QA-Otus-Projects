package md.starnet.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import md.starnet.pages.MainPage;
import md.starnet.pages.personlCabinet.PersonalCabinetPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static md.starnet.pages.MainPage.enterToMainPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyStarnetMdTest {

  @Test
  public void myStarnetMdTest() {
    Configuration.browser = "chrome";
//    Configuration.browser = "firefox";
    Configuration.timeout = 5000;
    WebDriverManager.chromedriver().setup();
//    WebDriverManager.firefoxdriver().setup();

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

    closeWebDriver();

  }

  @Test
  public void pageObjectTest(){
//    Configuration.browser = "firefox";
    Configuration.browser = "chrome";
    Configuration.timeout = 5000;
//    WebDriverManager.firefoxdriver().setup();
    WebDriverManager.chromedriver().setup();


    open("https://my.starnet.md/");

    MainPage mainPage = new MainPage();

    mainPage.inputToLogin("63041");
    mainPage.inputToPassword("Drewdrewstarnet1");
    PersonalCabinetPage personalCabinetPage = mainPage.clickOnButtonLogin();

    personalCabinetPage.clickMenuInternet();
    personalCabinetPage.clickMenuFactura();

    assertTrue(personalCabinetPage.isFacturaTableVisible());
    assertEquals(personalCabinetPage.getCountFacturi(),7);

    closeWebDriver();

  }

  @Test
  public void prototype(){
    enterToMainPage()
            .inputToLogin("63041")
            .inputToPassword("Drewdrewstarnet1")
            .clickOnButtonLogin()
            .accesMenuInternet()
            .accesMenuFactura()
            .checkContainerWithFacturesIsVisibile()
            .checkFacturaIsCount(7);

    closeWebDriver();
  }
}
