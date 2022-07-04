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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.car_loans.CarLeasingPage;
import pages.mobile_phone_replenisment.MobilePhoneReplenismentPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
  protected WebDriver driver = CommonActions.createDriver();
  protected BasePage basePage = new BasePage(driver);
  protected MobilePhoneReplenismentPage mobilePhoneReplenisment =
          new MobilePhoneReplenismentPage(driver);
  protected CarLeasingPage carLeasingPage = new CarLeasingPage(driver);

  private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

  static {
    LOGGER.info("Start Time: "+ LocalTime.now());
    LOGGER.info("Start Clear Reports Dir: build/reports/tests");
    File alllureResult = new File("allure-results");
    if (alllureResult.isDirectory()){
      for (File item : Objects.requireNonNull(alllureResult.listFiles()))
      item.delete();
    }
    if (CLEAR_REPORTS_DIR){
      File alllureScreenshots = new File("build/reports/tests/");
      for (File item : Objects.requireNonNull(alllureScreenshots.listFiles()))
        item.delete();
    }
  }

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
