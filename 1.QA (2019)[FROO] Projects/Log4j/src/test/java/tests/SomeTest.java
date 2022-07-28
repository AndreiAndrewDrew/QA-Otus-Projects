package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SomeTest extends BaseTest {

  @Test
  public void someTest() {

    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("Ma Long");
    driver.findElement(By.name("btnK")).click();
  }
}