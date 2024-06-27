package tests.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(css = "#content_left > div.content__top > div.fact.card.card_size_big > div.fact__temp-wrap > a > div" +
            " > div.temp.fact__temp.fact__temp_size_s > span")
    private WebElement spanTemp;

    public MainPage() {
        driver.get("https://yandex.ru/pogoda");
        PageFactory.initElements(driver, this);
    }

    public String createTemp() {
        return spanTemp.getText();
    }
}
