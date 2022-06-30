package constants;

import java.time.Duration;

public class Constant {
  public static class TimeoutVariabiles{
    public static final int IMPLICIT_WAIT = 5;
    public static final Duration EXPLICIT_WAIT =  Duration.ofSeconds(10);
  }

  public static class Urls{
    public static final String MOBILE_PAYMENT = "https://epayments.orange.md/?l=2";
    public static final String CAR_LEASING_CALCULATOR = "https://leasing.md/calculator/";
  }

  public static class PhoneReplenismentTestData{
    public static final String MOBILE_NUMBER = "068328893";
    public static final String AMOUNT = "25";
  }

  public static class CarLeasingTestData{
    public static final String CAR_PRICE = "25000";
    public static final String TERM_CAR_MONTHS = "25";
  }
}
