package listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

  Logger logger = Logger.getLogger(TestListener.class);

  public void onTestStart(ITestResult iTestResult) {
    logger.info("SomeTest Started");
  }

  public void onTestSuccess(ITestResult iTestResult) {

  }

  public void onTestFailure(ITestResult iTestResult) {

  }

  public void onTestSkipped(ITestResult iTestResult) {

  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

  }

  public void onStart(ITestContext iTestContext) {

  }

  public void onFinish(ITestContext iTestContext) {
    logger.info("Finish Test");
  }

}
