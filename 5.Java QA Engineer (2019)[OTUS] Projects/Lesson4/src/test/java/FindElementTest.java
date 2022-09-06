import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementTest extends BaseTest {
  Logger logger = LogManager.getLogger(FindElementTest.class);

  //session/{session id}/element/{element id}/element
  @Test
  public void findElements() {
    driver.get("https://www.google.com/search?source=hp&ei=QFkDXdu5POHFrgSDvZroAw&q=selenium&oq=seleniu&gs_l=psy-ab.3.0.0l10.1135.2750..4142...0.0..0.430.2527.2-1j5j1......0....1..gws-wiz.....0..0i131.f1AHtH5RWTc");
    WebElement searchContainer = driver.findElement(By.cssSelector("#res"));

    List<WebElement> results = searchContainer.findElements(By.cssSelector(".MjjYud"));

    //logger.info("Count results: {}", results.size());
    System.out.println("Count results: " + results.size());
  }
}

