package constants;

import java.time.Duration;

public class Constant {
  public static class TimeoutVariabiles{
    public static final int IMPLICIT_WAIT = 5;
    public static final int EXPLICIT_WAIT = 10;
  }

  public static class Urls{
    public static final String MOBILE_PAYMENT = "https://epayments.orange.md/?l=2";
  }

  public static class PhoneReplenismentTestData{
    public static final String MOBILE_NUMBER = "068328893";
    public static final String AMOUNT = "25";
  }
}
