package md.starnet.pages.components;

import com.codeborne.selenide.ElementsContainer;
import md.starnet.pages.factura.PersonalCabinetPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginBlock extends ElementsContainer {
  private static final By MYSTARNETMD_LOGIN = By.xpath("//input[@name='login']");
  private static final By MYSTARNETMD_PASSWORD = By.xpath("//input[@name='pass']");
  public void inputToLogin(String login) {
    $(MYSTARNETMD_LOGIN).setValue(login);
  }

  public void inputToPassword(String password) {
    $(MYSTARNETMD_PASSWORD).setValue(password);
  }

  public void clickOnButtonLogin() {
    $x("//input[@name='submit']").click();
  }
}
