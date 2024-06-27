package tests.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class MainPage {
    private final SelenideElement searchDiv = $x("//div[@id=\"fakeArea\"]");
    private String translate;

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void input(String russian){
        searchDiv.sendKeys(russian);
    }

    public void checking_translation(String english) {
        $(xpath("//p[@dir=\"ltr\"]//span[3]")).shouldBe(visible);
        final ElementsCollection span_translate = $$x("//p[@dir=\"ltr\"]//span");
        List<String> translates = span_translate.texts();

        if (Collections.replaceAll(translates, "", " ")) {
            translate = String.join("", translates);
        }
        Assert.assertEquals(english, translate);
    }
}
