package tests.car_loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.CarLeasingTestData.CAR_PRICE;
import static constants.Constant.CarLeasingTestData.TERM_CAR_MONTHS;
import static constants.Constant.PhoneReplenismentTestData.AMOUNT;
import static constants.Constant.PhoneReplenismentTestData.MOBILE_NUMBER;
import static constants.Constant.Urls.CAR_LEASING_CALCULATOR;
import static constants.Constant.Urls.MOBILE_PAYMENT;

public class CarLeasingTest extends BaseTest {

  @Test
  public void testCarLeasing() {
    basePage.goToUrl(CAR_LEASING_CALCULATOR);
    carLeasingPage.enterPriceCar(CAR_PRICE);
    carLeasingPage.enterTermCar(TERM_CAR_MONTHS);
    carLeasingPage.clickGraphButton();
    /*mobilePhoneReplenisment
            .enterPhoneNumber(MOBILE_NUMBER).enterAmount(AMOUNT);
    mobilePhoneReplenisment.checkBoxClick();
    mobilePhoneReplenisment.buttonNextClick();*/
  }
}
