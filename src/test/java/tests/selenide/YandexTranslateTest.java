package tests.selenide;

import org.testng.annotations.Test;

import java.io.IOException;

public class YandexTranslateTest extends BaseTest {

    private final static String RUSSIAN = "Привет, мир";
    private final static String ENGLISH = "Hello, world";

    @Test
    public void translate() throws InterruptedException, IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        MainPage mainPage = new MainPage(System.getProperty("URL"));
        mainPage.input(RUSSIAN);
        Thread.sleep(2000);
        mainPage.checking_translation(ENGLISH);
    }
}
