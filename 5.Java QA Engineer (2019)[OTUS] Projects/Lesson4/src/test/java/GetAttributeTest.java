import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetAttributeTest extends BaseTest {
  private static final Logger logger = LogManager.getLogger(GetAttributeTest.class);

  //session/{session id}/element/{element id}/attribute/{name}
  @Test
  public void getAttribute() {
    driver.get("https://google.com/");
    WebElement logo = driver.findElement(By.cssSelector(".lnXdpd"));

//    logger.info("Src: {}", logo.getAttribute("src"));
//    logger.info("Name: {}", logo.getAttribute("localName"));
//    logger.info("HTML: {}", logo.getAttribute("outerHTML"));
    System.out.println("SrcLogo: " + logo.getAttribute("src"));
    System.out.println("NameLogo: " + logo.getAttribute("localName"));
    System.out.println("HtmlLogo: " + logo.getAttribute("outerHTML"));
    System.out.println("WidthLogo: " + logo.getAttribute("width") + "px");
    System.out.println("HeightLogo: " + logo.getAttribute("height") + "px");

  }

  @Test
  public void getHref() {
    driver.get("https://google.com/");
    WebElement logo = driver.findElement(By.linkText("Картинки"));
    String href = logo.getAttribute("href");

    //    logger.info("HREF: {}", href);
    System.out.println("HREF: " + href);

    assertThat(href, startsWith("https://www.google.md/imghp?hl=ru&ogbl"));


  }

  @Test
  public void getBooleanAttribute() {
    driver.get("https://github.com/join");
    WebElement logo = driver.findElement(By.cssSelector("#signup_button"));

//    logger.info("Disabled: {}", logo.getAttribute("disabled"));
//    logger.info("Readonly: {}", logo.getAttribute("readonly"));
//    logger.info("It's 'true' or null only");
    System.out.println("Disabled: " + logo.getAttribute("disabled"));
    System.out.println("Readonly: " + logo.getAttribute("readonly"));
    System.out.println("It's 'true' or null only");
  }


}

