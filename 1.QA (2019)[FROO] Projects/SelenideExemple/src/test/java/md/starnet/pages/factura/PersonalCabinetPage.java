package md.starnet.pages.factura;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PersonalCabinetPage {

  public void clickMenuInternet() {
    $(By.linkText("Internet")).click();
  }

  public void clickMenuFactura() {
    $(By.linkText("Factura")).click();

  }

  public boolean isFacturaTableVisible(){
    return $(By.className("gridtable")).isDisplayed();
  }

  public int getCountFacturi(){
    return $$(By.linkText("Descarcă")).size();
  }
}
