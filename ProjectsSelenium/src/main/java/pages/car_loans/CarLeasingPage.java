package pages.car_loans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.mobile_phone_replenisment.MobilePhoneReplenismentPage;

public class CarLeasingPage extends BasePage {

  public CarLeasingPage(WebDriver driver) {
    super(driver);
  }

  private final By priceCar = By.xpath("//input[@id='slider_price_label']");

  private final By termCar = By.xpath("//input[@id='slider_termen_label']");

  private final By graphButton = By.xpath("//a[@id='grafic_button']");

  public CarLeasingPage enterPriceCar(String price) {
    driver.findElement(priceCar).sendKeys((CharSequence) Keys.CONTROL, (CharSequence) "a");
    driver.findElement(priceCar).sendKeys(Keys.DELETE);
    driver.findElement(priceCar).sendKeys(price);
    return this;
  }

  public CarLeasingPage enterTermCar(String term) {
    driver.findElement(termCar).sendKeys((CharSequence) Keys.CONTROL, (CharSequence) "a");
    driver.findElement(termCar).sendKeys(Keys.DELETE);
    driver.findElement(termCar).sendKeys(term);
    return this;
  }

  public CarLeasingPage clickGraphButton() {
    driver.findElement(graphButton).click();
    return this;
  }

}
