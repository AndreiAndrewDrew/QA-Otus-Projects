package md.starnet.pages;

import md.starnet.pages.components.LoginBlock;
import md.starnet.pages.factura.PersonalCabinetPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

  LoginBlock loginBlock = new LoginBlock();

  public void inputToLogin(String login) {
   loginBlock.inputToLogin(login);
  }

  public void inputToPassword(String password) {
    loginBlock.inputToPassword(password);
  }

  public PersonalCabinetPage clickOnButtonLogin() {
    loginBlock.clickOnButtonLogin();
    return page(PersonalCabinetPage.class);
  }

}
