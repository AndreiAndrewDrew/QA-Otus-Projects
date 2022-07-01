package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.car_loans.CarLeasingPage;
import pages.mobile_phone_replenisment.MobilePhoneReplenismentPage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
  protected WebDriver driver = CommonActions.createDriver();
  protected BasePage basePage = new BasePage(driver);
  protected MobilePhoneReplenismentPage mobilePhoneReplenisment =
          new MobilePhoneReplenismentPage(driver);
  protected CarLeasingPage carLeasingPage = new CarLeasingPage(driver);

  @AfterEach
  void clearCookiesAndLocalStorage() {
    if (CLEAR_COOKIES) {
      JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
      driver.manage().deleteAllCookies();
      javascriptExecutor.executeScript("window.sessionStorage.clear()");
    }
  }

  @AfterAll
  void close() {
    if (!HOLD_BROWSER_OPEN) {
      driver.close();
    }
  }

}
