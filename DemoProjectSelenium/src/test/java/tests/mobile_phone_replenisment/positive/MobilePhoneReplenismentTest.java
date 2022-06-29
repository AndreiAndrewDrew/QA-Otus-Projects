package tests.mobile_phone_replenisment.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.MOBILE_PAYMENT;

public class MobilePhoneReplenismentTest extends BaseTest {

  @Test
  public void testMobilePhoneReplenisment(){
    basePage.goToUrl(MOBILE_PAYMENT);
  }
}
