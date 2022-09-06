import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;

public class GetTextTest extends BaseTest {
  private static final Logger logger = LogManager.getLogger(GetTextTest.class);

  //session/{session id}/element/{element id}/text
  @Test
  public void getText() {
    driver.get("https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/WebElement.html");
    String h2 = driver.findElement(By.cssSelector("h2")).getText();

//    logger.info("h2 content: {}", h2);
    System.out.println("h2 content: " + h2);

    String header = driver.findElement(By.cssSelector(".header")).getText();

//    logger.info("header content: {}", header);
//    logger.info("returns an element’s text 'as rendered'");
    System.out.println("header content: " + header);
  }

  @Test
  public void getInputText() throws InterruptedException {
    driver.get("https://ya.ru");
    String text = driver.findElement(By.cssSelector("#text")).getText();

//    logger.info("Content: {}", text);
    System.out.println("Content: " + text);

    driver.findElement(By.cssSelector("#text")).sendKeys("O", "t", "u", "s", " test  ");
    text = driver.findElement(By.cssSelector("#text")).getText();

//    logger.info("Content: {}", text);
//    logger.warn("Why it;s still empty?");
    System.out.println("Content: " + text);

    //De la INPUT se ia TEXTUL prin--> getAtribute("value")
    WebElement textInput = driver.findElement(By.cssSelector("#text"));
    System.out.println("Content: " + textInput.getAttribute("value"));
  }
}

