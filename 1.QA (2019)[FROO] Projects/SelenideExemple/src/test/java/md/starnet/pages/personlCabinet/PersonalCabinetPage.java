package md.starnet.pages.personlCabinet;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import md.starnet.pages.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PersonalCabinetPage extends BasePage <PersonalCabinetPage> {

  public void clickMenuInternet() {
    $(By.linkText("Internet")).click();
  }

  public PersonalCabinetPage accesMenuInternet() {
    $(By.linkText("Internet")).click();
    return this;
  }

  public void clickMenuFactura() {
    $(By.linkText("Factura")).click();

  }
  public PersonalCabinetPage accesMenuFactura() {
    $(By.linkText("Factura")).click();
    return this;

  }
  public boolean isFacturaTableVisible(){
    return $(By.className("gridtable")).isDisplayed();
  }

  public PersonalCabinetPage checkContainerWithFacturesIsVisibile(){
    $(By.className("gridtable")).should(Condition.visible);
    return this;
  }

  public int getCountFacturi(){
    return $$(By.xpath("//a[@target='_blank']")).size();
  }

  public PersonalCabinetPage checkFacturaIsCount(int size){
    $$(By.xpath("//a[@target='_blank']")).shouldHave(CollectionCondition.size(size));
    return this;
  }
}
