import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class HomeWorkL4Test extends BaseTest {


  ///session/{session id}/element/{element id}/clear
  @Test
  public void creationProjectTest() {

    driver.get("http://testlink/index.php");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("admin");
    driver.findElement(By.name("tl_password")).clear();
    driver.findElement(By.name("tl_password")).sendKeys("admin");
    driver.findElement(By.name("login_submit")).click();


    driver.switchTo().frame("mainframe");
    driver.findElement(By.linkText("Test Project Management")).click();

    driver.findElement(By.name("create")).click();

    driver.findElement(By.name("tprojectName")).sendKeys("AndrewProject1");
    driver.findElement(By.name("tcasePrefix")).sendKeys("a001");

    driver.findElement(By.name("active")).isSelected();
    driver.findElement(By.name("is_public")).isSelected();

    driver.findElement(By.name("doActionButton")).click();
  }

  @Test
  public void verifyProjectTest() {

    driver.get("http://testlink/index.php");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("admin");
    driver.findElement(By.name("tl_password")).clear();
    driver.findElement(By.name("tl_password")).sendKeys("admin");
    driver.findElement(By.name("login_submit")).click();

    driver.switchTo().frame("mainframe");
    driver.findElement(By.linkText("Test Project Management")).click();

    driver.findElement(By.linkText("AndrewProject1")).click();
    WebElement prefixForm = driver.findElement(By.name("tcasePrefix"));
    String prefix1 = prefixForm.getAttribute("value");
    System.out.println("prefixul din Forma = " + prefix1);
    driver.findElement(By.name("go_back")).click();

    WebElement prefixTable = driver.findElement(By.xpath("//*[@id=\"item_view\"]/tbody/tr[1]/td[3]"));
    String prefix2 = prefixTable.getAttribute("outerText");
    System.out.println("prefixul din tabel = " + prefix2);

    assertEquals(prefix1, prefix2);


  }


}
