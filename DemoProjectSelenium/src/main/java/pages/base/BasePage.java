package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class BasePage {

  WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public void goToUrl(String url){
    driver.get(url);
  }

  public WebElement waitElementIsVisible(WebElement element){
    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    return element;
  }
}
