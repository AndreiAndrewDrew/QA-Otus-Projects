package md.starnet.pages;

import md.starnet.pages.components.LoginBlock;
import md.starnet.pages.personlCabinet.PersonalCabinetPage;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage<MainPage> {

  LoginBlock loginBlock = new LoginBlock();

  public static MainPage enterToMainPage(){
    open("https://my.starnet.md/");
    return page(MainPage.class);
  }

  public MainPage inputToLogin(String login) {
   loginBlock.inputToLogin(login);
   return this;
  }

  public MainPage inputToPassword(String password) {
    loginBlock.inputToPassword(password);
    return this;
  }

  public PersonalCabinetPage clickOnButtonLogin() {
    loginBlock.clickOnButtonLogin();
    return page(PersonalCabinetPage.class);
  }

}
