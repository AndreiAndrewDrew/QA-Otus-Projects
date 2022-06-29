package pages.mobile_phone_replenisment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenismentPage extends BasePage {
  public MobilePhoneReplenismentPage(WebDriver driver) {
    super(driver);
  }

  private final By buttonNext = By.xpath("//input[@id='btPay1']");
  private final By chekBox = By.xpath("//input[@id='cbAgree']");
  private final By inputPhoneNumber =
          By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtPostfix']");
  private final By inputAmount = By.xpath("//input[@id='txtAmount']");


  public MobilePhoneReplenismentPage buttonNextClick() {
    driver.findElement(buttonNext).click();
    return this;
  }

  public MobilePhoneReplenismentPage checkBoxClick() {
    driver.findElement(chekBox).click();
    return this;
  }

  public MobilePhoneReplenismentPage enterPhoneNumber(String numberPhone) {
    driver.findElement(inputPhoneNumber).sendKeys(numberPhone);
    return this;
  }

  public MobilePhoneReplenismentPage enterAmount(String amount) {
    driver.findElement(inputAmount).sendKeys(amount);
    return this;
  }

}
